package com.poc.interview.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee {
    int id;
    String name;
    String dept;
    long salary;

    public Employee(int id, String name, String dept, long salary) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }

    @Override
    public String toString(){
        return "id: " + this.id + ", name: " + this.name + ", dept: " + this.dept + ", salary: " + this.salary;
    }
}

public class FilterNameStartsWithA {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(1, "Chandan", "Tax", 14000));
        employeeList.add(new Employee(2, "Golu", "Finance", 20000));
        employeeList.add(new Employee(3, "Manisha", "Tax", 70000));
        employeeList.add(new Employee(4, "Kamal", "Security", 80000));
        employeeList.add(new Employee(5, "Vineeta", "Security", 90000));
        employeeList.add(new Employee(6, "Rohit", "Finance", 9000));
        employeeList.add(new Employee(7, "Aman", "Finance", 90000));

        System.out.println(employeeList);

        // find all employee with salary > 15000 and group them by their dept
        System.out.println(
                employeeList.stream()
                        .filter(employee -> employee.salary > 15000)
                        .collect(Collectors.groupingBy(employee -> employee.dept))
        );

        // find all employee with salary > 15000 and group them by their dept and employee name should starts with A
        System.out.println(
                employeeList.stream()
                        .filter(employee -> employee.salary > 15000 && (employee.name.charAt(0) == 'a' || employee.name.charAt(0) == 'A'))
                        .collect(Collectors.groupingBy(employee -> employee.dept))
        );

    }
}
