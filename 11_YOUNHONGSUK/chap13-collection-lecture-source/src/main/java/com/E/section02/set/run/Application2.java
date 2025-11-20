package com.E.section02.set.run;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Application2 {

    public static void main(String[] args) {

        /*LinkedHashSet은 저장 당시의 순서를 유지하는 특성을 가지고 있다
        * (중복제거 + 순서유지)*/
        Set<String> ls = new LinkedHashSet<>();
        ls.add("ramen");
        ls.add("pork");
        ls.add("eggs");

        System.out.println(ls);
        ls.add("pork");
        ls.add("eggs");
        System.out.println(ls);

        //Link를 통해서  저장 순서를 유지하며, 중복 저장은 불가능한 특징
        // HashSet의 기능을 모두 소유하고 있다
        Iterator<String> it = ls.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
