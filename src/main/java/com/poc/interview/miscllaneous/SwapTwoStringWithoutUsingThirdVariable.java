package com.poc.interview.miscllaneous;

public class SwapTwoStringWithoutUsingThirdVariable {
    public static void main(String[] args) {
        String str1 = "Chandan";
        String str2 = "Tiwari";

        System.out.println("Before Swapping");
        System.out.println("String 1:" + str1);
        System.out.println("String 2:" + str2);

        str1 = str1.concat(str2);
        str2 = str1.substring(0, str1.length() - str2.length());
        str1 = str1.substring(str2.length());

        System.out.println("After Swapping");
        System.out.println("String 1:" + str1);
        System.out.println("String 2:" + str2);
    }
}
