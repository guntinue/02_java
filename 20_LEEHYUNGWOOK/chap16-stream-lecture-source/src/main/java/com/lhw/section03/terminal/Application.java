package com.lhw.section03.terminal;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Application {

    public static void main(String[] args) {

        long count = IntStream.range(1, 10).count();
        System.out.println("count = " + count); // 9
        long sum = IntStream.range(1, 10).sum();
        System.out.println("sum = " + sum); //합계

        OptionalInt max = IntStream.range(1, 10).max(); //Null일 수 없는 optionalInt
        System.out.println("max = " + max);
        OptionalInt min = IntStream.range(1, 10).min();
        System.out.println("min = " + min);

        int OddSum = IntStream.range(1, 10)
                .filter(i -> i % 2 == 1)
                .sum();
        System.out.println("홀수 합계 = " + OddSum);


    }
}
