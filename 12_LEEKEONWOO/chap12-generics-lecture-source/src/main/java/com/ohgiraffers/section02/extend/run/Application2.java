package com.ohgiraffers.section02.extend.run;

import com.ohgiraffers.section02.extend.*;

public class Application2 {

    public static void main(String[] args) {

        WildCardFarm wildCardFarm = new WildCardFarm();

        // 농장 생성 자체가 불가능한 것은 매개변수로 사용할 수 없다.
//        wildCardFarm.anyType(new RabbitFarm<Mammal>(new Mammal()));
//        wildCardFarm.anyType(new RabbitFarm<Reptile>(new Mammal()));

        RabbitFarm<Rabbit> rabbitFarm1 = new RabbitFarm<>();
        rabbitFarm1.setAnimal(new Rabbit());

        wildCardFarm.anyType(rabbitFarm1);
        wildCardFarm.anyType(new RabbitFarm<Bunny>(new Bunny())); // 위의 코드 두줄 축약
        wildCardFarm.anyType(new RabbitFarm<DrunkBunny>(new DrunkBunny()));

//        wildCardFarm.extendsType(new RabbitFarm<Rabbit>(new Rabbit()));
        wildCardFarm.extendsType(new RabbitFarm<Bunny>(new Bunny()));
        wildCardFarm.extendsType(new RabbitFarm<DrunkBunny>(new DrunkBunny()));

        wildCardFarm.superType(new RabbitFarm<Rabbit>(new Rabbit()));
        wildCardFarm.superType(new RabbitFarm<Bunny>(new Bunny()));
//        wildCardFarm.superType(new RabbitFarm<DrunkBunny>(new DrunkBunny()));


    }
}