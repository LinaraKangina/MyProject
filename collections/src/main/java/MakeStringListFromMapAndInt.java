import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MakeStringListFromMapAndInt {

    public static void main(String[] args){
        Map<String, Integer> map = new HashMap<>();
        map.put("Один", 1);
        map.put("Два", 2);
        map.put("Три", 3);
        map.put("Четыре", 1);

        System.out.println(getKeyByValue(map,1));
    }
    private static List<String> getKeyByValue(Map<String, Integer> map, int value){
        List<String> result = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : map.entrySet()){
            if (entry.getValue() == value){
                result.add(entry.getKey());
            }
        }
        return result;
    }
}
