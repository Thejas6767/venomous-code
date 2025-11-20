package com.xworkz.testing.event;

public class SevereBugFoundException extends Exception {
    public SevereBugFoundException() {
        System.err.println("SevereBugFoundException ");
    }
}
