SUMMARY = "OctoPrint provides a responsive web interface for controlling a 3D printer (RepRap, Ultimaker, ...)."
HOMEPAGE = "http://octoprint.org"

SECTION = "devel/python"

LICENSE = "AGPL-3.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=73f1eb20517c55bf9493b7dd6e480788"

TAG = "1.9.3"

SRCREV = "${TAG}"
PV = "${TAG}+git${SRCPV}"

PATCHTOOL = "git"
SRC_URI = "git://github.com/foosel/OctoPrint.git;protocol=https;nobranch=1 \
           file://config.yaml \
           file://octoprint.service \
           file://octoprint \
           file://pip-sudo \
"
S = "${WORKDIR}/git"

inherit python3-dir python3native setuptools3 systemd useradd

do_patch() {
    sed -i -e "s/markdown>=3.1,<3.2/markdown>=3.1/g" ${S}/setup.py
    sed -i -e "s/markupsafe>=1.1,<2.0/markupsafe>=1.1/g" ${S}/setup.py
    sed -i -e "s/rsa==4.0/rsa>=4.0/g" ${S}/setup.py
    sed -i -e "s/tornado==/tornado>=/g" ${S}/setup.py
}

do_install:append() {

    # ensure octoprint and it's config are correctly seen
    sed -i -e s:/etc:${sysconfdir}:g ${WORKDIR}/octoprint.service
    sed -i -e s:/etc:${sysconfdir}:g ${WORKDIR}/config.yaml
    sed -i -e 's: /sbin: ${base_sbindir}:g' ${WORKDIR}/octoprint
    sed -i -e 's: /bin: ${base_bindir}:g' ${WORKDIR}/octoprint
    sed -i -e s:/usr/bin:${bindir}:g ${WORKDIR}/octoprint

    # install the conffg file
    install -d ${D}${sysconfdir}/octoprint
    install -m 0644 ${WORKDIR}/config.yaml ${D}${sysconfdir}/octoprint/config.yaml
    chmod a+rw ${D}${sysconfdir}/octoprint/config.yaml

    #install the systemd service to run octoprint on startup
    install -d ${D}${systemd_unitdir}/system
    install -m 0644 ${WORKDIR}/octoprint.service ${D}${systemd_unitdir}/system

    #install the library for octoprint in the correct location
    install -d ${D}${localstatedir}/lib/octoprint
    chmod a+rw ${D}${localstatedir}/lib/octoprint

    #put octoprint into the sudoers file
    install -d -m 0750 ${D}${sysconfdir}/sudoers.d
    install -m 0644 ${WORKDIR}/octoprint ${D}${sysconfdir}/sudoers.d/

    #install command script that calls sudoed pip to install plugins
    install -d ${D}${bindir}
    install -m 0755 ${WORKDIR}/pip-sudo ${D}${bindir}

}

USERADD_PACKAGES = "${PN}"
USERADD_PARAM:${PN} = "--system --home ${localstatedir}/lib/octoprint/ -M -g nogroup -G dialout octoprint"

NATIVE_SYSTEMD_SUPPORT = "1"
SYSTEMD_PACKAGES = "${PN}"
SYSTEMD_SERVICE:${PN} = "octoprint.service"

FILES:${PN} += "${sysconfdir} ${localstatedir}"
CONFFILES:${PN} += "${sysconfdir}/octoprint/config.yaml"

pkg_postinst:${PN}:append () {
        chown -R octoprint $D${sysconfdir}/octoprint
}

PYTHON_DEPS = " \
    python3-argon2-cffi \
    python3-argon2-cffi-bindings \
    python3-async-timeout \
    python3-babel \
    python3-blinker \
    python3-cachelib \
    python3-certifi \
    python3-cffi \
    python3-charset-normalizer \
    python3-class-doc \
    python3-click \
    python3-colorlog \
    python3-deprecated \
    python3-emoji \
    python3-feedparser \
    python3-filetype \
    python3-flask \
    python3-flask-assets \
    python3-flask-limiter \
    python3-flask-babel \
    python3-flask-login \
    python3-frozendict \
    python3-future \
    python3-idna \
    python3-ifaddr \
    python3-importlib-metadata \
    python3-importlib-resources\
    python3-itsdangerous \
    python3-jinja2 \
    python3-limits \
    python3-markdown \
    python3-markdown-it-py \
    python3-markupsafe \
    python3-mdurl \
    python3-more-itertools \
    python3-netaddr \
    python3-netifaces \
    python3-netserver \
    python3-numpy \
    python3-octoprint-filecheck \
    python3-octoprint-firmwarecheck \
    python3-octoprint-pisupport \
    python3-ordered-set \
    python3-pip \
    python3-packaging \
    python3-passlib \
    python3-pathvalidate \
    python3-pkginfo \
    python3-psutil \
    python3-pycparser \
    python3-pydantic \
    python3-pygments \
    python3-pylru \
    python3-pyserial \
    python3-pytz \
    python3-pyyaml \
    python3-regex \
    python3-requests \
    python3-rich \
    python3-sarge \
    python3-semantic-version \
    python3-sentry-sdk \
    python3-sgmllib3k \
    python3-tornado \
    python3-typing-extensions \
    python3-unidecode \
    python3-urllib3 \
    python3-watchdog \
    python3-websocket-client \
    python3-werkzeug \
    python3-wrapt \
    python3-zeroconf \
    python3-zipp \
    python3-zipstream-ng \
"

DEPENDS += " \
    python3-pip-native \
    python3-markdown-native \
"

RDEPENDS:${PN} = " \
    ${PYTHON_DEPS} \
    sudo \
"

RRECOMMENDS:${PN} = "ffmpeg \
                     mjpg-streamer \
                     octoprint-nginx \
                    "
