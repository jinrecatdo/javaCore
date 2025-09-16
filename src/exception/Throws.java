package exception;

public class Throws {
    static{
        System.out.println("Class Loader");
    }
    public static void main(String[] args){

        int i = 0;
        int j = 1;
        ExceptionA ea = new ExceptionA();
        try {
            ea.show();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
