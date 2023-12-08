
SUMMARY = "Rate limiting for flask applications"
HOMEPAGE = "https://flask-limiter.readthedocs.org"
AUTHOR = "Ali-Akber Saifee <ali@indydevs.org>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=2455d5e574bc0fc489411ca45766ac78"

SRC_URI = "https://files.pythonhosted.org/packages/7f/03/dae2279d45982b603ea001dcc1a4d0d6cc7f383c9f52a2e1563fcff6d1c4/Flask-Limiter-3.5.0.tar.gz"
SRC_URI[md5sum] = "33ed61a71e299b86be920b2ef0850800"
SRC_URI[sha256sum] = "13a3491b994c49f7cb4706587a38ca47e8162b576530472df38be68104f299c0"

S = "${WORKDIR}/Flask-Limiter-3.5.0"

RDEPENDS:${PN} = "python3-limits python3-flask python3-ordered-set python3-rich python3-typing-extensions"

inherit setuptools3
