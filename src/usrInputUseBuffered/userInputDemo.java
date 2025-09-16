package usrInputUseBuffered;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class userInputDemo {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter your name : ");
        InputStreamReader inr = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(inr);
        int num = Integer.parseInt(bf.readLine());
        System.out.println(num);
        bf.close();;

    }
}
