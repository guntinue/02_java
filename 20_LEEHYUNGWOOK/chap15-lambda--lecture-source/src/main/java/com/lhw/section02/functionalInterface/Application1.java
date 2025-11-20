package com.lhw.section02.functionalInterface;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Random;
import java.util.concurrent.Flow;
import java.util.function.*;

public class Application1 {

    public static void main(String[] args) {

        /* JDK 8에서 빈번하게 사용되는 함수적 인터페이스를 표준 API로 제공하고 있다.
         *  Consumer : 리턴값이 없는 accept() 메소드를 가지고 있다.
         *  Supplier : 매개변수가 없고 리턴 값이 있는 getXXX() 메소드를 가지고 있다.
         *  Function : 매개변수와 리턴값이 있는 applyXXX() 메소드를 가지고 있다. (매개변수를 리턴값으로 매핑하는 역할)
         *  Operator : Function과 똑같이 applyXXX() 메소드를 가지고 있다. 차이점은 매개변수로 연산을 한 후 통일타입으로 리턴한다.
         *  Predicate : 매개변수와 boolean 값을 반환하는 testXXX()를 가지고 있다. (매개변수를 활용하여 boolean 반환)
         * */

        /*Comsumer*/
        /*매개변수 없고 리턴값 없는 람다*/

        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable Hello");
            }
        };

        r.run();

        Runnable runnableLambda = () -> System.out.println("Runnable Lambda Hello");
        runnableLambda.run();

        Consumer<String> c = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s + "이(가) 입력됨-익명클래스");
            }
        };
        c.accept("Hello");

        /*Consumer<T>#accept(T t) : 객체 T를 받아서 */
        Consumer<String> consumer = s -> System.out.println(s + "이가 입력됨-람다");
        consumer.accept("Hello");

        /*BiConsumer<T, U> #accept(T t, U, u)*/
       BiConsumer<String, LocalTime> biConsumer = (str1, time) ->
            System.out.println(str1 + "(이)가 " + time + "에 입력됨-람다");

       biConsumer.accept("Hello", LocalTime.now());

       /*IntConsumer*/
        IntConsumer intConsumer = num ->System.out.println("입력하신 정수의 제곱은 " + (num*num) + "입니다.");
        intConsumer.accept(10);

        /*Long Consumer*/
        LongConsumer longConsumer = longNum -> System.out.println("입력하신 정수는 " + longNum + "입니다");
        longConsumer.accept(10L);

        /*Double Consumer*/
        DoubleConsumer dConsumer = dNum -> System.out.println("입력하신 실수의 값은 " + dNum + "입니다.");
        dConsumer.accept(10.5);

        /*ObjIntConsumer#accept(T t, int value):void => 객체 T와 int값을 받아 소비*/
        ObjIntConsumer<Random> objIntConsumer = (random, bound) -> System.out.println("0부터" + bound + " 전 까지의 난수 발생 : "
         + random.nextInt(bound));
        objIntConsumer.accept(new Random(), 100);

        /*ObjLong, ObjDouble 도 있음 -> 소비(return 없음)해줌*/
        ObjLongConsumer<LocalDate> objLongConsumer =
                        (date, days) -> System.out.println(date+"의 " + days
                + "일 후의 날짜는 " + date.plusDays(days) + "이다.");
        objLongConsumer.accept(LocalDate.now(), 10);

        ObjDoubleConsumer<StringBuilder> objDoubleConsumer =
                (sb, doubleValue) -> System.out.println(sb.append(Math.abs(doubleValue)));
        objDoubleConsumer.accept(new StringBuilder("절대값 : "), -10.5);


    }
}
