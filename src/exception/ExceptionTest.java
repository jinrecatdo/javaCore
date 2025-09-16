package exception;

public class ExceptionTest {
    public static void main(String[] args){

        int i = 0;
        int j = 10;
        int nums[] = new int[5];
        String str = null;
        try
        {
         j = 18/j;
         System.out.println(str.length());
         System.out.println(nums[10]);
        }
        catch(ArithmeticException e ){
            System.out.println("Cannot divide by zero. " + e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Stay in your limit");
        }
        catch (Exception e){
            System.out.println("Some thing went wrog");
        }
        System.out.println(j);
        System.out.println("Helo");
    }
}
