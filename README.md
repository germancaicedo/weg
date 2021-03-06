# WEG - Wearable Excursion Gear

## Getting Started

Before we start, you will need to do the following steps in the order laid out to ensure a clean installation of WEG

[Download Raspbian - Jessie - Build Data: 2016-03-18](http://downloads.raspberrypi.org/raspbian/images/raspbian-2016-03-18/)

##  Installing Raspbian 

[OS Installation](https://www.raspberrypi.org/documentation/installation/installing-images/README.md)

##  Download and Install WEG

`git clone https://github.com/mgarcia01752/weg.git`

`cd weg`

**Backup and Configure for WEG**

`sudo su ` 

`mv /boot/config.txt /boot/config.txt~`

`mv /boot/cmdline.txt /boot/cmdline.txt~`

`cp /home/pi/weg/RaspberryPiConfig/* /boot`

`init 6`

## Java Oracle Hotspot

`sudo apt-get --purge remove openjdk-7-jre` 

`sudo apt-get --purge remove openjdk-7-jdk`

`sudo apt-get install oracle-java7-jdk`

**Check Installation**

`java -version`

**Response**

java version "1.8.0_65"

Java(TM) SE Runtime Environment (build 1.8.0_65-b17)

Java HotSpot(TM) Client VM (build 25.65-b01, mixed mode)

##  Download and Install Tangram-es

`cd /home/pi/weg`

`sudo apt-get install cmake`

`sudo apt-get update`

`sudo apt-get install cmake g++-4.7 libcurl4-openssl-dev`

`git clone https://github.com/tangrams/tangram-es.git`

`export CXX=/usr/bin/g++-4.9`

`cd tangram-es`

`git submodule init && git submodule update`

`git submodule update --init --recursive`

`make rpi`


##  Download and Install WiringPi

`cd /home/pi/weg`

`git clone git://git.drogon.net/wiringPi`

`cd wiringPi`

`git pull origin`

`./build`

##  Install UART Serial IPC

`cd /home/pi/weg/uart-serial-ipc`

`make DamCommSocket`




