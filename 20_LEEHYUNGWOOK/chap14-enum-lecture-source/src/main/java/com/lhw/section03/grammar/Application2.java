package com.lhw.section03.grammar;

import java.util.EnumSet;

public class Application2 {

    public static void main(String[] args) {

        /* 5. EnumSet  을 활용하여 enum을 Set자료 구조로 다룰 수 있다. */
        // FoodsEnum.class : FoodsEnum의 메타데이터이다.
        /* enum 타입은 프로그램이 시작과 동시에 자원이 주어지는데, 그때 주어진 enum의
        *  정보를 모두 EnumSet에 넘겨주는 것이다. */
        EnumSet<FoodsEnum> foods = EnumSet.allOf(FoodsEnum.class);
        for(FoodsEnum food : foods){
            System.out.println(food.getName() + " : " + food.getValue());
        }
        System.out.println("---------------------------------");
        /* 특정 상수값만 set에 추가
        *  EnumSet에 추가해준다. */
        EnumSet<FoodsEnum> foods2 = EnumSet.of(
                FoodsEnum.DRINK_WOOLUCK_SMOOTHIE, FoodsEnum.MEAL_BUNGEOPPANG_SUSHI
        );
        for (FoodsEnum food : foods2){
            System.out.println(food.getName() + " : " + food.getValue());
        }

        System.out.println("-------------------------");
        /*특정 상수값만 제외하고 set에 추가 */
        EnumSet<FoodsEnum> foods3 = EnumSet.complementOf(
                EnumSet.of(FoodsEnum.DRINK_WOOLUCK_SMOOTHIE, FoodsEnum.MEAL_BUNGEOPPANG_SUSHI
                ));
        for (FoodsEnum food : foods3){
            System.out.println(food.getName() + " : " + food.getValue());
        }

    }
}
