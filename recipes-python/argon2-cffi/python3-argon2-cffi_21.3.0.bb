
SUMMARY = "Low-level CFFI bindings for Argon2"
HOMEPAGE = "https://github.com/hynek/argon2-cffi-bindings"
AUTHOR = "Hynek Schlawack <hs@ox.cx>"
LICENSE = "CLOSED"
#LIC_FILES_CHKSUM = "file://LICENSE;md5=4642dfcbd13c1cc49e9f99df9de51ba1"


inherit python_hatchling pypi
SRC_URI[sha256sum] = "d384164d944190a7dd7ef22c6aa3ff197da12962bd04b17f64d4e93d934dba5b"

UPSTREAM_CHECK_PYPI_PACKAGE  = "argon2-cffi"

S = "${WORKDIR}/argon2-cffi-21.3.0"

CLEANBROKEN="1"

DEPENDS += "\
    ${PYTHON_PN}-cffi \
    ${PYTHON_PN}-cffi-native \
"



inherit pypi

BBCLASSEXTEND = "native nativesdk"
