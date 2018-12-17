SUMMARY = "Nick is cool."

IMAGE_INSTALL = "packagegroup-core-boot ${CORE_IMAGE_EXTRA_INSTALL}"

IMAGE_INSTALL += "kernel-modules"
IMAGE_INSTALL += "linux-firmware-bcm43430"

IMAGE_INSTALL += "usbutils"
IMAGE_INSTALL += "pciutils"


IMAGE_FEATURES += "debug-tweaks"
IMAGE_FEATURES += "ssh-server-dropbear"

IMAGE_LINGUAS = " "

LICENSE = "MIT"

inherit core-image
