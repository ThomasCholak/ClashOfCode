import java.util.*;
import java.io.*;
import java.math.*;

public class Problem15 {
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        int value = 0;

        Scanner in2 = new Scanner(System.in);
        String name = in2.nextLine();

        String name2 = name.replaceAll("\\s","");
        int x=Integer.parseInt(name2);

        for (int i = 0; i < N; i++) {

            double xi = x;
            double y = Math.sqrt(xi);

            value += (int)y;
        }
        System.out.println(value);

    }
}
