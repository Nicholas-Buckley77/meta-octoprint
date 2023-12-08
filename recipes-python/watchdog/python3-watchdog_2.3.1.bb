
SUMMARY = "Filesystem events monitoring"
HOMEPAGE = "https://github.com/gorakhargosh/watchdog"
AUTHOR = "Yesudeep Mangalapilly <yesudeep@gmail.com>"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

SRC_URI = "https://files.pythonhosted.org/packages/a5/17/a31fc6b90ff861a27debd0650bfbca17e074fdc3e037f392872fad76c726/watchdog-2.3.1.tar.gz"
SRC_URI[md5sum] = "a1c410a91204340adfb231a4909f70d1"
SRC_URI[sha256sum] = "d9f9ed26ed22a9d331820a8432c3680707ea8b54121ddcc9dc7d9f2ceeb36906"

S = "${WORKDIR}/watchdog-2.3.1"

RDEPENDS_${PN} = ""

inherit setuptools3
