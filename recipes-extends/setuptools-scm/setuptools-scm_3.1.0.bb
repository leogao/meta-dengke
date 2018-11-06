# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=838c366f69b72c5df05c96dff79b35f2"

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"
RDEPENDS_${PN} += "python-core"

SRCREV = "3ef897a0983dfde7fdfe56a2e9f5f304acdec43e"
SRC_URI = "git://github.com/pypa/setuptools_scm.git"

S = "${WORKDIR}/git"

inherit setuptools

# The autotools configuration I am basing this on seems to have a problem with a race condition when parallel make is enabled
PARALLEL_MAKE = ""

# WARNING: the following rdepends are determined through basic analysis of the
# python sources, and might not be 100% accurate.
BBCLASSEXTEND = "native nativesdk"
