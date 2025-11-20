package com.lhw.section01.intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Application1 {

    public static void main(String[] args) {

        /*Stream 이해*/
        List<String> list = new ArrayList<>(
                Arrays.asList("hello", "stream", "world") //add를 하지 않아도 사용 가능
        );

        /*특정 요소를 찾기 위해 iterator or forEach 등을 활용할 수 있다.*/
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            /*조건을 넣고 싶을 때*/
            if (next.equals("stream")) {
                System.out.println(next);
            }
            System.out.println("======stream======");
            /*위 동작을 stream을 통해 활용하기*/
//            list.stream().forEach(System.out::println);
//            list.stream().forEach(str -> System.out.println("걸러진 값: " + str));
            list.stream().filter("stream"::equals).forEach(str->System.out.println("걸러진 값 : " + str));

        }

    }
}
