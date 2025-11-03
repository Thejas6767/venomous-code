package com.xworkz.salary.external;

import com.xworkz.salary.bridge.NetPay;

public class NetPayRunner {
    public static void main(String[] args) {
        NetPay netPay = (gross, tax) -> gross * (1.0 - tax);
        double grossPay = 6000.00;
        double taxRate = 0.25;
        double result = netPay.compute(grossPay, taxRate);
        System.out.println("Net Pay after 25% tax on $6000 gross: $" + String.format("%.2f", result));
    }
}