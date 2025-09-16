package usrInputUseBuffered;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class uInputDemo {
    public static void main(String[] args) throws IOException {

        int i=0;
        int j = 0;
        int num = 0;
        BufferedReader bf = null ;
        try{
            InputStreamReader in = new InputStreamReader(System.in);
            bf = new BufferedReader(in);
            num = Integer.parseInt(bf.readLine());
            System.out.println(num);
        }
        catch (Exception e){
            System.out.println("Some thing went wrong");
        }
        finally {
            bf.close();
            System.out.println("Hi");
        }
    }
}
