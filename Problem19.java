import java.util.*;
import java.io.*;
import java.math.*;

/*
Repeat the given string N times and output the result to the console
If N=0 the output "empty"
*/

// 9/9/2023
public class Problem19 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        if (in.hasNextLine()) {
            in.nextLine();
        }
        String string = in.nextLine();

        if(N != 0){
            for(int i = 0; i < N; i++)
                System.out.print(string);
        } else {
            System.out.print("empty");
        }
    }

}
