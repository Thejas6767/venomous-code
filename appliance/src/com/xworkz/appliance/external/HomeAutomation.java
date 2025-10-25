package com.xworkz.appliance.external;

import com.xworkz.appliance.internal.Appliance;
import com.xworkz.appliance.internal.PowerSource;
import com.xworkz.appliance.internal.Refrigerator;

public class HomeAutomation {
    public static void main(String[] args) {

        PowerSource homePower =  new PowerSource("120V AC", 15.0);
        Appliance myFridge = new Refrigerator("674632482364723", "Samsung", homePower);
        myFridge.displayApplianceInfo();
    }
}
