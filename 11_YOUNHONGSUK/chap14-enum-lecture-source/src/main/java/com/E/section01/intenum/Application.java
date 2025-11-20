package com.E.section01.intenum;

public class Application {
    public static void main(String[] args) {
        /*타입 안정성 보장이 없어 디버깅이 어렵다*/
    int food = Foods.MEAL_AN_BUTTER_KIMCHI_STEW;
    food = Foods.DRINK_1;

    /*2가지 모두 0이라는 값을 가지기 떄문에 차이를 구분할 수 없다*/
        if(food == Foods.MEAL_AN_BUTTER_KIMCHI_STEW){
            System.out.println("식사 앙버터김치찜");
        }
/*정수형 상수는 문자열로 출력하기 어렵다*/
        System.out.println(Foods.MEAL_AN_BUTTER_KIMCHI_STEW);
    }
/*정수 열거 그룹에 속한 모든 상수를 순회하는 방법도 쉽지않다
* 정수 열거 패턴으로 상수가 선언된 경우 변경이 발생하면 재컴파일이 필요하다*/


}
