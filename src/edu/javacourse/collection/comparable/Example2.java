package edu.javacourse.collection.comparable;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Example2
{
    public static void main(String[] args) {
        User user1 = new User("Jhon", 34, 3000);
        User user2 = new User("Mark", 26, 3200);

        Comparator<User> userComparator = new UserComparator();

        Map<User, String> map = new TreeMap<>(userComparator);
        map.put(user1, "text1");
        map.put(user2, "text2");

        for (Map.Entry<User, String> entry : map.entrySet()) {
            System.out.println(entry);
        }
    }
}
