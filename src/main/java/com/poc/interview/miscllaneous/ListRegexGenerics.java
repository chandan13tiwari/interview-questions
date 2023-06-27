package com.poc.interview.miscllaneous;

import java.util.ArrayList;
import java.util.List;

class A {}

class B extends A {}

public class ListRegexGenerics {
    public static void main(String[] args) {
        List<? super A> l1 = new ArrayList<>();
        List<? extends B> l2 = new ArrayList<>();

        // l1 = l2;
        // l2 = l1;
        l1.add(new A());
        // l2.add(new B());
        l1.add(l2.get(0));
        // l2.add(l1.get(0));
    }
}
