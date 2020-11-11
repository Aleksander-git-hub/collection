package edu.javacourse.collection.generics;

import edu.javacourse.collection.examples.Example1;
import edu.javacourse.collection.examples.Example2;

import java.util.ArrayList;
import java.util.List;

public class Generics
{
    public static void main(String[] args) {
        List<User> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();
        List<Object> list4 = new ArrayList<>();
        System.out.println("/------------------------------------------/");

//        Example1<User> example1 = new Example1<>();
//        System.out.println(example1.getInstance());
//        example1.setInstance(new User("Alex", 30));
//        System.out.println(example1.getInstance());
//        System.out.println("/------------------------------------------/");

//        Example2.simpleInit(new User());
//
//        Example2<User> example2 = Example2.init(new User());
//        example2.setInstance(new User("Alex", 30));
//        System.out.println(example2.getInstance());
//        System.out.println("/------------------------------------------/");

        List<BaseObject> list5 = new ArrayList<>();
        List<User> list6 = new ArrayList<>();
        List<ChildObject> list7 = new ArrayList<>();

        example1(list5);
        example1(list6);
        example1(list7);

        example2(list5);
        example2(list6);
        example2(list7);

        example3(list5);
        example3(list6);
        example3(list7);
    }

    public static void example1(List<?> list) {

    }

    public static void example2(List<? extends User> list) {

    }

    public static void example3(List<? super User> list) {

    }
}
