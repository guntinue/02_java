package com.lhw.section01.intro;

public interface OuterInterface {

    @FunctionalInterface
    public interface Sum{
        int sumToNumbers(int a, int b);
    }

    @FunctionalInterface
    public interface Minus{
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
