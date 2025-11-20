package com.lhw.section02.set.run;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Application3 {

    public static void main(String[] args) {

        /*TreeSet*/
        TreeSet<String> tset = new TreeSet<String>();

        tset.add("kimchi");
        tset.add("friedEgg");
        tset.add("rice");
        tset.add("ramen");
        tset.add("pork");
        tset.add("kimchi");

        System.out.println("tset = " + tset);
        
        Set<Integer> lotto = new TreeSet<Integer>();
        
        while(lotto.size() < 6) {
            lotto.add((int)(Math.random() * 45)+1);
        }
        System.out.println("lotto = " + lotto);
    }
}
