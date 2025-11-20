package com.ohgiraffers.lambda.test;

import java.time.LocalTime;
import java.util.*;
import java.util.function.*;

import static java.lang.Math.random;

public class Application {

    public static void main(String[] args) {
        Application app = new Application();
        app.test1();
        app.test2();
        app.test3();
        app.test4();
        app.test5();

    }
    /**
     * <pre>
     * @실습문제1
     * 현재시각 HH:mm:ss.SSS을 출력하는 람다식을 작성
     * </pre>
     */

    private void test1() {
        Consumer<LocalTime> now = localTime -> System.out.println(localTime);
        now.accept(LocalTime.now());
    }
    /**
     * <pre>
     * @실습문제2
     * 로또를 생성하는 람다식을 작성하세요.
     * - 리턴타입 Set<Integer>
     * </pre>
     */
    private void test2() {
//        Set<Integer> set = () -> (int)((Math.random()*45)+6);
        Supplier<Set<Integer>> lotto = () -> {
            Random random = new Random();
            Set<Integer> lottoSet = new HashSet<>();
            while (lottoSet.size() < 6) {
                lottoSet.add(random.nextInt(100));
            }
            System.out.println(Arrays.toString(lottoSet.toArray()));
            return  lottoSet;
        };
        lotto.get();
    }

    /*
     * 원화 입력시 환율 계산을 통해 얻어진 달러를 출력하는 람다식을 작성
     * 현재 1달러는 1350원이다.*/
    private void test3() {
        Consumer<Integer> rate = won -> System.out.println("$" + (won/(double) 1350));
        rate.accept(3000);
    }
    /**
     * <pre>
     * @실습문제4
     * 위 문제를 jdk가 제공하는 Function 함수형인터페이스 형식에 맞게 변형하세요.
     * </pre>
     */
    private void test4() {
        Function<Integer, Double> rate = won -> (won / (double) 1350);
        System.out.println(rate.apply(3000) + "$");
    }

    private void test5() {
        List<String> strList = Arrays.asList("abc", "", "대한민국", " ");
        Predicate<String> isEmpty = stringTest ->  stringTest.isBlank();
        for (String s : strList) {
            System.out.print('['+s+']'+"의 길이는 0입니까?");
            System.out.println(isEmpty.test(s));
        }
    }



}
