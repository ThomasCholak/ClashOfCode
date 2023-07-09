import java.util.*;
import java.io.*;
import java.math.*;
public class Problem5 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        char ch;

        String s2 = "", s3 = "";

        for (int i = 0; i < s.length(); i += 2) {
            s2 += s.charAt(i);
        }

        for (int i = 0; i < s2.length(); i++) {
            ch = s2.charAt(i);
            s3 = ch + s3;
        }

        System.out.println(s3);
    }
}
