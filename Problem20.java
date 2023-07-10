import java.util.*;
import java.text.DecimalFormat;

/**
 Percent error is the difference between estimated value and the actual value in comparison to the actual value
 and is expressed as a percentage. In other words, the percent error is the relative error multiplied by 100.
 Using the formula : Percent Error = |(Estimated Value - Actual Value) / Actual Value| * 100
 **/

// 7/9/2023
public class Problem20 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();

        double z = (Math.abs(x-y));
        double a = (z/y)*100;

        DecimalFormat f = new DecimalFormat("##.00");
        System.out.println(f.format(a));

    }
}