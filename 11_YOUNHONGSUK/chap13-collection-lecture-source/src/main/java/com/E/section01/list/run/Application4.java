package com.E.section01.list.run;

import java.util.Stack;

public class Application4 {

    public static void main(String[] args) {

        /*stack이란
        * 후입선출 LIFO의 자료구조로 push(), pop(), peek() 등의 메소드를 활용하여
        * 자료를 처리할 수 있다
        * */
        Stack<Integer> stack = new  Stack<>();
        stack.push(1);
        stack.add(2);
        stack.push(3);
        stack.push(2);
        System.out.println(stack);

        System.out.println(stack.peek());
        System.out.println("search " +  stack.search(3) );
        System.out.println(stack.pop());
    }

}
