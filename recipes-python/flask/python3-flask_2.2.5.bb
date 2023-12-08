SUMMARY = "A microframework based on Werkzeug, Jinja2 and good intentions"
DESCRIPTION = "\
Flask is a microframework for Python based on Werkzeug, Jinja 2 and good \
intentions. And before you ask: It’s BSD licensed!"
HOMEPAGE = "https://github.com/mitsuhiko/flask/"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.rst;md5=ffeffa59c90c9c4a033c7574f8f3fb75"

PYPI_PACKAGE = "Flask"

SRC_URI[md5sum] = "bbca6fb017f4d338cfddfd673e203779"
SRC_URI[sha256sum] = "edee9b0a7ff26621bd5a8c10ff484ae28737a2410d99b0bb9a6850c7fb977aa0"

inherit pypi python_setuptools_build_meta


RDEPENDS:${PN} = " \
    ${PYTHON_PN}-blinker \
    ${PYTHON_PN}-click \
    ${PYTHON_PN}-itsdangerous \
    ${PYTHON_PN}-jinja2 \
    ${PYTHON_PN}-profile \
    ${PYTHON_PN}-werkzeug \
"
