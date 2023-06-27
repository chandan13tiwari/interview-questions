package com.poc.interview.serialization;

import java.io.Serial;
import java.io.Serializable;

public class SerializableSafeSingleton implements Serializable {

    public static SerializableSafeSingleton instance = new SerializableSafeSingleton();

    private SerializableSafeSingleton() {}

    @Serial
    protected Object readResolve() {
        return instance;
    }
}
