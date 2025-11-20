package com.lhw.section03.terminal;

import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Application2 {

    public static void main(String[] args) {

        /*
         * reduce
         * Optional<T> reduce(BinaryOperator<T> accumulator);
         * T reduce(T identity, BinaryOperator<T> accumulator);
         * U reduce(U identity, BiFunction<U, ? super T, U> accumulator, BinaryOperator<U> combiner);
         * reduce()라는 메소드는 스트림에 있는 데이터들의 총합을 계산해준다.
         * */
        /*OptionalInt reduceOneParam =
                IntStream.range(1, 10)
                        .reduce((a, b)-> {
                            return Integer.sum(a,b);
                        });
        */
        /* 위 코드에서 return와 {}을 생략하면 아래와 같이된다.
        * Stream 내의 요소들은 [1,2,3,4,5,6,7,8,9]의 내용들을 들고 들어오는 것*/
        OptionalInt reduceOneParam =
                IntStream.range(1, 10)
                        .reduce((a, b)-> Integer.sum(a,b));

        /*인자 2개*/
        int reduceTwoParam = IntStream.range(1,10).reduce(100, Integer::sum);
        System.out.println("reduceTwoparam : " + reduceTwoParam);

        /*인자 3개*/
        Integer reduceThreeParam = Stream.of(1,2,3,4,5,6,7,8,9,10)
                .parallel().reduce(
                100, Integer::sum, (x,y)->x + y
        );
        System.out.println("reduceThreeParam = " + reduceThreeParam);


    }
}
