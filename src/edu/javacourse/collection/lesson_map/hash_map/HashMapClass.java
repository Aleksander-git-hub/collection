package edu.javacourse.collection.lesson_map.hash_map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*
    HashTable основано на так называемых корзинах (basket)
    Это обычный массив, который хранит структуру Node
    они похлжи на Node LinkedList
    По умолчанию данный массив создается на 16 ячеек
    Есть параметр Default load factor = 0.75
    Это процент при котором наша коллекция увеличит размер в 2 раза
    Размер HashMap это всегда 2^в какой то степени

    Как определяется индекс ячейки где хранится наша пара:

 */

public class HashMapClass
{
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("text", 5); // ключи уникальны!
        map.put("text", 7); // ключи уникальны!
        map.put("text1", 7); // значения могут повторятся

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry);
        }
/*
        Обращаемся к коллекции Map. Записываем все пары из коллекции map в
        коллекцию set для того чтобы получить iterator для прохлждения по
        данным элементам
 */
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> next = iterator.next();
            System.out.println(next);
        }

    }
}
