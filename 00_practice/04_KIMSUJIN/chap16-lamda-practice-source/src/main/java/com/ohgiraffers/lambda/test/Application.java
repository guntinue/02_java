package com.ohgiraffers.lambda.test;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.function.Function;
import java.util.function.IntSupplier;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Application {
    public static void main(String[] args) {
        Application app = new Application();
//        app.test1();
//        app.test2();
//        app.test3();
//        app.test4();
        app.test5();
    }

    /* 실습 문제 1
    *  현재시각 HH:mm:ss.SSS을 출력하는 람다식을 작성*/
    private void test1() {
        Supplier<LocalTime> date = () -> LocalTime.now();
        System.out.println(date.get().format(DateTimeFormatter.ofPattern("HH:mm:ss.SSS")));
    }

    /*실습문제2
     * 로또를 생성하는 람다식을 작성하세요.*/
    private void test2() {
        Set<Integer> lotto = new HashSet<>();
        while(lotto.size() < 6){
            IntSupplier lottonum = () -> (int) ((Math.random() * 45) + 1);
            lotto.add(lottonum.getAsInt());
        }
        System.out.println("로또 ! " + lotto);


    }

    /* @실습문제3
     * 원화 입력시 환율 계산을 통해 얻어진 달러를 출력하는 람다식을 작성
     * 현재 1달러는 1350원이다.*/
    private void test3() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("원화로 : ");
        int won = scanner.nextInt();
        Function<Integer, Double> wonToDollar = w -> (double )w/1350;
        System.out.println(wonToDollar.apply(won));
    }

    /* @실습문제4
     * 위 문제를 jdk가 제공하는 Function 함수형인터페이스 형식에 맞게 변형하세요.*/

    private void test4() {

    }
    /* @실습문제5
     * 공백을 제외한 문자열의 길이가 0인지를 체크하는 람다식을 만들고,
     * 문자열리스트 {"abc","","대한민국","   "}를 체크하세요.*/

    private void test5() {
        List<String> strings =  Arrays.asList("abc","","대한민국","   ");

        Predicate<String> predicate = s -> s.isEmpty();
        for(String s : strings){
            System.out.println(s + ": " +predicate.test(s));
        }
    }
}
