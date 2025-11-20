package com.E.stream;

import com.E.stream.dto.User;
import java.util.List;
import java.util.stream.Collectors;

public class CheckAge {

    public static void main(String[] args) {
        // 문제: User 리스트에서 나이가 20 이상인 사람들의 이름을 리스트로 출력하세요.
        List<User> users = List.of(
                new User("Alice", 23),
                new User("Bob", 17),
                new User("Charlie", 19),
                new User("David", 25)
        );

       users.stream().filter( u -> u.getAge()  >= 20)
               .forEach(u -> System.out.println(u.getName()));
    }
}


