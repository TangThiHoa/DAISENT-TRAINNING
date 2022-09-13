package com.java.daicent.collection.model;

import java.util.Objects;

public class Subject {
    private int id;
    private String nameSubject;

    public Subject() {
    }

    public Subject(int id, String nameSubject) {
        this.id = id;
        this.nameSubject = nameSubject;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameSubject() {
        return nameSubject;
    }

    public void setNameSubject(String nameSubject) {
        this.nameSubject = nameSubject;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Subject subject = (Subject) o;
        return id == subject.id && Objects.equals(nameSubject, subject.nameSubject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nameSubject);
    }

    @Override
    public String toString() {
        return "nameSubject='" + nameSubject;
    }
}
