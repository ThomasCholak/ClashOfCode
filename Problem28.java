import java.util.*;  // 7/9/2023
import java.io.*;
import java.math.*;

/*
You are given a patient. Every patient has a unique amount of teeth.
Each tooth is either healthy 1, rotten 0 or pulled out -. Pull out any rotten teeth you find.
 */

//EX:
//Input:
//2
//----------1---------
//----------0---------
//Output:
//----------1---------
//--------------------
public class Problem28 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        if (in.hasNextLine()) {
            in.nextLine();
        }
        //String my_new_string = "";
        String my_new_str = null;
        for (int i = 0; i < N; i++) {
            String ROW = in.nextLine();
            my_new_str = ROW.replace("0", "1");
        }
        System.out.println(my_new_str);
    }
}
