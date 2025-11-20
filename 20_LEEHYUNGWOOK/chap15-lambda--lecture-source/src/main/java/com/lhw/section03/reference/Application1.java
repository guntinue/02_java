package com.lhw.section03.reference;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Application1 {

    public static void main(String[] args) {

        BiFunction<String,String,Boolean> bifunction;

        String str1 = "METHOD";
        String str2 = "METHOD";

        /*람다식 사용 버전*/
        bifunction = (x,y) ->x.equals(y);
        boolean result = bifunction.apply(str1,str2);
        System.out.println("result = " + result);

        /*매개변수 메소드 참조*/
        bifunction = String::equals; //위에 람다랑 똑같음
        result = bifunction.apply(str1,str2);
        System.out.println("result = " + result);

        /*Predicate*/
        Predicate<String> isEqualsToSample;
        String sample = "hello world";

        /*람다식 버전*/
        isEqualsToSample = s -> s.equals(sample);
        result = isEqualsToSample.test("Hell world");
        System.out.println("result = " + result);

        /*메소드 참조 버전*/
        isEqualsToSample = sample::equals;
        result = isEqualsToSample.test("hell world");
        System.out.println("result = " + result);

        Consumer<Object> objectConsumer = System.out::println;
        objectConsumer.accept(123); //출력만 해주는 것.


        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-");
        List<String> subjects = new ArrayList<>();
        subjects.add("java");
        subjects.add("mariadb");
        subjects.add("jdbc");
        subjects.add("html");


        forEach(subjects, System.out::println);

        /*생성자 참조*/
    }

    /*foreach 메서드 정의 -> consumer 사용하여 출력*/
    private static void forEach(List<? extends Object> lit, Consumer<Object> consumer) {
        for( Object obj : lit ) {
            consumer.accept(obj);
        }
    }
}
