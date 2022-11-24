import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapApp {
    public static void main (String[] args){
        Map<Integer, Integer> map = new LinkedHashMap<>();
        map.put(2,1);
        map.put(1,2);
        map.put(3,3);
        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
