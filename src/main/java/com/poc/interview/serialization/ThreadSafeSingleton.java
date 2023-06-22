package com.poc.interview.serialization;

final public class ThreadSafeSingleton {

    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton() {}

    public static ThreadSafeSingleton getInstance() {
        if(null == instance) {
            synchronized (ThreadSafeSingleton.class) {
                if(null == instance) {
                    instance = new ThreadSafeSingleton();
                }
            }
        }

        return instance;
    }
}
