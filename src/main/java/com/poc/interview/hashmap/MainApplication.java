package com.poc.interview.hashmap;

import java.util.HashMap;
import java.util.Map;

public class MainApplication {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Chandan");
        Employee emp2 = new Employee(1, "Golu");

        Map<Employee, String> map = new HashMap<>();

        map.put(emp1, "Employee1");
        map.put(emp2, "Employee2");

        System.out.println(map);
    }
}
