package com.lhw.section01.thread;

public class Car extends Thread{

    /*Car 스레드로 수행할 작업 내용 작성하는 메소드*/
    @Override
    public void run() {
        for (int i=0; i<5; i++) {
            System.out.println("Car Driving....");
            /*의도적으로 지연시킨다.*/

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
