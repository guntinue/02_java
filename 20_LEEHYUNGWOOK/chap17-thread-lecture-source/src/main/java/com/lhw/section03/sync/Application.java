package com.lhw.section03.sync;

public class Application {

    public static void main(String[] args) {

        Buffer buffer = new Buffer();

        Thread b1 = new Producer(buffer);
        Thread b2 = new Consumer(buffer);
        // 동일한 인스턴스에 대해 공유하는 스레드 두 개를 생성한다.

        b1.start();
        b2.start();
    }
}
