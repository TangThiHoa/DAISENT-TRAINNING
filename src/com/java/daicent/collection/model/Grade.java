package com.java.daicent.collection.model;


import java.util.Objects;


public class Grade {
    private int id;
    private String nameGrade;

    public Grade() {
    }

    public Grade(int id, String nameGrade) {
        this.id = id;
        this.nameGrade = nameGrade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameGrade() {
        return nameGrade;
    }

    public void setNameGrade(String nameGrade) {
        this.nameGrade = nameGrade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Grade grade = (Grade) o;
        return id == grade.id && Objects.equals(nameGrade, grade.nameGrade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nameGrade);
    }

    @Override
    public String toString() {
        return  nameGrade ;
    }
}
