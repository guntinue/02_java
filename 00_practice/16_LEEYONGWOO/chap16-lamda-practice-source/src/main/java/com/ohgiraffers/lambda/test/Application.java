package com.ohgiraffers.lambda.test;

import java.time.LocalTime;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Application {
    public static void main(String[] args) {
        Application app = new Application();
        app.test1();
        app.test2();
        app.test3();
        app.test4();
        app.test5();
    }

    private void test5() {
        List<String> strList = Arrays.asList("abc", "", "대한민국", " ");
        Runnable test = () -> {
            for (String str : strList) {
                boolean isblank = str.isBlank();
                System.out.println("[" + str + "] 의 길이는 0 입니까? " + isblank);
            }
        };
        test.run();
    }

    private void test4() {
        // test3을 jdk가 제공하는 function함수형 인터페이스 형식에 맞게 변환
        Consumer<Integer> con = num -> System.out.println("$ "+ (double)num / 1350);
        Scanner sc = new Scanner(System.in);
        System.out.print("￦ ");
        con.accept(sc.nextInt());
    }

    private void test3() {
        Scanner sc = new Scanner(System.in);
        Runnable test = () -> {
            System.out.print("￦ ");
            int a = sc.nextInt();
            System.out.print("=> $ "+(double)a / 1350+"\n");
        };
        test.run();
    }

    private void test2() {
        Runnable lotto = () -> {
            Set<Integer> numbers = new HashSet<>();
            while (numbers.size() < 6) {
                numbers.add((int) (Math.random() * 45) + 1);
            }
            //오름차순 정렬
            List<Integer>asd=numbers.stream().sorted().collect(Collectors.toList());
            System.out.println("lotto = " + asd);
        };
        lotto.run();
    }

    private void test1() {
        // 현재시각을 출력하는 람다식 (Runnable 사용)
        Runnable timePrinter = () -> {
            LocalTime now = LocalTime.now();
            System.out.println(now.getHour() + ":" + now.getMinute() + ":" + now.getSecond() + ":" + now.getNano());
        };

        timePrinter.run();
    }
}
