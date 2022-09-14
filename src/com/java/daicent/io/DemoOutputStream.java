package com.java.daicent.io;

import java.io.*;

public class DemoOutputStream {
    public static void main(String[] args) throws IOException {
        String a[] = new String[4];
        a[0] = "Beo";
        a[1] = "Son";
        a[2] = "Hung";
        a[3] = "Huy";
        

        File file = new File("C02.txt");
        OutputStream outputStream = new FileOutputStream(file);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
        for (String item: a) {
            outputStreamWriter.write(item);
            outputStreamWriter.flush();
        }




    }
}
