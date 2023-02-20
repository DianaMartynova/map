import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer,String> firstMap = new HashMap<>();
        firstMap.put(7,"go");
        firstMap.put(0,"golg");
        firstMap.put(77,"gold");
        firstMap.put(54,"gohh");
        Map<Double,Long> secondMap = new HashMap<>();
        secondMap.put(8.9,787878787L);
        secondMap.put(3.2,35472817L);
        secondMap.put(8.4,1723787384L);
        secondMap.put(9.9,337487119L);
        System.out.println(convert(firstMap,secondMap));


    }

    public static Map<Integer, Long> convert(Map<Integer, String> firstMap, Map<Double, Long> secondMap) {
        Map<Integer, Long> map = new HashMap<>();
        for (Map.Entry<Integer, String> entry : firstMap.entrySet()) {
            int key = entry.getKey();

            for (Map.Entry<Double, Long> entryOne : secondMap.entrySet()) {
                long value = entryOne.getValue();
                map.put(key, value);
            }
        }
        return map;
    }
}