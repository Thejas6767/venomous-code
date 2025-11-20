package com.xworkz.bookpublish.event;

public class DeadlineMissedException extends Exception {
    public DeadlineMissedException() {
        System.err.println("DeadlineMissedException ");
    }
}