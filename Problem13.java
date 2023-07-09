import java.util.*;
import java.io.*;
import java.math.*;
public class Problem13 {
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int s = 1;

        for (int i = 0; i < n; i++) {
            int getIn = in.nextInt();
            s += getIn;
            int getOff = in.nextInt();
            s -= getOff;
        }

        System.out.println(s);
    }
}
