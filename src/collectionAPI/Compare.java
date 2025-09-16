package collectionAPI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Compare {
    public static void main(String[] args){

        Comparator<Integer> c1 = new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 % 10 > o2 % 10)
                    return 1;
                else
                return -1;
            }
        };
        List<Integer> l1 = new ArrayList<>();
        l1.add(43);
        l1.add(31);
        l1.add(72);
        l1.add(29);
        Collections.sort(l1,c1);

        System.out.println(l1);

        List<CollectionStudent> ls1 = new ArrayList<>();
        ls1.add(new CollectionStudent(21,"Loc"));
        ls1.add(new CollectionStudent(22,"Nam"));
        ls1.add(new CollectionStudent(19,"Noc"));
        ls1.add(new CollectionStudent(55,"Jin"));
        Collections.sort(ls1);

        for (CollectionStudent ls : ls1){
            System.out.println(ls);
        }
        System.out.println(ls1);


    }
}
