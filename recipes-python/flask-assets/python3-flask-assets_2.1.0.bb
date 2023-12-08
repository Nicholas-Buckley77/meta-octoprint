SUMMARY = "Flask webassets integration."
HOMEPAGE = "http://flask-assets.readthedocs.org/en/latest/"

PYPI_PACKAGE = "Flask-Assets"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=2c0c455026ee819a9365678bea8b2c82"
SRC_URI[sha256sum] = "f84d6532ffe59c9ff352885e8740ff4da25c0bcfacd805f0a806815e44354813"

inherit pypi setuptools3

RDEPENDS:${PN} = "python3-webassets"
