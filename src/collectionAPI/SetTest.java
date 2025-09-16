package collectionAPI;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {
    public static void main(String[] args){
        Set<Integer> s1 = new HashSet<Integer>();
        s1.add(3);
        s1.add(6);
        s1.add(8);
        s1.add(2);
        s1.add(3);
        Iterator<Integer> i1 = s1.iterator();
        while (i1.hasNext()){
            System.out.println(i1.next());
        }
        for (int n : s1){
            System.out.println(n);
        }
        System.out.println(s1);
    }
}
