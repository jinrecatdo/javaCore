package exception;

public class Throw {
    public static void main(String[] args){
        int i =1 ;
        int j = 1;
        int f= 0;
        try{
            j= 18/j;
            if (f == 0)
                throw new JinException("Jin Exception is here ");
            if(i==0)
                throw new ArithmeticException("I dont want to print zero");
        }
        catch (JinException e){
            j = 18/1;
            System.out.println("That is the default out put " + e);
        }
        catch (Exception e){
            System.out.println("Somthing went wrong");
        }

    }
}
