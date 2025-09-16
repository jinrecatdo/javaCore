package datastructure;

import Object.object;

public class Array {
    public static void main(String[] args){

        int num[] = new int[4] ;
        num[1] = 2;
        int num1[][] = new int[3][5];
        for (int x : num){
            System.out.println(x);
        }
        for (int n[] : num1){
            for(int m : n){
                System.out.print(m + " ");
            }
            System.out.println();
        }
        object ob[] = new object[5];

        for(int i = 0; i < ob.length;i++){
            System.out.println(i);
        }
        object obb = new object();

        System.out.println(obb.acc);

    }

}
