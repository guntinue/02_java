package com.ohgiraffers.section03.grammer;

import java.util.EnumSet;

public class Application2 {

    public static void main(String[] args) {

        /* EnumSet을 활용하여 enum을 Set자료 구조로 다룰 수 있다. */
        EnumSet<FoodsEnum> foods = EnumSet.allOf(FoodsEnum.class);
        System.out.println(FoodsEnum.class);

        System.out.println("======================================================================");
        for (FoodsEnum food : foods) {
            System.out.println(food.getName() + " : " + food.getValue());
        }
        /* 특정 상수 값만 Set에 추가 */
        EnumSet<FoodsEnum> foods2 = EnumSet.of(
                FoodsEnum.MEAL_BUNGEOPPANG_SUSHI
        );
        for (FoodsEnum food : foods2) {
            System.out.println(food.getName() + " : " + food.getValue());
        }

        /* 특정 상수 값만 Set에 추가 */
        EnumSet<FoodsEnum> foods3 =
                EnumSet.complementOf(
                        EnumSet.of(
                                FoodsEnum.DRINK_WOOLUCK_SMOOTHIE, FoodsEnum.MEAL_BUNGEOPPANG_SUSHI
                        )
                );
        for (FoodsEnum food : foods3) {
            System.out.println(food.getName() + " : " + food.getValue());

        }
    }
}
