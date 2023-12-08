
SUMMARY = "A new and easy to use streamable zip file generator"
HOMEPAGE = ""
AUTHOR = " <>"
LICENSE = "CLOSED"
#LIC_FILES_CHKSUM = "file://LICENSE;md5=3000208d539ec061b899bce1d9ce9404"

PYPI_PACKAGE = "zipstream-ng"

SRC_URI[sha256sum] = "f92023b9ca578cd7fdd94ec733c65664ecf7ee32493e38cdf8e365a1316e9ffc"

S = "${WORKDIR}/zipstream-ng-1.7.1"

RDEPENDS_${PN} = ""

inherit pypi setuptools3
