package com.ohgiraffers.section03.references;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Application1 {
    public static void main(String[] args) {
        /**
         * [메소드 참조 표현식]
         * 클래스이름::메소드이름
         * 참조변수이름::메소드이름
         */
        BiFunction<String,String,Boolean> biFunction;

        String str1="METHOD";
        String str2="METHOD";

        /*람다식 사용버전 */
        biFunction=(String x,String y)->x.equals(y);
        boolean result=biFunction.apply(str1,str2);
        System.out.println("result : "+result);

        /*메소드 참조 버전*/
        biFunction=String::equals;
        result=biFunction.apply(str1,str2);
        System.out.println("result : "+result);

        Predicate<String>isEqulasTosample;
        String sample="hello world";

        /*람다식 버전*/
        isEqulasTosample=s->s.equals(sample);
        result=isEqulasTosample.test("Hello World");
        System.out.println("result : "+result);

        /*메소드 참조 버전*/
        isEqulasTosample=sample::equals;
        result=isEqulasTosample.test("Hello World");
        System.out.println("result : "+result);

        Consumer<Object> objectConsumer=System.out::println;
        objectConsumer.accept("나오니?");

        List<String> subjects=new ArrayList<>();
        subjects.add("Java");
        subjects.add("Spring");
        subjects.add("Hibernate");
        subjects.add("JPA");

        forEach(subjects, System.out::println);

    }

    private static void forEach(List<? extends Object> lit, Consumer<Object>consumer) {
        for(Object o : lit){
            consumer.accept(o);
        }
    }
}
