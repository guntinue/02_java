package com.lhw.section01.thread;

public class Application {

    public static void main(String[] args) {

        Thread t1 = new Car();
        Thread t2 = new Tank();
//        Thread t3 = new Plane(); //Runnable만 가지고 있어서 타입오류
        Thread t3 = new Thread(new Plane());


        System.out.println("t1 우선순위: " + t1.getPriority());
        System.out.println("t2 우선순위: " + t2.getPriority());
        System.out.println("t3 우선순위: " + t3.getPriority());

        t1.setPriority(Thread.MAX_PRIORITY); //우선순위 값을 수정해준다.
        t2.setPriority(Thread.MIN_PRIORITY); //

        t1.run();
        t2.run();
        t3.run();

        t1.start();
        t2.start();
        t3.start();


    }
}
