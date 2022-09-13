package com.java.daicent.thread.tryhard.countdownn;

import java.util.concurrent.CountDownLatch;

public class ServiceTwo2 implements Runnable{
    private final CountDownLatch latch;

    public ServiceTwo2(CountDownLatch latch) {
        this.latch = latch;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Bắt đầu 2");
        latch.countDown();
    }
}
