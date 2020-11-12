package edu.javacourse.collection.lesson_set.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/*
    Set - это 1 часть из коллекции Map - это ключ Map
 */

public class SetClass
{
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>(); // Hash table
        set.add("text");
        set.add("text1");
        set.add("text2");
        set.add("text2");

        // чтобы вернуть элемент нужен Iterator
        // используется более сложная структура (нет игдекса)
//        for (Iterator<String> stringIterator = set.iterator(); stringIterator.hasNext(); ) {
//            String text = stringIterator.next();
//            System.out.println(text);
//        }

//        Iterator<String> iterator = set.iterator();
//        while (iterator.hasNext()) {
//            String next = iterator.next();
//            System.out.println(next);
//        }

        for (String s : set) {
            System.out.println(s);
        } // 1. нет дубликата 2. идут не в том порядке в каком добавляли
    }
}
