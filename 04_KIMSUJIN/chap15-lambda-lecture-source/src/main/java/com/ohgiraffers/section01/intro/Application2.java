package com.ohgiraffers.section01.intro;

import java.time.Year;

public class Application2 {
    public static void main(String[] args) {

        OuterInterface.Sum sum = (x, y) -> x + y;
        OuterInterface.Minus minus = (x, y) -> x - y;
        OuterInterface.Multiple multiply = (x, y) -> x * y;
        OuterInterface.Divide divide = (x, y) -> x / y;

        System.out.println(sum.sumToNumbers(10, 30));
        System.out.println(minus.minusToNumbers(10, 30));
        System.out.println(multiply.multipleToNumbers(10, 30));
        System.out.println(divide.divideToNumbers(10, 30));

    }
}
