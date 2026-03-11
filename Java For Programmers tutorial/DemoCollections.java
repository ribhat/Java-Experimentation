import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class DemoCollections {
    public static void main(String[] args) {
        ArrayList nums = new ArrayList(); // this is a dynammically expandable array. By default, it is an arraylist of
                                          // object types

        nums.add(4);
        nums.add(5);
        nums.add(9);
        nums.add(1);
        nums.add("Navin");

        System.out.println(nums);
        System.out.println(nums.get(2));

        ArrayList<Integer> nums2 = new ArrayList<>(); // Now this arraylist will only accept integers

        nums2.add(4);
        nums2.add(5);
        nums2.add(9);
        nums2.add(1);

        for (int n : nums2) {
            System.out.println(n);
        }

        HashSet<Integer> nums3 = new HashSet<>(); // hashset can only have unique values
        nums3.add(4);
        nums3.add(4); // repeated

        System.out.println(nums3);

        // next lets look at equivalent of python dictionaries

        Map<Integer, String> map = new HashMap<>();
        map.put(101, "Java");
        map.put(102, "Python");
        System.out.println(map);

        map.put(101, "JS"); // this will override the existing value for key 101
        System.out.println(map);
        System.out.println(map.size());

    }
}
