package java.assignment1and2.src.Assignment

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Creating a List
        List<String> myList = new ArrayList<>();

        // i) Adding elements to the List
        myList.add("Apple");
        myList.add("Banana");
        myList.add("Orange");
        System.out.println("List after adding elements: " + myList);

        // ii) Removing an element from the List
        myList.remove("Banana");
        System.out.println("List after removing 'Banana': " + myList);

        // iii) Updating an element in the List
        int indexToUpdate = 1;
        String newValue = "Grapes";
        myList.set(indexToUpdate, newValue);
        System.out.println("List after updating element at index " + indexToUpdate + ": " + myList);

        // iv) Getting an element from the List
        int indexToGet = 0;
        String element = myList.get(indexToGet);
        System.out.println("Element at index " + indexToGet + ": " + element);

        // v) Adding another List to the existing List
        List<String> anotherList = new ArrayList<>();
        anotherList.add("Pineapple");
        anotherList.add("Strawberry");
        myList.addAll(anotherList);
        System.out.println("List after adding another list: " + myList);

        // vi) Removing another List from the existing List
        myList.removeAll(anotherList);
        System.out.println("List after removing another list: " + myList);
    }
}
