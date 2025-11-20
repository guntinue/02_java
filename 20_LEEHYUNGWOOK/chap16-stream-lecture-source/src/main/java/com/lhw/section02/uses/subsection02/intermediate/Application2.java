package com.lhw.section02.uses.subsection02.intermediate;

import java.util.stream.IntStream;

public class Application2 {

    public static void main(String[] args) {

        /*Map*/
        IntStream intStream = IntStream.range(0,10);

        intStream
                .filter(i -> (i%2)==0) //짝수 .filter() : 0 2 4 6 8
                //forEach로 넘겨받은 값들이 여기에서 걸려서 Map()에서 하나하나씩 연산을 수행한다.파이썬의 map과 가장 유사하네
                .map(i -> i*5) // 0 20 40 60 80
                .forEach( i -> System.out.print(i + " "));


    }

}
