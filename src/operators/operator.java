package operators;
import Object.object;

public class operator {
    public static void main(String[] args){
        int num1 = 2, num2 = 9;
        int result = num1 % num2;
        boolean b = num1 > num2 || 1>0;
        String s = "nghi hoc";
         object ob = new object();
         ob.sayHi();


        System.out.println( b);
        for(int i=4;i<5;++i){

            System.out.println(i);
        }

        switch (s){
            case "di hoc":
                System.out.println("Monday");
                break;
            case "nghi hoc":
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("Xin chao");
        }

        while(num1 > 10){
            System.out.println("Xin Chao");
        }

    }
}
