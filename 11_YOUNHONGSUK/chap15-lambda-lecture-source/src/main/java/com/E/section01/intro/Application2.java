package com.E.section01.intro;

public class Application2 {
    public static void main(String[] args) {

        OuterInterface.Sum sum = (int x, int y) -> x + y;
        OuterInterface.Minus minus = (int x, int y) -> x - y;
        OuterInterface.Multiple multiply = (int x, int y) -> x * y;
        OuterInterface.Division division = (int x, int y ) -> x/y;

        System.out.println(sum.sumToNumbers(10,20));
        System.out.println(minus.minusToNumbers(10,20));
        System.out.println(multiply.multiplyToNumbers(10,20));
        System.out.println(division.dividetoNumbers(10,20));
    }


}
