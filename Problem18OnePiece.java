import java.util.*;
import java.io.*;
import java.math.*;

// One Piece reference
public class Problem18OnePiece {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (in.hasNextLine()) {
            in.nextLine();
        }

        int i = 0;

        for (int j = 0; j < n; j++) {
            String fruits = in.nextLine();
            if(fruits.equals("paramecia")){
                i += 75;
            } else if (fruits.equals("zoan")) {
                i += 25;
            } else {
                i += 100;
            }
        }
        System.out.println(i);
    }
}
