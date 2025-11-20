package com.lhw.section03.terminal;

import com.sun.source.tree.MemberSelectTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Application3 {

    public static void main(String[] args) {
        /*collect() 는 Collector 타입을 받아서 처리하는데,
        해당 메소드를 통해 컬렉션을 출력으로 받을 수 있다.
        `collect()` 메소드는 Collector 객체에서 제공하는
        정적 메소드를 사용할 수 있다.*/

        /*Collectors.toList()*/
        List<Member> memberList = Arrays.asList(
                new Member("test01", "홍길동"),
                new Member("test02", "유관순"),
                new Member("test03", "신사임당"),
                new Member("test04", "산사")
        );
        /*
        System.out.println("memberList = " + memberList);
        //위 MemberList에서 name만 뽑아 새로운 리스트 객체를 생성해보자
        List<String> nameList = new ArrayList<>();
        for (Member member : memberList) {
            nameList.add(member.getName());
        }
        System.out.println("nameList = " + nameList);*/
        List<String> collectionList = memberList.stream()
                .map(Member::getName)
//                .collect(Collectors.toList()); //불변객체 X
                .toList(); //불변객체
        System.out.println("collectionList = " + collectionList);
        
        /*Collectors.joining() : 리스트를 붙여줌.*/
        String str = memberList.stream().map(Member::getName).collect(Collectors.joining());//concatenation이랑 비슷
        System.out.println("str = " + str);


        String str2 = memberList.stream().map(Member::getName).collect(Collectors.joining(","));//concatenation이랑 비슷
        System.out.println("str = " + str2);


    }
}
