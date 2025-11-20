package com.ohgiraffers.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterAndJoinStrings {
    public static void main(String[] args) {
        List<String> words = List.of("hi", "hello", "to", "world", "java");
        List<String>lst=words.stream().filter(s->s.length()>=3)
                .collect(Collectors.toList());


        System.out.println(String.join(", ", lst));

    }
}
