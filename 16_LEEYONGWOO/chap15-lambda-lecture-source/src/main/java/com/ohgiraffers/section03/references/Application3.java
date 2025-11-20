package com.ohgiraffers.section03.references;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Application3 {
    public static void main(String[] args) {
        /**
         * Collection과 람다식 함께 사용
         *
         * JDK8에 추가된 default메소드 Iterable:forEach
         * JDK8에 추가된 default메소드 Collection:removeIf
         * JDK8에 추가된 default메소드 LIst:replaceAll
         */
        test1();
        /*
        * Map
        * JDK에 추가된 default메소드 Map:forEach
        * */
        test2();

    }

    private static void test2() {
        Map<Integer,String> map=new HashMap<>();
        map.put(1,"one");
        map.put(2,"two");
        map.put(3,"three");
        map.put(4,"four");
        map.put(5,"five");
        map.put(6,"six");
        map.put(7,"seven");
        map.put(8,"eight");
        map.put(9,"nine");
        map.put(10,"ten");
        System.out.println("map : "+map);
        System.out.println(map.get(1));
        System.out.println(map.get(11));
        System.out.println(map.getOrDefault(1,"홍길동"));
        System.out.println(map.getOrDefault(11,"홍길동전"));

        /*해당 key가 존재하지 않을 경우 key-value생성*/
        map.computeIfAbsent(11,(k)->"James");
        System.out.println("map : "+map);

        /*해당 key가 존재한다면 수정할 수 있다.*/
        map.computeIfPresent(5,(k,v)->"Karl");
        System.out.println("map : "+map);


    }

    private static void test1() {
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<10;i++){
            list.add(i+1);
        }
//        for(Integer i : list){
//            System.out.println(i);
//        }
        list.forEach(i-> System.out.print(i+" "));
        System.out.println();
        /*2의 배수 제거*/
        list.removeIf(i->i%2==0);
        list.forEach(i-> System.out.print(i+" "));
        System.out.println();

        list.replaceAll(i->i*2);
        list.forEach(i-> System.out.print(i+" "));
        System.out.println();
    }
}
