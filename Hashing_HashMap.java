import java.util.*;

public class Hashing_HashMap {
    public static void main(String[] args) {
        //HashMap for country population as <key, value>
        HashMap<String, Integer> map = new HashMap<>();

        //Insertion
        map.put("Pakistan", 25);
        map.put("China", 150);
        map.put("India", 120);

        //Print map
        System.out.println(map);

        //Updating value
        map.put("China", 170);

        //Searching
        //Searching for key
        if(map.containsKey("India")) {
            System.out.println("Key is present in map");
        } else {
            System.out.println("Key is not present in map");
        }

        //Searching for value
        System.out.println(map.get("China"));
        System.out.println(map.get("Africa"));

        System.out.println("\nIterating in HashSet through EntrySet:-\n");

        //Iteration in HashSet through EntrySet
        for(Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.getKey() + "-->" + e.getValue());
        }
        System.out.println();

        System.out.println("\nIterating in HashSet through KeySet:-\n");

        //Iteration in HashSet through KeySet
        Set<String> keys = map.keySet();
        for(String key : keys) {
            System.out.println(key + " " + map.get(key));
        }

    }    
}
