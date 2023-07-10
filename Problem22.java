import java.util.*;
import java.io.*;
import java.math.*;

//NOTE: Only had time to solve for 1 of the testcases
public class Problem22 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        char someChar = ' ';
        int n=0;

        for (int i = 0; i < N; i++) {
            String c = in.next();
            n = in.nextInt();
            someChar = c.charAt(0);
        }
        in.nextLine();
        String LINE = in.nextLine();

        int count=0;

        for (int i = 0; i < LINE.length(); i++) {
            if (LINE.charAt(i) == someChar) {
                count++;
            }
        }
        //System.out.println(LINE.length());
        System.out.println(count/n);
    }
}
