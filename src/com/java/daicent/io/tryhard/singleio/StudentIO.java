package com.java.daicent.io.tryhard.singleio;

import java.io.*;

public class StudentIO {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student student0 = new Student(1,"Hoa",12,8.9);
        Student student1 = new Student(2,"Hoang",18,7.9);
        Student student2 = new Student(3,"Hung",22,9.9);
        Object obj = null;
        //Ghi file
        FileOutputStream fileOutputStream = new FileOutputStream("student.txt");
        ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
        outputStream.writeObject(student0);  //ghi 1 đối tượng đơn duy nhất
        outputStream.close();;
        fileOutputStream.close();

        //Đọc file
        FileInputStream fileInputStream = new FileInputStream("student.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        // Đọc đối tượng
        obj = objectInputStream.readObject();
        objectInputStream.close();
        fileInputStream.close();

        if (obj == null){
            System.out.println("Không có gì");

        }else {
            System.out.println(obj);
        }



    }
}
