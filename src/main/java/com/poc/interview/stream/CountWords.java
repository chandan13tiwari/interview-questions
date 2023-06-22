package com.poc.interview.stream;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class CountWords {
    public static void main(String[] args) {
        String str = "What is your name? My name is Chandan. Hi Chandan!";

        System.out.println(Arrays.toString(str.split("[\\s@&.?!$+-]+")));

        System.out.println(
                Arrays.stream(str.split("[\\s@&.?!$+-]+"))
                        .collect(Collectors.groupingBy(i -> i, Collectors.counting()))
                        .entrySet().stream()
                        .filter(i -> i.getValue() > 1)
                        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue))
        );
    }
}
