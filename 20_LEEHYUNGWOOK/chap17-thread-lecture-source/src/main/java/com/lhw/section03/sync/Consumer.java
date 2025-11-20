package com.lhw.section03.sync;

public class Consumer extends Thread {
    /*자원 소비*/
    private final Buffer criticalData;

    public Consumer(Buffer criticalData) { //객체타입의 값을 항상 가져오는 생성자
        this.criticalData = criticalData;
    }

    @Override
    public void run() {
        for(int i = 1; i <= 10; i++) {
            criticalData.getData(); // 값 가져오기

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
