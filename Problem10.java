import java.util.*;
import java.io.*;
import java.math.*;

/**
 You need to find the Crazy Factorial of a given number n.

 --> What exactly is a Crazy Factorial?

 It means after computing the factorial of n, the result will be divided by Sum of the Digits in the number.

 --> Example:

 n = 5. 5! = 5 * 4 * 3 * 2 * 1 which is 120. 120 has 3 digits- 1,2,0 and 1+2+0=3, so you divide 120 by 3 = 40 the Crazy Factorial of 5.

 Note: It can be shown that the Crazy Factorial is always an integer under the current given constaints.
 **/
public class Problem10 {

    public static void main(String args[]){

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int fact=1;

        for(int i=1;i<=n;i++){ // calculates the factorial
            fact=fact*i;
        }

        String m = Integer.toString(fact);

        System.out.println(fact / m.length());
    }
}
