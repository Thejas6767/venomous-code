package com.xworkz.variables.external;

class ParameterVariableDemo {

    void greet(String name) {   // parameterized variable
        System.out.println("Hello " + name);
    }

    public static void main(String[] args) {
        ParameterVariableDemo obj = new ParameterVariableDemo();
        obj.greet("Thejas");
    }
}
