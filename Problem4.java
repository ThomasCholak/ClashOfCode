import java.util.*;
import java.io.*;
import java.math.*;
public class Problem4 {
    public static void main(String args[]) {
        System.out.println("Please enter a number:"); Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String m = Integer.toString(n);
        String nstr="";
        char ch;


        for (int i=0; i<m.length(); i++)
        {
            ch= m.charAt(i);
            nstr= ch+nstr;
        }

        if (nstr.equals(m)) {
            if (n%2==0) {
                System.out.print("YES");
            }
            else {
                System.out.print("yes");
            }
        } else {
            System.out.print("no");
        }
    }
}
