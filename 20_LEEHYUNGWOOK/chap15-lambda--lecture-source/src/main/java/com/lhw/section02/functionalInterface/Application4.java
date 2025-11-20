package com.lhw.section02.functionalInterface;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class Application4 {

    public static void main(String[] args) {

        /*Operator*/

        /*BinaryOperator<T>#appply(T t1,T t2):T => T와 T를 연산해서 T를 반환*/
        /*BiFunction을 상속받았기에 apply를 사용할 수 있다.*/
       BinaryOperator<String> binaryOperator = (str1,str2) ->str1+str2;
       String str1 = "Hello ";
       String str2 = "World";
       System.out.println(binaryOperator.apply(str1,str2));

       /*UnaryOperator<T>#apply(T t):T => T를 연산해서 T를 리턴한다.*/
        UnaryOperator<String> unaryOperator = (str) -> str+"world";
        System.out.println(unaryOperator.apply("HELLO "));
    }
}
