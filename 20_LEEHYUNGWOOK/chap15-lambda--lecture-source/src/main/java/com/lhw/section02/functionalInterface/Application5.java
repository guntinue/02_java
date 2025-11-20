package com.lhw.section02.functionalInterface;

import java.util.function.Predicate;

public class Application5 {

    public static void main(String[] args) {

        /*Predicate*/

        Predicate<Object> predicate = value -> value instanceof String; //문자열 여부확인
        System.out.println("is 문자열 ? " + predicate.test("123"));
        System.out.println("is 문자열 ? " + predicate.test(123));
    }
}
