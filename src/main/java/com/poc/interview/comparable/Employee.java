package com.poc.interview.comparable;

public class Employee implements Comparable<Employee>{

    int empId;
    String empName;

    Employee() { }

    Employee(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }

    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                '}';
    }

    @Override
    public int compareTo(Employee emp) {
        if(this.empId > emp.getEmpId()) {
            return 1;
        } else if(this.empId < emp.getEmpId()) {
            return -1;
        } else
            return 0;
    }
}
