package com.ohgiraffers.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class PeekCharactor {
    public static void main(String[] args) {
        List<String> texts = Arrays.asList("I love java", null, "java is fun",
                "Python", null);
        // Objects::nonNull를 이용해서 null 체크
        texts.stream().filter(Objects::nonNull).filter(s->s.contains("java"))
        .map(String::toLowerCase)
        .forEach(System.out::println);
}
}
