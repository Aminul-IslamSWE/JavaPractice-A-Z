package java.assignment07;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Create a set
        Set<Integer> set = new HashSet<>();

        // i) Add elements to the set
        set.add(1);
        set.add(2);
        set.add(3);

        // ii) Remove elements from the set
        set.remove(2);

        // iii) Update an element in the set (remove old value, add new value)
        set.remove(1);
        set.add(4);

        // iv) Get an element from the set
        int element = 3;
        if (set.contains(element)) {
            System.out.println(element + " is present in the set.");
        } else {
            System.out.println(element + " is not present in the set.");
        }

        // v) Add elements from another set
        Set<Integer> anotherSet = new HashSet<>();
        anotherSet.add(5);
        anotherSet.add(6);
        set.addAll(anotherSet);

        // vi) Remove elements from another set
        set.removeAll(anotherSet);

        // Display the elements in the set
        System.out.println("Elements in the set: " + set);
    }
}
