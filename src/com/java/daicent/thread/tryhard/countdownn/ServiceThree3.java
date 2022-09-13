package com.java.daicent.thread.tryhard.countdownn;

import java.util.concurrent.CountDownLatch;

public class ServiceThree3 implements Runnable{

    private final CountDownLatch latch;

    public ServiceThree3(CountDownLatch latch) {
        this.latch = latch;
    }


    @Override
    public void run() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Bắt đầu 3");
        latch.countDown();

    }
}
