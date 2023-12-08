DESCRIPTION = "Implements a XML/HTML/XHTML Markup safe string for Python"
HOMEPAGE = "http://github.com/mitsuhiko/markupsafe"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.rst;md5=ffeffa59c90c9c4a033c7574f8f3fb75"

SRC_URI[sha256sum] = "af598ed32d6ae86f1b747b82783958b1a4ab8f617b06fe68795c7f026abbdcad"

PYPI_PACKAGE = "MarkupSafe"
inherit pypi setuptools3
inherit ${@bb.utils.filter('DISTRO_FEATURES', 'ptest', d)}

RDEPENDS:${PN} += "${PYTHON_PN}-stringold"

BBCLASSEXTEND = "native nativesdk"


RDEPENDS:${PN}-ptest += " \
	${PYTHON_PN}-pytest \
"

