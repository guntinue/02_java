package com.lhw.section03.grammar;

public class Applicatino1 {

    public static void main(String[] args) {

        /* *1. Values()**

         - 열거 타입의 모든 값을 배열로 반환한다.*/
        for (EnumType enumType :EnumType.values()){
            System.out.println("enumType : " + enumType);
        }

        /* **2. valueOf()**
         - 해당 이름을 가진 열거 타입 상수 반환*/
        for (EnumType enumType :EnumType.values()){
            if(enumType == EnumType.valueOf("JAVA")){
                System.out.println("enumType = " + enumType);
            }
        }

        /* 3. ordinal() : 열거 타입의 상수의 순서를 리턴 */
        for (EnumType enumType :EnumType.values()){

            System.out.println("enumType : " + enumType.ordinal());
        }

        /* 4. .name() : 열거 타입의 문자열 리턴 */
        System.out.println("name : " + EnumType.MARIADB.name());
        System.out.println("name(tostring) : " + EnumType.MARIADB.toString());
    }
}
