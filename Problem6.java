import java.util.*;
import java.io.*;
import java.math.*;
public class Problem6 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();

        int C = A - B;
        int D = A + B;

        String E = Integer.toString(C);
        String F = Integer.toString(D);

        System.out.println(E + F);
    }
}
