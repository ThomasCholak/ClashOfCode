import java.util.*;  // 7/9/2023
import java.io.*;
import java.math.*;

/*
A ball is dropped and bounces.
At each rebound, the ball reaches half the height of the previous rebound.

How high the ball must be dropped so it reaches exactly the height H after the sixth rebound?
 */

//EX: Input: 5
//   Output: 320

public class Problem27 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int H = in.nextInt();
        int sum = H*2;

        /*
        for(int i=0; i<H; i++){
             sum *= 2;
         }
        */

        System.out.println(sum*2*2*2*2*2);
    }


}
