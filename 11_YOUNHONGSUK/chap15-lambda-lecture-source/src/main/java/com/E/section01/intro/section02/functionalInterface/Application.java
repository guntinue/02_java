package com.E.section01.intro.section02.functionalInterface;

import java.sql.SQLOutput;
import java.time.LocalTime;
import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.ObjIntConsumer;

public class Application {
    public static void main(String[] args) {

        /* JDK 8에서 빈번하게 사용되는 함수적 인터페이스를 표준 API로 제공하고 있다.
         *  Consumer : 리턴값이 없는 accept() 메소드를 가지고 있다.
         *  Supplier : 매개변수가 없고 리턴 값이 있는 getXXX() 메소드를 가지고 있다.
         *  Function : 매개변수와 리턴값이 있는 applyXXX() 메소드를 가지고 있다. (매개변수를 리턴값으로 매핑하는 역할)
         *  Operator : Function과 똑같이 applyXXX() 메소드를 가지고 있다. 차이점은 매개변수로 연산을 한 후 통일타입으로 리턴한다.
         *  Predicate : 매개변수와 boolean 값을 반환하는 testXXX()를 가지고 있다. (매개변수를 활용하여 boolean 반환)
         * */

//매개변수 없고 리턴값도 없는 람다

        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("hello");
            }
        };
        r.run();

        Runnable r2 = () -> System.out.println("hello2");
                r2.run();

        Consumer<String> c = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };

        c.accept("hello");

        /*consumer<T> #accept(T t) : */
        Consumer<String> c2 = (String s) -> System.out.println(s + " oh no");
        c2.accept("hello2");

        /*Biconsumer<T,U> #accept(T t, U u): void 객체 T, U를 받아 소비한다*/
        BiConsumer<String, LocalTime> b = (String str1, LocalTime time) -> System.out.println
                (str1 + "가 " +time + "이 입력됨");
        b.accept("hello2", LocalTime.now());

        /*IntConsumer#accpet(int value)# void ==> int값을 받아서 소비한다*/
        IntConsumer ic = (int num) -> System.out.println("the root of input is = " + num*num);
        ic.accept(10);

        /*ObjIntConsumer#accept(T t, int value):void ==> 객체 T와 int값을 받아서 소비한다*/
        ObjIntConsumer<Random> o = (random, bound) -> System.out.println("0 to " + bound
        + " random gen" + random.nextInt(bound));
        o.accept(new Random(),20);
    }



}

