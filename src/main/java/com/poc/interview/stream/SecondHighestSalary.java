package com.poc.interview.stream;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SecondHighestSalary {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Chandan", 1200);
        map.put("Manisha", 1400);

        System.out.println(map.entrySet().stream()
                .collect(Collectors.groupingBy(Map.Entry::getValue, Collectors.mapping(Map.Entry::getKey, Collectors.toList())))
                .entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
                .toList()
                .get(1));
    }
}
