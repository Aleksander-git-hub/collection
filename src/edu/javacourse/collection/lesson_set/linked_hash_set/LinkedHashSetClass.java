package edu.javacourse.collection.lesson_set.linked_hash_set;

import java.util.LinkedHashSet;
import java.util.Set;

/*
    LinkedHashSet - также устроени на HashTable но
    использует связный список
    Хранятся в том порядке, в котором мы их добавляем,
    но работает намного дольше HashSet

 */

public class LinkedHashSetClass
{
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();
        set.add("text");
        set.add("text2");
        set.add("text1");

        for (String s : set) {
            System.out.println(s);
        }
    }
}
