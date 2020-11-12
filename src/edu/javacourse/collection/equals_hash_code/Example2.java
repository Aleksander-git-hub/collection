package edu.javacourse.collection.equals_hash_code;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Example2
{
    public static void main(String[] args) {
        Map<User, String> map = new HashMap<>();
        map.put(new User(30, 3000), "Alex");
        map.put(new User(30, 3000), "Jhon");

//        Iterator<Map.Entry<User, String>> iterator = map.entrySet().iterator();
//        while (iterator.hasNext()) {
//            Map.Entry<User, String> next = iterator.next();
//            System.out.println(next);
//        }

        for (Map.Entry<User, String> entry : map.entrySet()) {
            System.out.println(entry);
        }

    }
}
