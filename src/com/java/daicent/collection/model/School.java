package com.java.daicent.collection.model;

import java.util.List;
import java.util.Objects;

public class School {
    private int id ;
    private String nameSchool;


    public School() {
    }

    public School(int id, String nameSchool) {
        this.id = id;
        this.nameSchool = nameSchool;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameSchool() {
        return nameSchool;
    }

    public void setNameSchool(String nameSchool) {
        this.nameSchool = nameSchool;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        School school = (School) o;
        return id == school.id && Objects.equals(nameSchool, school.nameSchool);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nameSchool);
    }

    @Override
    public String toString() {
        return nameSchool;

    }
}
