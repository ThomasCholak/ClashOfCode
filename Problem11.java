import java.util.*;
import java.io.*;
import java.math.*;

public class Problem11 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int d = in.nextInt();
        for (int i = 0; i < d; i++) {
            float weight = in.nextFloat();

            if (weight <= 5) {
                k -= 80;
            } else if (weight>5 && weight<=10){
                k -= 150;
            } else if (weight>10 && weight<=20) {
                k -= 260;
            } else if (weight>30 && weight<=40) {
                k -= 375;
            } else if (weight>50 && weight<=60) {
                k -= 560;
            } else {
                k -= 600;
            }
        }

        if (k<0) {
            System.out.println(Math.abs(k));
        } else {
            System.out.println("Yes");
        }
    }
}
