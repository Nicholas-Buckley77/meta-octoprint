
SUMMARY = "Provides additional information about your Pi in the UI"
HOMEPAGE = "https://github.com/OctoPrint/OctoPrint-PiSupport"
AUTHOR = "Gina Häußge <gina@octoprint.org>"
LICENSE = "AGPL-3.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=73f1eb20517c55bf9493b7dd6e480788"

SRC_URI = "https://files.pythonhosted.org/packages/e9/80/05186711d918220ae3496e08a63c6136d5b6eebc1ae5ac2a389f23549444/OctoPrint-PiSupport-2023.10.10.tar.gz"
SRC_URI[md5sum] = "246ef0f0ca3d79abf758c023a4962af2"
SRC_URI[sha256sum] = "bb4ac0f70bcf612d95d85debf6716d6bc6708db13d5e5883e04abbe5b1d67eeb"

S = "${WORKDIR}/OctoPrint-PiSupport-2023.10.10"

RDEPENDS_${PN} = ""

inherit setuptools3
