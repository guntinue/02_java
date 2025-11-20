package com.lhw.section02.assertj;

import org.assertj.core.api.Assertions;
import org.assertj.core.api.AssertionsForClassTypes;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

/* Test 3rd party lib 중 Assertj의 사용법*/
class AssertjTests {

    /*1. 문자열 테스트*/
    @Test
    @DisplayName("문자열 테스팅")
    void testStringValidation() {
        /*메소드 체인으로 하나하나 확인해볼 수 있다.*/
        /*given*/
        String expected = "hello world";

        /*when*/
        String actual = new String(expected);
        /*then*/
        Assertions.assertThat(actual)
                .isNotEmpty()
                .isNotBlank()
                .contains("hello")
                .doesNotContain("hahahahha")
                .startsWith("h")
                .endsWith("d")
                .isEqualTo(expected);
    }

    /*2. 숫자 테스트*/
    @Test
    @DisplayName("숫자 테스트")
    void testIntegerValidation() {
        /*given*/
        double pi = Math.PI;
        Double actual = Double.valueOf(pi);
        /*when*/
        /*then*/
        Assertions.assertThat(actual)
                .isPositive() //양수인가
                .isGreaterThan(3)
                .isLessThan(5)
                .isEqualTo(Math.PI);
    }

    /*3. 날짜 테스트*/
    @Test
    @DisplayName("날짜 테스트 하기")
    void testLocalDateTimeValidation() {
        /*given*/
        String birthDay = "1999-02-12T02:03:33.135";
        LocalDateTime bDay = LocalDateTime.parse(birthDay); //Parse ->  문자열to날짜형

        Assertions.assertThat(bDay)
                .hasYear(1999)
                .hasMonthValue(2)
                .hasDayOfMonth(12)
                .isBetween("1999-02-01T02:03:33.135","1999-12-12T02:03:33.135")
                .isBefore(LocalDateTime.now())
                .isAfter("1999-02-01T02:03:33.135");
    }

    /*4. 예외 테스트*/
    @Test
    @DisplayName("예외테스트")
    void testExceptionValidation() {
        Throwable thrown = AssertionsForClassTypes.catchThrowable(() -> {
           throw new IllegalArgumentException("잘못된 파라미터를 입력하였습니다.");
        });
        Assertions.assertThat(thrown)
                .isInstanceOf(IllegalArgumentException.class)//클래스가 해당 예외 매개변수 클래스인지 확인한다.
                .hasMessageContaining("파라미터");
    }

    /*5. 필터를 이용한 단정문 테스트*/
    @Test
    @DisplayName("filtering assertions 테스트")
    void testFilteringAssertions() {
        /*given*/
        Member member1 = new Member(1,"user01","홍길동",16);
        Member member2 = new Member(2,"user02","이순신",26);
        Member member3 = new Member(3,"user03","신사임당",36);

        List<Member> members = Arrays.asList(member1, member2, member3); //각 멤버 객체를 List로

        /*when*/
        /*then*/
        Assertions.assertThat(members)
                .filteredOn(member->member.getAge()>19)
                .containsOnly(member2, member3) // 위 필터 결과에 member들이 포함되어 있는가? -> member1은 실패 뜸(19세미만)
                .filteredOn("age", 26) // age==26이 존재하는가?
                .containsOnly(member2); //위 모든 조건을 member2 가 통과하는가?
    }

}