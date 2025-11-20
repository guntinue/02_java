package com.lhw.section03.reference;

import java.util.function.Function;

public class Application2 {

    public static void main(String[] args) {

        /*생성자 메소드 참조를 이해하고 사용*/
        Function<String,Member> function = Member::new;
        Member member = function.apply("user01");
        Member member2 = function.apply("user02");
        System.out.println(member);
        System.out.println(member2);
    }
}
