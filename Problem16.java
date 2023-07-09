import java.util.*;
import java.io.*;
import java.math.*;
public class Problem16 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        String name = s.replaceAll("\\s","");
        int j = 0;
        for (int i = 0; i < name.length(); i++) {
            //if(Character.isAlphabetic(name.charAt(i))){
            if(Character.isUpperCase(name.charAt(i)))
                j--;
            if(Character.isLowerCase(name.charAt(i)))
                j++;

            //}
        }
        System.out.println(Math.abs(j));
    }
}
