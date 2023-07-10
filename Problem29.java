import java.util.*;  // 7/9/2023
import java.io.*;
import java.math.*;

//Your program must print N times a given word, on separate lines.
public class Problem29 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        String W = in.next();
        for(int i =0; i<N; i++){
            System.out.println(W);
        }
    }
}
