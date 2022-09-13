package com.java.daicent.collection.model;


import java.util.Map;

import java.util.Set;

public class Clazz {
    private int id;
    private String nameClazz;

    public Clazz() {
    }

    public Clazz(int id, String nameClazz) {
        this.id = id;
        this.nameClazz = nameClazz;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameClazz() {
        return nameClazz;
    }

    public void setNameClazz(String nameClazz) {
        this.nameClazz = nameClazz;
    }

    @Override
    public boolean equals(Object o) {
       if (o instanceof Clazz) {
           Clazz clazz = (Clazz) o;
           if (this.id == clazz.getId()&&
                   this.nameClazz.equals(clazz.nameClazz)){
               return true;
           }

       }
        return false;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nameClazz == null) ? 0 : nameClazz.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return  nameClazz;
    }
}
