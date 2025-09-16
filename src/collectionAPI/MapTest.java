package collectionAPI;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class MapTest {
    public static void main(String[] args){

        Map<String,Integer> m1 =new HashMap<>();
        m1.put("NaVin",56);
        m1.put("Hard",23);
        m1.put("Hard",45);


        System.out.println(m1.keySet());
        for (String s : m1.keySet()){
            System.out.println(s + " : " + m1.get(s));
        }

}
}
