package com.java.daicent.thread.tryhard.threadjoin;

public class Main {
    public static void main(String[] args) {
        Thread service1 = new Thread(new ServiceOne());
        Thread service2 = new Thread(new ServiceTwo());
        Thread service3 = new Thread(new ServiceThree());

        service1.start();
        service2.start();
        service3.start();

//        Sử dụng Thread.join () để đảm bảo rằng việc thực hiện chỉ luồng chính
//        / kết thúc các dịch vụ 3 đã được thực thi
        try {
            System.out.println(" Chờ 3 dịch vụ bắt đầu ... ");
            service2.join();
            service1.join();
            service3.join();
            System.out.println("Bắt đầu chạy ... ");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Xong!!!");
    }
    }

