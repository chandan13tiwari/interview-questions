package com.poc.interview.stream;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Java Developer";
        StringBuilder output = new StringBuilder();
        String[] strArray = str.split(" ");

        for(int i=strArray.length-1; i>=0; i--) {
            output.append(reverseStringUsingStreamOf(strArray[i]));
            output.append(" ");
        }

        System.out.println(output.toString().trim());

        System.out.println(new StringBuilder(str).reverse());
    }

    public static String reverseStringUsingStreamOf(String str) {
        return Stream.of(str)
                .map(string -> new StringBuilder(string).reverse())
                .collect(Collectors.joining());
    }

    public static String reverseStringUsingStreamReduce(String str) {
        return str.chars()
                .mapToObj(c -> (char) c)
                .reduce("", (a, b) -> b + a, (a2, b2) -> b2 + a2);
    }
}
