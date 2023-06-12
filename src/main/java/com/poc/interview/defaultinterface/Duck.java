package com.poc.interview.defaultinterface;

public interface Duck {

    void duckType();

    default void display() {
        System.out.println("Duck...");
    }
}
