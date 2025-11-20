package com.lhw.section03.map.run;

import java.util.*;

public class Application1 {

    public static void main(String[] args) {

        /*HashMap*/
        HashMap hmap = new HashMap();

        hmap.put("one", new Date());
        hmap.put(12, "red apple");
        hmap.put(33, 123);

        hmap.put(12, "yellow apple"); // key값 동일 시 값 변경
        hmap.put(11, "yellow apple"); // key값 다르면 value 중복 가능

        System.out.println("hmap = " + hmap);

        System.out.println("hmap.get = " + hmap.get(11));
        System.out.println("hmap.get = " + hmap.get(100)); // 없는 값 -> null
        hmap.remove(11);

        System.out.println("hmap = " + hmap);

        HashMap<String, String> hmap2 = new HashMap<>();
        hmap2.put("one", "red apple");
        hmap2.put("two", "yellow apple");
        System.out.println("hmap2 = " + hmap2);

//      /*Map 순회*/
        /*1. */
        Iterator setIt = hmap2.keySet().iterator();
        while (setIt.hasNext()) {
            String key = setIt.next().toString();
            String value = hmap2.get(key);
            System.out.println("key = " + key + ", value = " + value);
        }

        /*향상된 for문*/
        for (String key : hmap2.keySet()) {
            System.out.println(key + " = " + hmap2.get(key));
        }

/*        *//*2. values(): 값만 가져오기*//*
        Collection<String> values = hmap.values();
        Iterator<String> it = values.iterator();
        while (it.hasNext()) {
            String value = it.next();
            System.out.println("value : " + value);
        }*/

        /*향상된 for문으로  value 들고 오기*/
        for ( String value : hmap2.values()) {
            System.out.println("value : " + value);
        }

        /*3. entrySet()*/
        System.out.println("==============");
        Set<Map.Entry<String, String>> entries = hmap2.entrySet();
        Iterator<Map.Entry<String, String>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            System.out.println("entry = " + entry.getValue());
        }

        for  (Map.Entry<String, String> entry : entries) {
            System.out.println("key = " + entry.getKey() + ", value = " + entry.getValue());
        }




    }
}
