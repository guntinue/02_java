package com.E.section01.intro;

public class Application {
    public static void main(String[] args) {
Calculator calculator = new CalculatorImpl();
        System.out.println(("10 + 20 = "+ calculator.sumTwoNumbers(10, 20)));

        //익명 클래스 활용
        Calculator c2 =  new CalculatorImpl(){
            @Override
            public int sumTwoNumbers(int a, int b) {
                return a + b;
            }
        };
        System.out.println("10 + 20 = " + c2.sumTwoNumbers(10, 20));
//람다식
        Calculator c3 = (int a, int b) -> a + b;
        System.out.println("10 + 20 = " + c3.sumTwoNumbers(10, 20));
    }
}
