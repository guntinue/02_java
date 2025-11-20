package com.ohgiraffers.section02.functionalInterface;

import java.util.function.Predicate;

public class Application5 {

    public static void main(String[] args) {

        //넘겨준 값 문자열 마즘?
        Predicate<Object> predicate = value -> value instanceof String;
        System.out.println("문자열인지 확인 : " + predicate.test("Hello"));
        System.out.println("문자열인지 확인 : " + predicate.test(123));

    }

}
