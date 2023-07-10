import java.util.*;  // 7/9/2023
import java.io.*;
import java.math.*;

/*
Your program must compute the value of a linear function at the given points.

A linear function is of the form f(x) = a * x + b, with a and b, two constant values.
You are given the values a, b and a set of N values of x.
You must compute the value of f(x) for each of the N values of x.
 */
public class Problem30 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int x = in.nextInt();
            System.out.println((a*x)+b);
        }
    }
}
