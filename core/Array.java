import java.util.HashMap;
import java.util.Map;

public class Array {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "Lina");
        map.put(2, "Crystal Maiden");
        map.put(3, "Windranger");
        System.out.println(map.get(2));
        System.out.println("============================");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        System.out.println("============================");
        // Get all keys
        for (Integer key : map.keySet()) {
            System.out.println(key);
        }

        System.out.println("============================");

        // Get all values
        for (String value : map.values()) {
            System.out.println(value);
        }

        String[] arr = {"sd","sdxx"};
        System.out.println(arr[0]);
        for (String s : arr) {
            System.out.println(s);
        }
    }
}
