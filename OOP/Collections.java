import java.util.*;

public class Collections {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        System.out.println("List: " + list);
        
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        System.out.println("Set: " + set);
        
        Map<String, Integer> map = new HashMap<>();
        map.put("Alice", 25);
        System.out.println("Map: " + map);
    }
}