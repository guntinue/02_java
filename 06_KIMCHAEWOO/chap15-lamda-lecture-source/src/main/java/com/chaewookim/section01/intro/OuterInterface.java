package com.chaewookim.section01.intro;

/*
* 람다식 사용을 위해 인터페이스 내에 하나의 추상메소드만을 작성 가능
* 따라서 관리 인터페이스가 너무 많아질 수 있음
* 이 때 내부 인터페이스 활용 가능
* */
public interface OuterCalculator {

    @FunctionalInterface
    public interface Sum {
        int sumToNumbers(int a, int b);
    }

    @FunctionalInterface
    public interface Minus {
        int minusToNumbers(int a, int b);
    }

    @FunctionalInterface
    public interface Multiply {
        int multiplyToNumbers(int a, int b);
    }

    @FunctionalInterface
    public interface Divide {
        int divideToNumbers(int a, int b);
    }
}
