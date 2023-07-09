import java.util.*;
import java.io.*;
import java.math.*;
public class Problem9 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String s2 = "";

        for(int i = 0; i < s.length(); i++){
            if(Character.isUpperCase(s.charAt(i))){
                s2 += s.charAt(i);
            } else {
                s2 += "";
            }
        }

        if (s2.isEmpty()){
            System.out.println("None");
        } else {
            System.out.println(s2);
        }
    }
}
