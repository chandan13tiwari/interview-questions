package com.poc.interview.defaultinterface;

public class MainApplication {
    public static void main(String[] args) {
        Duck duck = new RubberDuck();
        duck = new DecoyDuck();
        System.out.print("I'm a ");
        duck.duckType();
        duck.display();
    }
}
