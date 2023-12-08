
SUMMARY = "Read resources from Python packages"
HOMEPAGE = "https://github.com/python/importlib_resources"
AUTHOR = "Barry Warsaw <barry@python.org>"
LICENSE = "CLOSED"
#LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"


inherit python_hatchling pypi

PYPI_PACKAGE = "importlib_resources"


SRC_URI[sha256sum] = "3893a00122eafde6894c59914446a512f728a0c1a45f9bb9b63721b6bacf0b4a"

S = "${WORKDIR}/importlib_resources-6.1.1"

RDEPENDS:${PN} = ""

DEPENDS += "\
"

