package com.poc.interview.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainApplication {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee(3, "Chandan"));
        employeeList.add(new Employee(5, "Manisha"));
        employeeList.add(new Employee(1, "Ashish"));
        employeeList.add(new Employee(4, "Rinku"));
        employeeList.add(new Employee(2, "Sonam"));

        // sorting employeeList based on their empId
        Collections.sort(employeeList);
        
        System.out.println(employeeList);
    }
}
