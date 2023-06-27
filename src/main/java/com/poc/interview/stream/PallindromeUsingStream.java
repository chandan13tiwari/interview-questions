package com.poc.interview.stream;

import java.util.stream.IntStream;

public class PallindromeUsingStream {
    public static void main(String[] args) {
        String str = "Chanahc".toLowerCase();

        System.out.println(
                IntStream.range(0, str.length()/2)
                        .noneMatch(i -> str.charAt(i) != str.charAt(str.length() - i- 1))

        );
    }
}
