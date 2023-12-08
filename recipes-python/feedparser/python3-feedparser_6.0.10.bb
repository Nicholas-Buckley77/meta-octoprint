SUMMARY = "Python Atom and RSS feed parser"
LICENSE = "CLOSED"
#LIC_FILES_CHKSUM = "file://LICENSE;md5=4dd024c5a568d41577d68c900f653171"

PYPI_PACKAGE = "feedparser"
SRC_URI[md5sum] = "45716da638688577c7b0587a0a839a21"
SRC_URI[sha256sum] = "27da485f4637ce7163cdeab13a80312b93b7d0c1b775bef4a47629a3110bca51"

inherit pypi setuptools3

RDEPENDS:${PN} += " \
    ${PYTHON_PN}-codecs \
    ${PYTHON_PN}-email \
    ${PYTHON_PN}-html \
    ${PYTHON_PN}-netserver \
    ${PYTHON_PN}-sgmllib3k \
    ${PYTHON_PN}-stringold \
"

