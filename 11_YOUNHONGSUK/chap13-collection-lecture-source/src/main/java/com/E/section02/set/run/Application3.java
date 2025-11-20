package com.E.section02.set.run;

import java.util.Set;
import java.util.TreeSet;

public class Application3 {

    public static void main(String[] args) {

        /*TreeSet
        * 중복 제거
        * 오름차순 정렬*/
        TreeSet<String> ts = new  TreeSet<>();
        ts.add("ramen");
        ts.add("pork");
        ts.add("food");
        ts.add("notfood");
        ts.add("pork");
        System.out.println(ts);

        Set<Integer> lotto = new TreeSet<>();
        while(lotto.size()<6){
            lotto.add((int) (Math.random()*45)+1) ;
        }
        System.out.println(lotto);

    }

}
