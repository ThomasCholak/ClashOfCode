import java.util.*;
import java.io.*;
import java.math.*;
public class Problem2 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int answer1 = n/2;
        int answer2 = n+answer1;

        System.out.println(answer2);
    }
}
