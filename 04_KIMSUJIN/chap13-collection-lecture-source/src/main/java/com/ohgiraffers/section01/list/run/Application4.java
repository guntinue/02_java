package com.ohgiraffers.section01.list.run;

import java.util.Stack;

public class Application4 {

    public static void main(String[] args) {
        /*
        * stack이란?
        * 후입선출의 자료구조로  push(), pop(), peak()*/

        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println("stack = " + stack);

        System.out.println("peak = " + stack.peek());       //값이 어디에 있는지 확인

        System.out.println(stack);      //toString() 메소드 오버라이딩

        System.out.println("search() : " + stack.search(2));

        System.out.println("pop() : " + stack.pop());       //어떤 값 뽑았는지 출력
        System.out.println("pop() : " + stack.pop());
        System.out.println("pop() : " + stack.pop());
        System.out.println("pop() : " + stack.pop());
        System.out.println("pop() : " + stack.pop());
//        System.out.println("pop() : " + stack.pop());     => 더 뽑을게 없는데 pop하면 EmptyStackException 발생

        System.out.println(stack);



    }
}
