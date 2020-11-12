package edu.javacourse.collection.comparable;

import java.util.Comparator;

/*
    2 метод реализации
    используем интерфейс Comparator

    Здесь переопределяем метод compare
    и тут в аргументах уже 2 объекта приходит
 */
public class UserComparator implements Comparator<User>
{

    @Override
    public int compare(User o1, User o2) {
        if (o1.getSalary() == o2.getSalary()) {
            return 0;
        } else if (o1.getSalary() < o2.getSalary()) {
            return -1;
        } else {
            return 1;
        }
    }
}
