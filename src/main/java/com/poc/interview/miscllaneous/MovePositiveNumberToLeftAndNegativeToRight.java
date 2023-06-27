package com.poc.interview.miscllaneous;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MovePositiveNumberToLeftAndNegativeToRight {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1, -3, -2, 4, -6, 2, 5, 9));

        Collections.sort(list);
        Collections.reverse(list);

        System.out.println(list);
    }
}
