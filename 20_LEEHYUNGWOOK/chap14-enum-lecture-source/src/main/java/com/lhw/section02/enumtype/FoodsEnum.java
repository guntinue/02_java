package com.lhw.section02.enumtype;

public enum FoodsEnum {
    /**/
    MEAL_AN_BUTTER_KIMCHI_STEW(0),
    MEAL_MINT_SEAWEED_SOUP(1),
    MEAL_BUNGEOPPANG_SUSHI(2),
    DRINK_RADISH_KIMCHI_LATTE(3),
    DRINK_WOOLUCK_SMOOTHIE(4),
    DRINK_RAW_CUTTLEFISH_SHAKE(5);;

    private final int value;
    private final int var = 0;

//    FoodsEnum() {
//        System.out.println("기본 생성자 호출됨");
//    }


    FoodsEnum(int value) {
        this.value = value;
    }
    
    public void printVar() {
        System.out.println("var = " + var);
    }

    @Override
    public String toString() {
        return name().toLowerCase(); //
    }

    /*음식과 음료를 명시적으로 구분하는 방법*/
    public enum MEAL {
            MEAL_AN_BUTTER_KIMCHI_STEW,
            MEAL_MINT_SEAWEED_SOUP,
            MEAL_BUNGEOPPANG_SUSHI}

    public enum DRINK {
            DRINK_RADISH_KIMCHI_LATTE,
            DRINK_WOOLUCK_SMOOTHIE,
            DRINK_RAW_CUTTLEFISH_SHAKE}
}
