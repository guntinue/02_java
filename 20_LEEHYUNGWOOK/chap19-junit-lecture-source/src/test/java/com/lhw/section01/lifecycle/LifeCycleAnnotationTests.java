package com.lhw.section01.lifecycle;

import org.junit.jupiter.api.*;

public class LifeCycleAnnotationTests {

    /*테스트 메소드 확인 전 어노테이션 먼저 확인해보자*/

    /*before all*/
    static void beforeAll() {
        System.out.println("before all 동작");//클래스의 모든 테스트 전에 한 번 실행되는 메서드를 지정한다
    }

    /*before each*/
    void beforeEach() {
        System.out.println("before each 동작");
    }

    @BeforeAll
    static void before() {
        System.out.println("beforeall");
    }

    @BeforeEach
    void beforeEach1() {
        System.out.println("beforeEach1");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("afterAll");
    }

    @AfterEach
    void afterEach1() {
        System.out.println("afterEach1");
    }

    @Test
    void test1() {
        System.out.println("테스트 코드1");
    }

    @Test
    void test2() {
        System.out.println("테스트 코드1");
    }
}
