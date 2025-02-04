SUMMARY = "Data validation and settings management using Python type hinting"
HOMEPAGE = "https://github.com/samuelcolvin/pydantic"
LICENSE = "CLOSED"
#LIC_FILES_CHKSUM = "file://LICENSE;md5=09280955509d1c4ca14bae02f21d49a6"

inherit pypi python_hatchling

SRC_URI[sha256sum] = "0fe8a415cea8f340e7a9af9c54fc71a649b43e8ca3cc732986116b3cb135d303"

DEPENDS += "python3-hatch-fancy-pypi-readme-native"

RDEPENDS:${PN} += "\
    python3-core \
    python3-datetime \
    python3-image \
    python3-io \
    python3-json \
    python3-logging \
    python3-netclient \
    python3-numbers \
    python3-profile \
    python3-typing-extensions \
"
