package com.lhw.section02.additional;

import org.junit.jupiter.api.*;

/*Order 어노테이션 기능 활성화하기 위한 클래스레벨 어노테이션*/
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class AdditionalAnnotationTests {
    @Disabled // 테스트 무시
    @Test
    void testIgnore() {
        System.out.println("테스트 실행 확인");
    }
    @Disabled
    @Test
    @Timeout(value = 1)
    void testTimeOut() {
        try {
            Thread.sleep(9900);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("타임아웃 테스트");
    }

    @Test
    @Order(1)
    void testFirst() {
        System.out.println("first");
    }

    @Test
    @Order(3)
    void testSecond() {
        System.out.println("second");
    }

    @Test
    @Order(2)
    void testThird() {
        System.out.println("third");
    }

    @RepeatedTest(10)
    void testRepeated() {
        System.out.println("반복 테스트");
    }
}
