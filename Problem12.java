import java.util.*;
import java.io.*;
import java.math.*;
public class Problem12 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        String s2 = "";

        for (int i = 0; i < s.length(); i++) {  // https://www.geeksforgeeks.org/how-to-remove-all-non-alphanumeric-characters-from-a-string-in-java/

            boolean b1 = Character.isAlphabetic(s.charAt(i));
            boolean b2 = Character.isWhitespace(s.charAt(i));

            if (b1 || b2) {
                s2 += s.substring(i, i + 1);
            }
        }

        System.out.println(s2);
    }
}
