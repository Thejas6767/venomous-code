package com.xworkz.phone.external;

import com.xworkz.phone.internal.SmartPhone;

public class PhoneRunner {
    public static void main(String[] args) {

        SmartPhone mySmartPhone = new SmartPhone();

        mySmartPhone.takePhoto();

        mySmartPhone.makeCall();
    }
}
