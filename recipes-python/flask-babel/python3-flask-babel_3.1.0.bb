SUMMARY = "Implements i18n and l10n support for Flask."
HOMEPAGE = "https://pypi.org/project/Flask-Babel/"


inherit python_poetry_core pypi

PYPI_PACKAGE = "flask_babel"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=51917f3e8e858f5ae295a7d0e2eb3cc9"
SRC_URI[sha256sum] = "be015772c5d7f046f3b99c508dcf618636eb93d21b713b356db79f3e79f69f39"


DEPENDS += "\
    ${PYTHON_PN}-babel \
    ${PYTHON_PN}-flask \
    ${PYTHON_PN}-speaklater \
"