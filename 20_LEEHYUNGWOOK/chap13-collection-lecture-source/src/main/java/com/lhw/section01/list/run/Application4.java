package com.lhw.section01.list.run;

import java.util.Stack;

public class Application4 {

    public static void main(String[] args) {

        /*후입선출(LIFO)의 자료구조로 push() , pop() , peek() 등의 메소드를 활용하여 자료처리한다.*/
        Stack<Integer> stack = new Stack<Integer>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println("stack = " + stack);// toString() 오버라이딩됨

        System.out.println("stack.peek() = " + stack.peek());

        System.out.println("stack.search(3) = " + stack.search(3));

        System.out.println("stack.pop() = " + stack.pop()); //어떤 값 뽑았는지 출력
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        System.out.println(stack);
    }

}
