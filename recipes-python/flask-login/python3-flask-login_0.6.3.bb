
SUMMARY = "User authentication and session management for Flask."
HOMEPAGE = "https://github.com/maxcountryman/flask-login"
AUTHOR = "Matthew Frazier <leafstormrush@gmail.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8aa87a1cd9fa41d969ad32cfdac2c596"

SRC_URI = "https://files.pythonhosted.org/packages/c3/6e/2f4e13e373bb49e68c02c51ceadd22d172715a06716f9299d9df01b6ddb2/Flask-Login-0.6.3.tar.gz"
SRC_URI[md5sum] = "689564b8b7f3782f0db382b7aa85bbc2"
SRC_URI[sha256sum] = "5e23d14a607ef12806c699590b89d0f0e0d67baeec599d75947bf9c147330333"

S = "${WORKDIR}/Flask-Login-0.6.3"

RDEPENDS:${PN} = "python3-flask python3-werkzeug"

inherit setuptools3
