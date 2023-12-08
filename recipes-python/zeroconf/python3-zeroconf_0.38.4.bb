SUMMARY = "A least recently used (LRU) cache implementation"
SECTION = "devel/python"

HOMEPAGE = "https://pypi.python.org/pypi/zeroconf/"

LICENSE = "CLOSED"
#LIC_FILES_CHKSUM = "file://COPYING;md5=27818cd7fd83877a8e3ef82b82798ef4"

SRC_URI[sha256sum] = "080c540ea4b8b9defa9f3ac05823c1725ea2c8aacda917bfc0193f6758b95aeb"

inherit pypi setuptools3

RDEPENDS:${PN} += "${PYTHON_PN}-ifaddr"