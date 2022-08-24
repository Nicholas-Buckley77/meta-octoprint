SUMMARY = "A wrapper for subprocess which provides command pipeline functionality."
HOMEPAGE = "https://pypi.python.org/pypi/sarge"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5924d2983f7af7369130f6fe5dd597b7"
SRC_URI += "file://0001-setup.py-patch-to-setuptools.patch"
SRC_URI[sha256sum] = "64ff42ae6ef90acbded6318ed440ed63b31a669302fb60cf41265debea282a3d"

inherit pypi setuptools3
