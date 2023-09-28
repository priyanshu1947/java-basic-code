import java.sql.SQLOutput;
import java.util.*;


public class LearnMap
{
    public static void main(String[] args) {
        Map<String, Integer> set = new HashMap<>();

        set.put("one ", 1);
        set.put("two",2);
        set.put("three", 3);
        set.put("four",4);
        set.put("five",5);
        System.out.println(set);

        for(Map.Entry<String, Integer> e: set.entrySet())
        {
            System.out.println(set);
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
        for (String key: set.keySet())
        {
            System.out.println(key);
        }
        for( Integer Value : set.values())
        {
            System.out.println(Value);
        }
        System.out.println(set.containsKey("five"));
        System.out.println(set.containsValue(5));

        System.out.println(set.isEmpty());

    }
}
