package com.java.daicent.io.tryhard.singleio;

import java.io.Serializable;

public class Student implements Serializable {
    //Serializable dữ nguyên thứ tự các trường dữ liệu
    private int id;
    private String name;
    private int age;
    private double avgCore;

    public Student() {
    }

    public Student(int id, String name, int age, double avgCore) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.avgCore = avgCore;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getAvgCore() {
        return avgCore;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", avgCore=" + avgCore +
                '}';
    }
}
