package com.lhw.section02.uses.subsection02.intermediate;

import java.util.stream.IntStream;

public class Application {

    public static void main(String[] args) {

        /*스트림 필터*/
        IntStream intStream = IntStream.range(0,10);
        intStream.filter(i -> (i%2)==0).forEach(i->System.out.print(i+ " "));
        System.out.println();


        /*Map*/

    }
}
