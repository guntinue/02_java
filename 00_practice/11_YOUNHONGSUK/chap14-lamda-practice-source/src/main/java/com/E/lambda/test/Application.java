package com.E.lambda.test;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Application {
    public static void main(String[] args) {
        Application app = new Application();
        app.test1();
        app.test2();
        app.test3();
        app.test4();
        app.test5();

    }

    private void test1() {
        Supplier<String> s = () -> LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss.SSS"));
        System.out.println(s.get());
    }
    private void test2() {
        Supplier<Integer> n = () -> (int) (Math.random() * 45);
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < 6; i++){
            set.add(n.get());
        }
        System.out.println(set.toString());
    }

    private void test3() {
        Consumer<Integer> currency = i -> System.out.println(i/1350);
        currency.accept(10000);

    }

    private void test4() {
        Function<Integer, Integer> currency = i -> i/1350;
        System.out.println(currency.apply(10000));
    }

    private void test5() {

        Function<String, Integer> length = (str) ->{
            String clipped = str.replaceAll("\\s","");
            return clipped.length();
        };
        String[] check = {"abc","","대한민국","   "};
        System.out.println("results for test5");
        for (String s : check){
            System.out.println(length.apply(s));
        }
    }
}