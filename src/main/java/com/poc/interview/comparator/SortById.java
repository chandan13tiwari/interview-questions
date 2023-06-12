package com.poc.interview.comparator;

import java.util.Comparator;

public class SortById implements Comparator<Employee> {
    @Override
    public int compare(Employee emp1, Employee emp2) {
        return emp1.getEmpId() - emp2.getEmpId();
    }
}
