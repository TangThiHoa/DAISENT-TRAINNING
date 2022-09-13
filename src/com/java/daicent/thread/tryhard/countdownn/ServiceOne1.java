package com.java.daicent.thread.tryhard.countdownn;

import java.util.concurrent.CountDownLatch;

public class ServiceOne1 implements Runnable {

    private final CountDownLatch latch;

    public ServiceOne1(CountDownLatch latch) {
        this.latch = latch;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Bắt đầu 1");
        latch.countDown();
    }
}
