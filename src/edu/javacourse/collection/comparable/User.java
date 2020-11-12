package edu.javacourse.collection.comparable;
/*
    Реализовываем интерфейс Comparable и реализация метода compareTo

    "able" - говорит о возможности нашего класса
 */
public class User implements Comparable<User>
{
    private String name;
    private int age;
    private int salary;

    public User() {
    }

    public User(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
    /*
        Переопределяем данный метод
        Он должен возвращать 3 значения 0 -1 1
        0 - равные параметры
     */
    @Override
    public int compareTo(User o) {
        if (this.age == o.age) {
            return 0;
        } else if (this.age < o.age) {
            return -1;
        } else {
            return 1;
        }
    }
}
