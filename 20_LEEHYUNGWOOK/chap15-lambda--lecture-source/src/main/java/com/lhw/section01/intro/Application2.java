package com.lhw.section01.intro;

public class Application2 {

    public static void main(String[] args) {

        OuterInterface.Sum sum = (a, b) -> a+b;
        OuterInterface.Minus minus = (a, b) -> a-b;
        OuterInterface.Multiply multiply = (a, b) -> a*b;
        OuterInterface.Divide divide = (a, b) -> a/b;

        System.out.println(sum.sumToNumbers(10, 20));
        System.out.println(minus.minusToNumbers(10, 20));
        System.out.println(multiply.multiplyToNumbers(10, 20));
        System.out.println(divide.divideToNumbers(10, 20));
    }
}
