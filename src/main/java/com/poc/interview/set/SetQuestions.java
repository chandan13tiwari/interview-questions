package com.poc.interview.set;

import java.util.HashSet;
import java.util.Set;

class Country {
    String name;

    public Country(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return this.name;
    }
}

public class SetQuestions {
    public static void main(String[] args) {
        Set set = new HashSet();

        set.add("Chandan"); // true
        set.add("Chandan"); // false
        set.add(new String("Golu")); // true
        set.add(new String("Golu")); // false - use by default equals()
        set.add(new Country("India")); // true
        set.add(new Country("India")); // true - need to implement our equals()

        set.add(null); // true
        set.add(null); // false

        System.out.println(set);
    }
}
