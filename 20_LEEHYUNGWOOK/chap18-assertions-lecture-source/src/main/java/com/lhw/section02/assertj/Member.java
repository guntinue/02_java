package com.lhw.section02.assertj;

public class Member {

    /*라이브러리 가져다가 사용해보기*/
    private int sequence;
    private String id;
    private String name;
    private int age;

    public Member(int sequence, String id, String name, int age) {
        this.sequence = sequence;
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getSequence() {
        return sequence;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Member{" +
                "sequence=" + sequence +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
