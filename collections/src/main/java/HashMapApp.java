import java.util.HashMap;
import java.util.Map;

public class HashMapApp {

    public static void main (String[] args){
        Map<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        System.out.println(map.get("two"));
        System.out.println(map.get("four"));
        System.out.println(map.keySet());
    }
}
