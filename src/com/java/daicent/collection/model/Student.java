package com.java.daicent.collection.model;

import java.util.Map;
import java.util.Objects;

public class Student implements Comparable<Student> {
    private int id;
    private String nameStudent;
    private int age;
    private double coreAvgStudent;

    public Student() {
    }

    public Student(int id, String nameStudent, int age, double coreAvgStudent) {
        this.id = id;
        this.nameStudent = nameStudent;
        this.age = age;
        this.coreAvgStudent = coreAvgStudent;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public double getCoreAvgStudent() {
        return coreAvgStudent;
    }

    public void setCoreAvgStudent(double coreAvgStudent) {
        this.coreAvgStudent = coreAvgStudent;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Student) {
            Student student = (Student) o;
            if (this.id == student.getId() &&
                    this.nameStudent.equals(student.nameStudent) &&
                    this.coreAvgStudent == student.coreAvgStudent &&
                    this.age == student.age) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return getNameStudent().hashCode();
    }

    @Override
    public String toString() {
        return "nameStudent='" + nameStudent + '\'' +
                ", age=" + age +
                ", coreAvgStudent=" + coreAvgStudent;
    }

    @Override
    public int compareTo(Student o) {
        return 0;
    }
}
