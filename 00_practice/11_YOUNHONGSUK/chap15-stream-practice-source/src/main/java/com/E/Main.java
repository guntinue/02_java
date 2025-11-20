package com.E;

import com.E.stream.PrintName;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        PrintName p =  new PrintName();
        List<String> names = List.of("Alice", "Bob", "Charlie", "David", "Eve", "Franklin");
        p.printNames(names);
    }
}