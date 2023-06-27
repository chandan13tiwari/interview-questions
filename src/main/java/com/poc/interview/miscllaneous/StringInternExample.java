package com.poc.interview.miscllaneous;

public class StringInternExample {
    public static void main(String[] args) {
        String str1 = "Chandan";
        String str2 = new String("Chandan");

        System.out.println(str1 == str2.intern());
        System.out.println("Golu".intern());
    }
}
