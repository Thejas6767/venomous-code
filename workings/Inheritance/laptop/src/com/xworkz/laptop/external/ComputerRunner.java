package com.xworkz.laptop.external;

import com.xworkz.laptop.internal.Laptop;

public class ComputerRunner {
    public static void main(String[] args) {

        Laptop myLaptop = new Laptop();

        myLaptop.checkBattery();

        myLaptop.bootUp();
    }
}
