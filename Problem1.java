import java.util.*;
import java.io.*;
import java.math.*;

public class Problem1 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String log = in.nextLine();

        int x =0;

        for (int i=0;i<log.length();i++){
            char ans = log.charAt(i);
            if (ans == '('){
                x++;
            } else if (ans == ')') {
                x--;
            }
        }

        System.out.println(x);
    }
}
