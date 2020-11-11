package edu.javacourse.collection;

/*
    - Iterable
        - Collection
            - List
            - Set
            - Queue

    - Map
 */

import java.util.*;

public class Main
{
    public static void main(String[] args) {
        int[] arr = new int[4];
        String[] arr2 = new String[7];
        arr2[0] = "str";

        List<String> list = new ArrayList<>();
        list.add("str");
        list.add("str1");
        list.add("str2");
        list.add("str3");
        System.out.println("List: " + list);

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(1);
        System.out.println("Set: " + set);

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "str");
        map.put(2, "str2");
        map.put(3, "str3");
        map.put(3, "str5");
        map.put(4, "str4");
        System.out.println("Map: " + map);

    }
}
