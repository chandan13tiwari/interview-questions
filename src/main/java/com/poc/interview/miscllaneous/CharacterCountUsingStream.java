package com.poc.interview.miscllaneous;

import java.util.Arrays;
import java.util.Collections;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterCountUsingStream {
    public static void main(String[] args) {
        String str = "AAAAAABBBCDD";

        System.out.println(
                Arrays.stream(str.split(""))
                        .collect(Collectors.toMap(Function.identity(), company -> 1, Math::addExact)) // Integer::sum can be used
        );
    }
}
