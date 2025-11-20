package com.E.section02.enumtype;

public enum Foods {
//내부적으로 작성 순서대로 0부터 값이 자동으로 부여된다
    MEAL1, MEAL2, MEAL3, DRINK1, DRINK2, DRINK3;

    Foods() {
    }

    private final int value;


    Foods(int value){
        this.value = value;
    }

    @Override
    public String toString() {
        return name().toLowerCase();


/*열거형을 이용하여 상수 열거 패턴의 단점을 해결
*
* 1. 싱글톤 방식으로 구현되기 때문에 인스턴스의 생성이나 확장이 되지 않는다
* 2. 컴파일 타입의 타입 안전성을 높여준다
* */
//boolean isTrue = enumTest(FoodsEnum food1, FoodEdnum3 drink1);



//상수 이름을 문자열로 출력할 수 있다
        /*필요하다면 필드나 메소드를 추가할 수 있다
        * 단 그본적으로 불변 개체이기에, 모든 필드는 final로 선언된다
        * 클래스이기에, toString 메소드를 오버라이딩해서 변경 가능=*/

    /*열거타입내에 선언된 상수타입은 선회가능*/
    }

//    public boolean enumTest(Foods meal , Foods drink){
//        if(foodsEnum == foodsEnum1) return true;l
//
//    } else return false;

}
