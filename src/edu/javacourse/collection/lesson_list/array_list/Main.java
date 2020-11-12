package edu.javacourse.collection.lesson_list.array_list;

import java.util.ArrayList;
import java.util.List;

/*
    ArrayList
        capacity = 10;
        newCapacity = (oldCapacity * 3)/2 + 1
 */

public class Main
{
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5); // добавление элемента в список на 0 индекс
        list.add(7); // добавление элемента в список на 1 индекс
        list.add(9); // добавление элемента в список на 2 индекс
        list.add(2, 8); // 1 аргумент - индекс  - вставка
        // 9 сдвинется на след.индекс, на 2 индексе будет 8
        list.set(1, 2); // индекс, значение - перезапись элемента под данным индексом
        // 7 перезапишется двойкой
        System.out.println(list.get(0)); // получение элемента по индексу
        System.out.println(list.size()); // фактическое кол-во элементов

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i)); // O(1) константное время получения элемнта по индексу
        }

//        for (Integer integer : list) {
//            System.out.println(integer);
//        }


    }
}
