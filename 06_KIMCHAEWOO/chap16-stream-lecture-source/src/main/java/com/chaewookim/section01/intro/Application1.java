package com.chaewookim.section01.aa;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Application1 {
    public static void main(String[] args) {
        /* Stream에 대한 이해와 사용 */
        List<String> list = new ArrayList<String>();
        list.add("java");
        list.add("jdbc");
        list.add("mysql");
        list.add("stream");

        /* 특정 요소를 찾기 위해 iterator or forEach 등을 활용 가능 */
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()) {
            String next = iterator.next();
            if (next.equals("stream")) {
                System.out.println(next);
            }
        }

        System.out.println("=== Stream 시작 ===");

        /* 위의 동작을 stream을 활용해 수행 가능 */
//        list.stream().forEach(str -> System.out.println("걸러진 값: " + str));
        list.stream().filter("stream"::equals).forEach(str -> System.out.println("걸러진 값: " + str));

    }
}
