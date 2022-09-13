package com.java.daicent.thread.tryhard.threadjoin;

public class ServiceThree implements Runnable{
    @Override
    public void run() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thứ 3");
    }
}
