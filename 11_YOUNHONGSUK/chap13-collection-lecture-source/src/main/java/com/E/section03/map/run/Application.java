package com.E.section03.map.run;

import java.util.*;

public class Application {

    public static void main(String[] args) {
     /*HashMap*/

        HashMap hm = new HashMap();

        hm.put("1",new Date());
        hm.put("2", "apple");
        hm.put(13, 123);

        System.out.println(hm);
        hm.put(13, 500);// 기존에 있는 key값에 다른 value를 넣어주면 key값이 같이 업데이트된다
        hm.put(11, "apple"); //value는 중복 가능

        System.out.println(hm);
        System.out.println(hm.get(13));
        //get 메소드는 object를 요구하는데 13(int)를 넣어도 auto-boxing을 해주기 때문에 가능

        hm.remove(13);
        System.out.println(hm);

        /*List,ArrayList
        * 값을 추가 add()
        * 값을 삭제 remove()
        * 특정값 가져오기 get(index)
        * 값 수정 set()
        *
        * Map
        * 값을 추가 put()
        * 값을 삭제 remove()
        * 특정값 가져오기 get(key)
        * 값 수정 동일한 키값에 다른 값*/

        /* A hashmap with String as key and value*/
        HashMap<String, String> hm2 = new HashMap<>();
        //<String, Object>, <Integer, Object>
        hm2.put("1", "apple");
        hm2.put("2", "big apple");
        System.out.println(hm2);
        hm2.put("Eric", "is really fucking hungry");
        System.out.println(hm2);

        /*map 순회 방법
        * 1. keySet() */
        Iterator<String> i = hm2.keySet().iterator();
        while (i.hasNext()) {
            String key = i.next();
            String value = hm2.get(key);
            System.out.println(key + value);
        }
        /*2. For each loop*/
        for(String key : hm2.keySet()){
            System.out.println(key + hm2.get(key));
        }

        /*3. Values*/
        Collection<String> values = hm2.values();
        Iterator<String> vi =  values.iterator();
        while (vi.hasNext()) {
            String value = vi.next();
            System.out.println(value);
        }

        /*4. EntrySet()*/
        System.out.println("=======================");
        Set<Map.Entry<String, String>> e = hm2.entrySet();
        Iterator ei = e.iterator();
        while (ei.hasNext()) {
            Map.Entry<String, String> entry = (Map.Entry<String, String>) ei.next();
            System.out.println(entry.getKey() + entry.getValue());
        }

    }
}
