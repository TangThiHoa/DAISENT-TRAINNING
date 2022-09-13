package com.java.daicent.thread.tryhard.countdownn;

import java.util.concurrent.CountDownLatch;

public class Main2 {
    public static void main(String[] args) {
        // Intialising Count Down Latch By 3, vì nó sẽ chờ 3 luồng để
        // Hoàn thành thực thi
        final CountDownLatch latch = new CountDownLatch(3);
        Thread service1 = new Thread(new ServiceOne1(latch));
        Thread service2 = new Thread(new ServiceTwo2(latch));
        Thread service3 = new Thread(new ServiceThree3(latch));
        service1.start();
        service2.start();
        service3.start();

        // Chốt chờ cho đến khi số đếm trở thành 0
        // theo cách này chúng ta có thể đảm bảo rằng việc thực hiện chỉ chủ đề chính
        // kết thúc các dịch vụ 3 đã được thực thi
        try {
            System.out.println("3 dịch vụ đang chờ ... ");
            latch.await();
            System.out.println("Luồng khởi chạy ... ");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Xong!!!");
    }
}
