
SUMMARY = "A simple immutable dictionary"
HOMEPAGE = "https://github.com/Marco-Sulla/python-frozendict"
AUTHOR = "Marco Sulla <marcosullaroma@gmail.com>"
LICENSE = "LGPL-3.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3000208d539ec061b899bce1d9ce9404"

SRC_URI = "https://files.pythonhosted.org/packages/c8/0b/5892fa56dca4a3f133f317f5e1e59d99916d649b4d47b7408bae7ac26b1a/frozendict-2.3.10.tar.gz"
SRC_URI[md5sum] = "14b5ebac02d85261315668ffcd24b21a"
SRC_URI[sha256sum] = "aadc83510ce82751a0bb3575231f778bc37cbb373f5f05a52b888e26cbb92f79"

S = "${WORKDIR}/frozendict-2.3.10"

RDEPENDS:${PN} = ""

inherit setuptools3
