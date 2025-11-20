package com.lhw.section03.reference;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Application3 {

    public static void main(String[] args) {

        /*Collections 와 람다식 사용*/

        /*Iterable: foreach*/
        /*Collection: removeIf*/
        /*List: replaceAll*/
//        test1();

        /*Map*/
        /*JDK8에 추가된 default메소드 Map:forEach*/
        test2();

    }

    private static void test2() {
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Devic");
        map.put(2, "Jack");
        map.put(3, "Peter");
        map.put(4, "Brown");
        map.put(5, "Chris");

        System.out.println("map = " + map);
        /*map의 내용들을 기본값을 설정해 주고 싶을 때*/
        System.out.println(map.getOrDefault(78901, "홍길동"));

        /*해당 키가 존재하지 않을 경우*/
        map.computeIfAbsent(10, (k)->"james");
        System.out.println("map = " + map);

        /*해당 키가 존재한다면 수정할 수 있다.*/
        map.computeIfPresent(5, (k, v) -> "Karl");
        System.out.println("map = " + map);

        /*조건에 따라서 수정하거나 추가해준다.*/
        map.compute(3, (k, v) -> (v==null)?"Ted":v + "!!!");
        map.compute(33, (k, v) -> (v==null)?"Ted":v + "!!!");
        System.out.println("map = " + map);

        /*내용 전부 수정하기 - forEach*/
        map.replaceAll((k, v) -> v.toUpperCase());
        map.forEach((k,v)->System.out.println(k + " : " +v));

    }

    private static void test1() {
        List<Integer> list = new ArrayList<>(); //List 인터페이스
        for (int i = 0; i < 10; i++) {
            list.add(i+1);
        }
        list.forEach(i->System.out.println(i + " "));
        System.out.println();

        /*2의 배수 제거*/
        list.removeIf(i->i%2==0);
        System.out.println(list);

        /*모든 요소에 10곱하기*/
        list.replaceAll(i->i*10);
        System.out.println(list);

    }
}
