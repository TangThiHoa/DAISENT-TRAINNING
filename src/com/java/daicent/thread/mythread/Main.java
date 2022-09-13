package com.java.daicent.thread.mythread;

import com.java.daicent.thread.mythread.MyThread1;
import com.java.daicent.thread.mythread.Mythread2;

public class Main {
    public static void main(String[] args) {
        MyThread1 thread1 = new MyThread1();
        Thread t = new Thread(thread1);

        Mythread2 mythread2 = new Mythread2();

        t.start();
        mythread2.start();
    }
}
