import java.util.*;
import java.io.*;
import java.math.*;

/*
Initially output equals 0. Iterate through each number in the input and perform the following operation:
If the number is odd: Multiply it to output
If the number is even: Add it to the output
 */

//Example:
//Input = 5
//        2 4 8 10 6
//Output = 30

// 7/9/2023
public class Problem24 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt(); //specifies length of array

        int output = 0;

        for (int i = 0; i < count; i++) {

            int number = in.nextInt();

            if(number%2==0)
                output += number;
            else
                output *= number;
        }

        System.out.println(output);
    }

}
