package com.E.lambda.friend;

import java.util.List;
import java.util.Map;

public class FriendApp {
    public static void main(String[] args) {

        List<Friend> list = List.of (new Friend("홍길동", 30)
                ,new Friend("신사임당", 48)
                ,new Friend("전봉준", 35)
                ,new Friend("세종대왕", 54)
                ,new Friend("간달프", 105));
        /*list.stream() 으로 스트림으로 변환
        .filter()로 조건문 시작하기
        if문으로 나이 40이상 조건 정하기
        forEach로 조건에 맞는 객체들 프린트
        * */
        list.stream().filter(friend -> friend.getAge() >= 40).forEach(System.out::println);

        System.out.println("==========================");
        Map<Integer, Friend> map = Map.of
                (1, new Friend("홍길동", 30),
                2,new Friend("신사임당", 48),
                3,new Friend("전봉준", 35),
                4,new Friend("세종대왕", 54),
                5,new Friend("간달프", 105));

        /*map의 forEach()로 key와 value를 주고,
        * 받은 key 값을 2로 나누어서 나머지가 남는다면
        * 홀수니까 프린트하기*/
            map.forEach((id,friend) -> {
                        if(id % 2 != 0){
                            System.out.println(friend);
                        }
            });
    }
}
