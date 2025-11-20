package com.E.section03.grammar;

import java.util.EnumSet;

public class Application2 {
    public static void main(String[] args) {
        /*EnumSet을 활용하여 enum을 Set구조로 다룰 수 있다*/

    EnumSet<FoodsEnum> foods = EnumSet.allOf(FoodsEnum.class);
    for(FoodsEnum food : foods){
        System.out.println(food.getName() + food.getValue());
    }
    }
}
