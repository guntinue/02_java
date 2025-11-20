package com.lhw.section02.enumtype;

import com.lhw.section02.enumtype.FoodsEnum;

public class Application {

    public static void main(String[] args) {

        /*열거형을 이용하여 상수 열거 패턴의 단점 해결*/

        /* 1. 싱글톤 방식으로 구현되기 때문에 인스턴스의 생성이나 확정이 되지 않는다.
         * 2. 컴파일 타입의 타입 안정성을 높여준다.
         *
         * */
        // enumTest : 똑같은 주소인가 확인하는 메소드
        boolean isTrue = enumTest(FoodsEnum.MEAL_AN_BUTTER_KIMCHI_STEW
        , FoodsEnum.MEAL_AN_BUTTER_KIMCHI_STEW);

        System.out.println("isTrue = " + isTrue);

//        enumTest(0, 3); -> 이렇게는 안된다. 이제 enumType 으로만 받을 수 있다.
        // 타입 안정성이 높아짐

        /*3. 열거 타입은 상수 이름을 문자열로 출력할 수 있다.*/
        System.out.println(FoodsEnum.MEAL_AN_BUTTER_KIMCHI_STEW);
        System.out.println(FoodsEnum.MEAL_BUNGEOPPANG_SUSHI);
        System.out.println(FoodsEnum.MEAL_MINT_SEAWEED_SOUP);

        FoodsEnum.MEAL meal_ABKStew = FoodsEnum.MEAL.MEAL_AN_BUTTER_KIMCHI_STEW;
        System.out.println("meal_ABKStew = " + meal_ABKStew);

        /*4. 열거 타입에 메소드나 필드를 추가 할 수 있다.
        * 추가로 열거 타입은 근본적으로 불변이라 모든 필드는 final 이어야 한다.
        * 열거 타입도 클래스이기 때문에 toString() 을 재정의하여 사용할 수 있다.*/

        /*5. 열거 타입 내에 선언된 상수들을 순회할 수 있다.*/
        for (FoodsEnum foodsEnum : FoodsEnum.values()) {
            System.out.println("foodsEnum = " + foodsEnum);
        }
    }

    private static boolean enumTest(FoodsEnum foodsEnum, FoodsEnum foodsEnum1) {
        return foodsEnum == foodsEnum1; //주소비교
    }
}
