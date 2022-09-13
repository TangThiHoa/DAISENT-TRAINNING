package com.java.daicent.thread.tryhard.threadjoin;

public class ServiceOne implements Runnable{

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thứ 1");

    }
}
