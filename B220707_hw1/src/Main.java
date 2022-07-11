import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/*    Дана Map<String, String>, если в ней есть ключ ‘a’ и ‘b’,
то нужно  создать новый ключ ‘ab’ с суммой значений от ключей a и b.
mapAB({"a": "Hi", "b": "There"}) → {"a": "Hi", "ab": "HiThere", "b":"There"}
mapAB({"a": "Hi"}) → {"a": "Hi"}
mapAB({"b": "There"}) → {"b": "There"}
 */
public class Main {
    public static void main(String[] args) {
        Map<String,String> map = new TreeMap<>();
        map.put("a","Hi");
        System.out.println(makeABMap(map));
        map.put("b","Here");
        System.out.println(makeABMap(map));
        System.out.println(map);
        map.remove("a");
        System.out.println(makeABMap(map));
    }

    public static Map<String,String> makeABMap(Map<String,String> map){
        Set<String> keySet = map.keySet();
        if (map.containsKey("a") && map.containsKey("b")){
            Map<String,String> result = new TreeMap<>(map);  // если есть изменения - новый map
            result.put("ab",map.get("a")+map.get("b"));
            return result;
        } else {
            return map;
        }
    }
}
