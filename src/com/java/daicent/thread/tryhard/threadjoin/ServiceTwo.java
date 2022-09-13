package com.java.daicent.thread.tryhard.threadjoin;

public class ServiceTwo implements Runnable{

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thứ 2");
    }
}
