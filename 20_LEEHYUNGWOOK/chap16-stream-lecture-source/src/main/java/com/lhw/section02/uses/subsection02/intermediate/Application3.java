package com.lhw.section02.uses.subsection02.intermediate;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Application3 {

    public static void main(String[] args) {

        /*flatMap*/
        List<List<String>> list = Arrays.asList(
                Arrays.asList("JAVA", "SPRING", "SPRINGBOOT"),
                Arrays.asList("java", "spring", "springboot")
        );

        System.out.println("list = " + list);
        //2차원 배열느낌

        List<String> flatList = list.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
        System.out.println("flatList = " + flatList);

        /*asList로 하는 법*/
        List<String> sentence = Arrays.asList(
                "Hello world",
                "Java Stream API",
                "flatMap Example"
        );
        System.out.println("sentence = " + sentence);

        /*잘랐다가 다시 붙이기*/
        List<String> words = sentence.stream()
                .flatMap(sentence2 -> Arrays.stream(sentence2.split(" ")))
                .toList(); //얘가 다시 list로 바뀐다.
        System.out.println("words = " + words);

        /*Unmodifiable List*/
        List<String> unmodifiableList = Collections.unmodifiableList(flatList);
        System.out.println("unmodifiableList = " + unmodifiableList);
        List<String> unmodifiableList2 = List.of("A", "B", "C");
//        List<String> unmodifiableList3 = Stream.of("A", "B", "C");
        //전부 .add() 가 불가능하다.
//        unmodifiableList2.add("불가!");

    }
}
