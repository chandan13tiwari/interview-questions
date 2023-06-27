package com.poc.interview.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
    String name;

    public Student() {}

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}

class SortByStudentName implements Comparator<Student> {

    @Override
    public int compare(Student student1, Student student2) {
        return student1.name.compareTo(student2.name);
    }
}


public class ComparatorQuestions {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student("Golu"));
        studentList.add(new Student("Chandan"));
        studentList.add(new Student("Manisha"));
        studentList.add(new Student("Vineeta"));

        studentList.add(new Student());
        //studentList.add(null); // it will add null
        //studentList.add(null); // again it will add null

        System.out.println(studentList);

        Collections.sort(studentList, new SortByStudentName());

        System.out.println(studentList);
    }
}
