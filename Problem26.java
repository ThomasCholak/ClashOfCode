import java.util.*;  // 7/9/2023
import java.io.*;
import java.math.*;

//REVERSE MODE
//Input: 3
//Output: +++
//        +++
//        +++
public class Problem26 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        String plus = "+";

        for(int i = 0; i<s; i++){
            System.out.println(plus.repeat(s));
        }
    }
}
