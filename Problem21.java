import java.util.*;
import java.text.DecimalFormat;

// reverse game mode
// 7/9/20203
public class Problem21 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();

        double y = x*3.141142857;
        DecimalFormat f = new DecimalFormat("##.00");

        if(y==0.0) {
            System.out.println("0");
        } else {
            System.out.println(f.format(y));
        }
    }
}
