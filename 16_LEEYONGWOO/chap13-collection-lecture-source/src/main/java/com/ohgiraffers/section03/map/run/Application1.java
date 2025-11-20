package com.ohgiraffers.section03.map.run;

import javax.swing.*;
import java.util.*;

public class Application1 {
    public static void main(String[] args) {
        /*HashMap*/
        HashMap hmap=new HashMap();
        hmap.put("one",new Date());
        hmap.put(12,"red apple");
        hmap.put(33,123);

        System.out.println("hmap : "+hmap);
        hmap.put(12,"green apple");
        System.out.println("hmap : "+hmap);// 기존에 있는 키값에 다른값을 넣으면 값이 업데이트된다.
        hmap.put(11,"yellow apple");
        System.out.println("hmap : "+hmap);//키값만 다르면 값은 동일해도 상관없다.

        //map에 담겨져있는 값을 가져오기: get(키값)
        System.out.println("====> " + hmap.get(13));

        //key를 통해서 삭제
        hmap.remove(11);
        System.out.println("hmap : "+hmap);

        /*문자열 타입을 키, 값으로 하는 hashMap*/
        HashMap<String,String> stringMap=new HashMap<>();
        stringMap.put("one","java");
        stringMap.put("two","css");
        stringMap.put("three","html");
        System.out.println("stringMap : "+stringMap);

        /*Map 타입 순회 방법*/
        /*1. keyset(): key순회*/
        Iterator<String>keyIter=stringMap.keySet().iterator();
        while(keyIter.hasNext()){
            String key=keyIter.next();
            String value=stringMap.get(key);
            System.out.println(key+" : "+value);
        }

        for(String key:stringMap.keySet()){
            String value=stringMap.get(key);
            System.out.println(key+" : "+value);
        }

        /*2. values()*/
        Collection<String> values=stringMap.values();
        Iterator<String>valueIter=values.iterator();
        while(valueIter.hasNext()){
            String value=valueIter.next();
            System.out.println(value);
        }

        for(String value:values){
            System.out.println("value="+value);
        }

        /*3. entrySet() */
        Set<Map.Entry<String,String>> entries=stringMap.entrySet();
        Iterator<Map.Entry<String,String>>entryIter=entries.iterator();
        while(entryIter.hasNext()){
            Map.Entry<String,String> entry=entryIter.next();
            String key=entry.getKey();
            String value=entry.getValue();
            System.out.println(key+" : "+value);
        }
        for(Map.Entry<String,String> entry:entries){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }

        /**
         * List>ArrayList
         * 값을 추가 : add()
         * 값을 삭제 : remove()
         * 값을 특정값 가져오기 : get(인덱스)
         * 값을 수정: set()
         * ++++++++++++++++++++++++++++++++++
         * Map
         * 값을 추가 : put()
         * 특정값을 가져오기 : get(키값)
         * 값을 삭제 : remove()
         * 값을 수정: 동일한 키값에 다른 값
         */

    }
}
