package com.lhw.section03.sync;

public class Buffer {
    private int data;
    private boolean empty = false;

    public synchronized void getData(){

        if(empty){ //empty 가 True가 되면 여기 들어온다. 비어있으면 자원을 가져가서는 안된다.
            System.out.println("getData wait");
            try {
                /* 실행 중인 스레드를 일시 정지 시킨다. 다른 스레드에서 notify()가 호출 되면 깨어나게 된다. */
                wait(); //소비하는 입장에서 비어있지 않아야 한다.-> 대기
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("소비자 : " + data + " 번 상품을 소비하였습니다.");
        empty = true;

        /* 대기 중인 스레드를 하나 깨워서 다시 실행 대기 상태로 전환 시킨다. */
        notify();
    }

    public synchronized void setData(int data){

        if(!empty) { // 비어있지 않으면 정지시킨다.  -> 자원이 있는데 또 만들지 않는다. -> 자원이 고갈되면 그 때 notify() 를 통해 생성한다.
            System.out.println("setData wait");
            try {
                /* 실행 중인 스레드를 일시 정지 시킨다. 다른 스레드에서 notify()가 호출 되면 깨어나게 된다. */
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        this.data = data;
        System.out.println("생산자 : " + data + " 번 상품을 생산하였습니다.");
        empty = false;

        /* 대기 중인 스레드를 하나 깨워서 다시 실행 대기 상태로 전환 시킨다. */
        notify();
    }
}
