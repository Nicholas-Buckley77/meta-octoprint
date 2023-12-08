
SUMMARY = "Rate limiting utilities"
HOMEPAGE = "https://limits.readthedocs.org"
AUTHOR = "Ali-Akber Saifee <ali@indydevs.org>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=2455d5e574bc0fc489411ca45766ac78"

SRC_URI = "https://files.pythonhosted.org/packages/9c/ed/c4c3838e7697fa7906bbf3c7fa8fad3ec0a9667071c17f2f17d2f5e601ca/limits-3.7.0.tar.gz"
SRC_URI[md5sum] = "8a46097894269ee6932267b0861a897a"
SRC_URI[sha256sum] = "124c6a04d2f4b20990fb1de019eec9474d6c1346c70d8fd0561609b86998b64a"

S = "${WORKDIR}/limits-3.7.0"

RDEPENDS:${PN} = "python3-deprecated python3-importlib-resources python3-packaging python3-typing-extensions"

inherit setuptools3
