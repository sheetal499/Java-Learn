import java.util.*;
public class HashMap_ {
    public static void main(String[] args) {
        HashMap<String,Integer> map =new HashMap<>();
        map.put("Sheetal",20);
        map.put("Simran",21);
        map.put("Kusum",23);
        map.put("Anshika",21);
        System.out.println(map);
        for(Map.Entry<String,Integer> e : map.entrySet())
        {
            System.out.println(e.getKey());
        }

        Set <String> keys=map.keySet();
        for(String s:keys) {
            System.out.println(s);
        }
    }
}