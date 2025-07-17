// package Java.Course;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import OOPS.AccessModifiers.A;

public class Collections {
    public static void main(String[] args) {

        int[] arr1 = { 1, 2, 3, 4 };

        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }

        List<Integer> arr = new ArrayList<>();
        // int[] arr = { 1, 2, 3, 4, 5 };
        arr.add(5);

        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }

        Map<String, Integer> mark = new HashMap<>();
        mark.put("Joel", 92);
        mark.put("Josh", 100);

        for (Map.Entry<String, Integer> entry : mark.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}
