package com.poc.interview.defaultinterface;

public class DecoyDuck implements Duck{
    @Override
    public void duckType() {
        System.out.print("Plastic Decoy");
    }

    @Override
    public void display() {
        System.out.println("Duck for hunting...");
    }
}
