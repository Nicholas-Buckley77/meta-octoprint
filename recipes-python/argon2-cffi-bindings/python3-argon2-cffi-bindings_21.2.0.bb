
SUMMARY = "Low-level CFFI bindings for Argon2"
HOMEPAGE = "https://github.com/hynek/argon2-cffi-bindings"
AUTHOR = "Hynek Schlawack <hs@ox.cx>"
LICENSE = "CLOSED"
#LIC_FILES_CHKSUM = "file://LICENSE;md5=4642dfcbd13c1cc49e9f99df9de51ba1"

inherit python_hatchling pypi

SRC_URI += "file://0001-Ensure1-it-compiles-for-non-x86.patch"
SRC_URI[sha256sum] = "bb89ceffa6c791807d1305ceb77dbfacc5aa499891d2c55661c6459651fc39e3"

S = "${WORKDIR}/argon2-cffi-bindings-21.2.0"

DEPENDS += "\
    ${PYTHON_PN}-cffi \
    ${PYTHON_PN}-cffi-native \
    python3-argon2-cffi \
"
