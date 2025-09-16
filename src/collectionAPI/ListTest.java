package collectionAPI;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args){
        List<Integer> l1 = new ArrayList<>();
        l1.add(5);
        l1.add(6);
        for (Object n : l1){
            System.out.println((Integer) n);
        }
        System.out.println(l1);
    }
}
