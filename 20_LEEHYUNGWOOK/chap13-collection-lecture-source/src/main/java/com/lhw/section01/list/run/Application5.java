package com.lhw.section01.list.run;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Application5 {

    public static void main(String[] args) {

        /*Quene*/
        // Queue<String> queue = new LinkedList<>();
//        PriorityQueue<String> queue = new PriorityQueue<>();
        PriorityQueue<String> queue = new PriorityQueue<>(Collections.reverseOrder());// 내림차순

        /*Queue에 데이터를 넣을 땐 offer메소드 사용*/
         queue.offer("first");
         queue.offer("second");
         queue.offer("third");
         queue.offer("fourth");
         queue.offer("fifth");

        System.out.println(queue.peek());
        System.out.println(queue.poll());

        System.out.println("queue = " + queue);
    }
}
