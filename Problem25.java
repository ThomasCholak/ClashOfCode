import java.util.*;  // 7/9/2023
import java.io.*;
import java.math.*;

//Returns average ASCII value of a string
//EX:
//Input: abc
//Output: 98
public class Problem25 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        char[] ch = new char[s.length()];
        int sum = 0;

        //int castAscii = (int) ch;

        for(int i =0; i < s.length(); i++){
            sum += s.charAt(i);
        }

        System.out.println(sum/s.length());
    }

}
