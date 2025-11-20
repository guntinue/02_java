package com.lhw.section01.intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application2 {

    public static void main(String[] args) {

        /*병렬처리*/
        List<String> list = new ArrayList<>(
                Arrays.asList("java", "mariadb", "html", "css", "mybatis")
        );
        System.out.println("for each ===========");
        for (String s : list) {
            print(s);
        }

        System.out.println("Normal Stream ================");
        list.stream().forEach(Application2::print);//메소드참조

        System.out.println("parallel stream ==============");
        list.parallelStream().forEach(Application2::print);
        list.parallelStream().forEach(Application2::print);
    }

    private static void print(String str) {
        System.out.println(str + " : " + Thread.currentThread().getName());


    }
}
