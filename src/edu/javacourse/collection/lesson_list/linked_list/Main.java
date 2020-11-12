package edu.javacourse.collection.lesson_list.linked_list;

import java.util.LinkedList;
import java.util.List;

/*
    Linked List основан на Node

    []{-[]-}[][][][][][][]
    |      |             |
    first   Node          last

    Node - элемент и 2 ссылки
    ссылка на след. элемент и на предыдущий
    чтобы получить например 5 элемент нужно пройти с 0 индекса по 4 и там
    есть ссылка на 5 элемент

    Если сделать ставку в середину то это произойдет возможно
    немного быстрее, нужно перезаписать только ссылку
 */

public class Main
{
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(5); // добавление элемента в список на 0 индекс
        list.add(7); // добавление элемента в список на 1 индекс
        list.add(9); // добавление элемента в список на 2 индекс
        list.add(2, 8); // 1 аргумент - индекс  - вставка
        // 9 сдвинется на след.индекс, на 2 индексе будет 8
        list.set(1, 2); // индекс, значение - перезапись элемента под данным индексом
        // 7 перезапишется двойкой

        System.out.println(list.size()); // фактическое кол-во элементов

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i)); // O(n) n - количество элементов до нашего элемента
        }
    }
}
