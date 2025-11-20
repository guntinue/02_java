package com.E.section01.list.run;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Application5 {

    public static void main(String[] args) {

        /*Queue*/
        //Queue<String> q = new Queue<>();
        //Queue<String> q = new LinkedList<>();
        //LinkedList<String> q = new LinkedList<>();
        /*linkedList는 quque중에서도 deque에 해당되어 offerFirst(), offerList() 같은
        * 메소드도 제공한다*/

        //PriorityQueue<String> q = new PriorityQueue<>();
        // 스트링의 기준으로 오름차순으로 정렬함
        PriorityQueue<String> q = new PriorityQueue<>(Collections.reverseOrder());
        // 스트링의 기준으로 내림차순으로 정렬함

        q.offer("first");
        q.offer("second");
        q.offer("third");
        q.offer("fourth");
        q.offer("fifth");

        /*
        * peek() : 해당 큐의 가장 앞에 있는 요소(먼저 들어온) 반환
        * poll() : 해당 큐의 가장 앞에 있는 요소를 반환하고 제거
        * */

        System.out.println("que" + q.poll());
        System.out.println(q);
    }
}
