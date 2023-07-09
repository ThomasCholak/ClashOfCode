import java.util.*;
import java.io.*;
import java.math.*;

public class Problem8 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String m = Integer.toString(n);

        int sum = 0; int sum2 = 0;

        for (int i = 0; i < m.length(); i++) {
            if( Character.isDigit(m.charAt(i)) ){
                sum = sum + Character.getNumericValue(m.charAt(i)); //https://stackoverflow.com/questions/21937091/how-to-calculate-sum-of-all-numbers-in-a-string
                sum2 += 1;
            }
        }

        String answer = String.format("%s %d", sum, sum2);

        System.out.println(answer);
    }
}
