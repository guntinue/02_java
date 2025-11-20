package com.lhw.section01.jupiter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.security.PrivilegedActionException;

import static org.junit.jupiter.api.Assertions.*;

/*JUnit5에서 제공하는 Assertions(단정문)에 있는 메소드*/
class JupiterAssertionsTests {

    /*1. assertEquals: 예상 값과 실제 값의 일치 여부를 동일성으로 판단한다.*/
    @Test
    void testAssertEquals() {
        /* given: 무엇으로 하는가? */
        int firstNum = 10;
        int secondNum = 20;
        int expected = 34;

        /* when 어떤 것을 하는가?*/
        Calculator calculator = new Calculator();
        int result = calculator.plus(firstNum, secondNum);

        /* then 내가 정한 값을 받고 그 결과를 들고 올거라고 "단정"한다.*/
//        Assertions.assertEquals(expected, result, 5); // 두 수를 더하고 결과값과 확인해보겠다
        // delta = 근사치(오차범위) 허용

        Assertions.assertNotEquals(firstNum, secondNum); // 부정 단정 -> 틀리면 성공하는것
    }

    /*2. AssetNull: null 여부를 테스트*/
    @Test
    @DisplayName("Null 여부 테스트")
    void testAssertNulls() {
        /*given*/
        String str = null;

        /*when*/
        /*then*/
        //Assertions.assertNotNull(str);//null인가?
        Assertions.assertNull(str);
    }

    /*3. AssertAll : 한 번에 여러 검증을 수행할 수 있는 메소드 제공*/
    @Test
    @DisplayName("동시에 여러 값에 대한 검증 테스트")
    void testAssertAll() {
        /*given*/
        String firstName = "길동";
        String lastName = "홍";
        Person person = new Person(firstName, lastName);
        /*when*/
        /*then*/
        Assertions.assertAll(
                "그룹화 된 테스트의 이름(테스트 실패 시 보여지는 부분)",
                //() -> Assertions.assertEquals("", person.getFirstName()),//여기서 틀렸음-> header 부분이 출력된다.
                () -> Assertions.assertEquals(firstName, person.getFirstName()),//여기서 틀렸음-> header 부분이 출력된다.

                () -> Assertions.assertEquals(lastName, person.getLastName())
        );
    }

    /*4. assertThrows*/
    @Test
    @DisplayName("예외발생 테스트")
    void testAssertThrow() {
        /*given*/
        int firstNum = 10;
        int secondNum = 0;

        /*when*/
        NumberValidation validation = new NumberValidation();
        // Exception 클래스 가져오기
        Exception exception = Assertions.assertThrows(
            IllegalArgumentException.class,
                () -> validation.checkDividableNumbers(firstNum,secondNum)
        );

        /*then*/
        Assertions.assertAll(
                // 예외가 실제로 일어났는가?
                () -> Assertions.assertInstanceOf(
                        IllegalArgumentException.class,
                        exception
                ),
                // 예외 메시지가 동일한가?
                () -> Assertions.assertEquals(
                        "0으로 나눌 수 없습니다.",
                        exception.getMessage()
                )
        );
    }
}