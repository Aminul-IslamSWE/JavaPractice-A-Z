package java.assignment07;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("name", "sonoo");
        hashMap.put("salary", 56000);
        hashMap.put("married", true);

        System.out.println("HashMap: " + hashMap);
    }
}
