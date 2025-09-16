package collectionAPI;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionDemo {
    public static void main(String[] args){
        Collection<Integer> nums = new ArrayList();
        nums.add(6);
        nums.add(7);
//        nums.add("xin chao");


        for (Object n : nums){
            System.out.println((Integer) n);
        }
        System.out.println(nums);



    }
}
