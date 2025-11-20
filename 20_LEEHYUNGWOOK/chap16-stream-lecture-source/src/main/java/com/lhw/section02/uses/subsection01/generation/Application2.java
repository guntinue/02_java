package com.lhw.section02.uses.subsection01.generation;

import java.util.Random;
import java.util.regex.Pattern;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Application2 {

    public static void main(String[] args) {
        /*기본자료형 스트림임*/
        IntStream intStream = IntStream.range(5, 10);           // 5, 6, 7, 8, 9
        LongStream longStream = LongStream.rangeClosed(1, 3);   // 1, 2, 3
        /*Wrapper클래스 자료형의 스트림으로 변환이 필요한 경우  boxing도 함.*/
        Stream<Double> boxedDoubleStream = new Random().doubles(5).boxed();

        intStream.forEach(i -> System.out.print(i + " "));
        System.out.println();
        longStream.forEach(l -> System.out.print(l + " "));
        System.out.println();
        boxedDoubleStream.forEach(d -> System.out.print(d + " "));
        System.out.println();

        System.out.println("===============================");

        /*문자 관련 스트림 생성*/
        IntStream intStream2 = "Hello Stream World".chars(); //문자열->Char
        intStream2.forEach(i -> System.out.print(i + " "));//CHAR->INT

        System.out.println();

        //문자열을 Split해서 생성
        Stream<String> stringStream = Pattern.compile(",").splitAsStream("Hello,Stream,World");
        stringStream.forEach(s -> System.out.print(s + " !"));
        System.out.println();

        System.out.println("================");

        /*스트림 합치기*/

        Stream<String> stringStream1 = Stream.of("Hello", "Stream", "World");
        Stream<String> stringStream2 = Stream.of("Java", "Spring", "SpringBoot");

        Stream<String> concatStream = Stream.concat(stringStream1, stringStream2);

        concatStream.forEach(s -> System.out.print(s + " "));

    }
}
