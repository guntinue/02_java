package com.ohgiraffers.stream;

import com.ohgiraffers.stream.dto.User;

import java.util.List;
import java.util.stream.Collectors;

public class CheckAge {
    public static void main(String[] args) {
        List<User> users=List.of(new User("Alice", 23),new User("Bob", 17),
                new User("Charlie", 19),
                new User("David", 25));

        List<User> youngUsers=users.stream().filter(user->user.getAge()>=20)
                .collect(Collectors.toList());


        for(User user:youngUsers){
            System.out.print(user.getName()+" ");
        }

    }

}
