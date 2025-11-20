package com.lhw.section01.thread;

public class Tank extends Thread{
    public void run(){
        for (int i=0; i<1000; i++) {
            System.out.println("Tank Shooting....");
            /*의도적으로 지연시킨다.*/

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
