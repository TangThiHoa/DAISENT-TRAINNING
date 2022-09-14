package com.java.daicent.io;

import java.io.*;

public class DemoInputStream {
    public static void main(String[] args) throws IOException {
        //Khai báo đối tượng file
        File file = new File("demo.txt");
        InputStream inputStream = new FileInputStream(file);
        //tạo luồng làm việc với file
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        //tạo ra object để đọc luồng đấy
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        //tạo bộ đệm tải trước dữ liệu

        String line = " ";
        while ((line = bufferedReader.readLine()) != null) {
           //readline : nhận biết dấu enter, khi nào có dấu enter thì nó sẽ kết thúc đọc
            System.out.println(line);
        }
    }
}
