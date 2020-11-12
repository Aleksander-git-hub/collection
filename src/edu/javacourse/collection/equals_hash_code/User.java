package edu.javacourse.collection.equals_hash_code;

import java.util.Objects;

public class User
{
    private int age;
    private int salary;

    public User() {
    }

    public User(int age, int salary) {
        this.age = age;
        this.salary = salary;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age &&
                salary == user.salary;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, salary);
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", salary=" + salary +
                '}';
    }
}
