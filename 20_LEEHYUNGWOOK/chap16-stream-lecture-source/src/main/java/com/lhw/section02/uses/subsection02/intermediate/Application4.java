package com.lhw.section02.uses.subsection02.intermediate;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Application4 {

    public static void main(String[] args) {

        /*Sorting*/
        List<Integer> intList = IntStream.of(5,1,3,4,2,6)
                .boxed() //wrapper Class
                .sorted() //정렬
                .collect(Collectors.toList()); // list로 변경
        System.out.println("intList = " + intList);
    }
}
