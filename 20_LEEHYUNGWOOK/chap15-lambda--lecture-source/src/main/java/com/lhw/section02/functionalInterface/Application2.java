package com.lhw.section02.functionalInterface;

import java.time.LocalDateTime;
import java.util.function.*;

public class Application2 {

    public static void main(String[] args) {

        /* Supplier<T>#get():T  ==> 객체 T를 리턴한다.*/

        Supplier<LocalDateTime> supplier = () -> LocalDateTime.now();
        System.out.println(supplier.get());

        /* BooleanSupplier#getAsBoolean():boolean ==> Boolean값을 리턴한다.*/

        BooleanSupplier booleanSupplier = () -> {
            int random = (int) (Math.random() * 2);
            System.out.println(random);
            return random == 0;
        };
        System.out.println(booleanSupplier.getAsBoolean());

        /*IntSupplier#getAsInt():int => int값 리턴*/

        IntSupplier intSupplier = () -> (int)(Math.random() * 6) + 1;
        System.out.println("주사위 : " + intSupplier.getAsInt());

        /* LongSupplier#getAsLong():long => Long값을 리턴한다.*/

        LongSupplier longSupplier = () -> new java.util.Date().getTime();
        System.out.println("1970년 1월 1일 0시 0분 0초 이후 지난 시간 : " + longSupplier.getAsLong());

        /* DoubleSupplier#getAsDouble():double => double값을 리턴한다.*/

        DoubleSupplier doubleSupplier = () -> Math.random();
        System.out.println("Math.random()의 리턴값 : " + doubleSupplier.getAsDouble());
    }
}
