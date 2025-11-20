package com.ohgiraffers.section03.grammer;

public enum FoodsEnum {

    MEAL_AN_BUTTER_KIMCHI_STEW(0, "앙버터 김치찜"),
    MEAL_MINT_SEAWEED_SOUP(1, "민트 미영국"),
    MEAL_BUNGEOPPANG_SUSHI(2, "붕어빵 초밥"),
    DRINK_RADISH_KIMCHI_LATTE(3, "열무김치라떼"),
    DRINK_WOOLUCK_SMOOTHIE(4, "우럭스무디"),
    DRINK_RAW_CUTTLEFISH_SHAKE(5, " 생갈치쉐이크");

    private final int vlaue;
    private final String name;

    FoodsEnum(int vlaue, String name) {
        this.vlaue = vlaue;
        this.name = name;
    }

    public int getVlaue() {
        return vlaue;
    }

    public String getName() {
        return name;
    }
}
