package com.xworkz.device.external;


import com.xworkz.device.internal.SmartPhone;

public class DeviceRunner {
    public static void main(String[] args) {

        SmartPhone myPhone = new SmartPhone();

        myPhone.useInternet();

        myPhone.makeCall();

        myPhone.powerOn();
    }
}