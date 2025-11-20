package com.lhw.section02.uses.subsection01.generation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Application1 {

    public static void main(String[] args) {

        /*배열*/
        String[] sarr = {"java", "mariadb", "jdbc"};
        Arrays.stream(sarr); //sarr을 스트림에 인자로 넣어주면 stream객체로 변환 가능
        Stream<String> stringStream = Arrays.stream(sarr); // <--객체변환
        stringStream.forEach(System.out::println);
        /*기존 List는 Collection을 상속받아 iterator 인터페이스를 갖고 있기 땜누에
        * stream으로 생성가능했던 것. 이제 배열은 Arrays.stream()으로 stream을
        * 만들어 줄 수 있는 것*/
        System.out.println("=============================");
        Stream<String> stringStream1 = Arrays.stream(sarr, 0, 2);
        //인덱스의 시작과 끝을 넣어서 만들 수 있는 Arrays.stream
        stringStream1.forEach(System.out::println);

        System.out.println("=====================");
        
        /*컬렉션*/
        List<String> stringList = Arrays.asList("html", "css", "javascript");
        // 컬렉션은 Iterator를 상속받기 때문에 바로 바꾸어줄 수 있다.
        Stream<String> stringStream2 = stringList.stream();
        //스트림을 안써도 가능은 하다: 컬렉션에도 forEach가 구현되어 있기 때문.
        stringStream2.forEach(System.out::println); //얘가 스트림
        stringList.forEach(System.out::println);//얘가 그냥 List

        System.out.println("===========");

        /*Builder를 활용한 스트림 생성*/
        /*인스턴스를 생성하는데 가독성면에서 편하게 사용할 수 있다.*/
        Stream<String> stringStream3 = Stream.<String>builder()
                // 여러가지에 대한 항목 존재
                .add("홍길동")
                .add("유관순")
                .add("윤봉길")
                .build(); //필수
        stringStream3.forEach(System.out::println);

        /*iterate()*/
        Stream<Integer> intStream =
                Stream.iterate(10, value->value*2).limit(10); //람다식
        intStream.forEach(System.out::println);


    }
}
