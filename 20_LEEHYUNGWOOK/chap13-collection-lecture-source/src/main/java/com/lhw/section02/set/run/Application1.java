package com.lhw.section02.set.run;

import java.util.HashSet;
import java.util.Iterator;

public class Application1 {

    public static void main(String[] args) {

        HashSet<String> hset = new HashSet<String>();

        hset.add(new String("java"));
        hset.add(new String("mariaDB"));
        hset.add(new String("html"));
        hset.add(new String("servlet"));
        hset.add(new String("spring"));

        hset.add(new String("java"));
        hset.add(new String("mariaDB"));
        hset.add(new String("html"));

        System.out.println("hset : " + hset);

        /*1. 배열*/
        Object[] arr = hset.toArray(); //다형성 이용해서 오브젝트 타입의 배열 선언
        for (int i = 0; i< arr.length; i++) {
            System.out.println("arr[i] = " + arr[i]);
        }
        
        /*2. Iterable iterator 메소드*/
        Iterator<String> iter = hset.iterator();
        while(iter.hasNext()) {
            System.out.println("iter.next() = " + iter.next());
        }

        /*3. 향상된 for문*/
        for (String str : hset) {
            System.out.println("str = " + str);
            //hset.remove(str); 오류
        }
    }
}
