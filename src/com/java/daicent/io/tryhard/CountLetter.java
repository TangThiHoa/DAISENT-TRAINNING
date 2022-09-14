package com.java.daicent.io.tryhard;
import java.io.*;

public class CountLetter {
        public static long fileGetSize(String name) {
        File file= new File(name);
        if (!file.exists()||!file.isFile()){
            System.out.println("không tồn tại");
            return -1;
        }
        return file.length();
        }
    public static void main(String[] args) {
        long size = fileGetSize("demo.txt");
        System.out.println(size);
    }

}