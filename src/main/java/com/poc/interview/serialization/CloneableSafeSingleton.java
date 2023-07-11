package com.poc.interview.serialization;

public class CloneableSafeSingleton implements Cloneable{

    private static CloneableSafeSingleton instance = new CloneableSafeSingleton();

    private CloneableSafeSingleton() {}

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //throw new CloneNotSupportedException();
        return instance;
    }
}
