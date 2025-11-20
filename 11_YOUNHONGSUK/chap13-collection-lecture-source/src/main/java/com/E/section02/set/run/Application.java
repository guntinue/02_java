package com.E.section02.set.run;

import java.util.HashSet;
import java.util.Iterator;

public class Application {

    public static void main(String[] args) {

     HashSet<String> hs = new HashSet<>();
     //Set은 중복을 허용하지 않는다, null또한 하나의 null만 저장한다

        hs.add(new String ("java"));
        hs.add(new String ("mariaDB"));
        hs.add(new String ("servlet"));
        hs.add(new String ("Spring"));
        hs.add(new String ("html"));


        System.out.println(hs);
//Set에 저장된 자료는 넣는 순서를 보장할 수 없다
        hs.add(new String ("java"));
        hs.add(new String ("mariaDB"));
        System.out.println(hs.iterator().next());

        /*Set의 데이터를 순회하는 방법
        * 1. 배열로 변경*/
       Object[] a = hs.toArray();
        for(int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }

        /*2. Iterator의 iterator 메소드 사용*/
        Iterator<String> it = hs.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
            it.remove();
        }
        System.out.println(hs);
        /*3. For Each loop*/
        for(String s: hs){
            System.out.println(s);
            // 반복 순회 도중 remove메소드를 사용시
            // java.util.ConcurrentException 발생
            // for each loop는 해당 객체를 건들지 못 함
        }
    }
}
