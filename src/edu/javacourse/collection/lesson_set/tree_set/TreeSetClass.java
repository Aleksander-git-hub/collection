package edu.javacourse.collection.lesson_set.tree_set;

import java.util.Set;
import java.util.TreeSet;

/*
    TreeSet - позволяет хранить элементы в отсортированном виде

    Для сортировки компонентов TreeSet использует
    специальный объект Comparator
    Comparator - класс, содержащий функцию compare,
    которая сравнивает два объекта

    Для String уже переопределен
 */

public class TreeSetClass
{
    public static void main(String[] args) {
//        Set<String> set = new TreeSet<>();
//        set.add("text");
//        set.add("text2");
//        set.add("text1");
//
//        for (String s : set) {
//            System.out.println(s);
//        }// выйдут в отсортированном виде

        Set<User> set = new TreeSet<>(); // нужно создать компаратор и описать как сортировать
        // в классе User пишем по какому полю хотим сортровать
        set.add(new User());
        set.add(new User());
        set.add(new User());

        for (User user : set) {
            System.out.println(user);
        }
    }
}
