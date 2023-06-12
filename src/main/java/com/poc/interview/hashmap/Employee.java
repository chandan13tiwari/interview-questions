package com.poc.interview.hashmap;

import java.util.Objects;

public class Employee {
    int empId;
    String empName;

    Employee() {}

    Employee(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }

    @Override
    public boolean equals(Object o) {
        return true;
    }

    @Override
    public int hashCode() {
        return this.empId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                '}';
    }
}
