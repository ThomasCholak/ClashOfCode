import java.util.*;
import java.io.*;
import java.math.*;

//Creates a radius around a gingerbread man (specified by user)
//Can use any character of your choice for the array
public class Problem14 {
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (in.hasNextLine()) {
            in.nextLine();
        }
        String c = in.nextLine();

        String repeated = new String(new char[n]).replace("\0", c);
        String repeated2 = new String(new char[n*2+9]).replace("\0", c);

        for (int i = 0; i < n; i++) {
            System.out.println(repeated2);
        }

        System.out.println(repeated+"   ___   "+repeated);
        System.out.println(repeated+" _(*_*)_ "+repeated);
        System.out.println(repeated+"(_  o  _)"+repeated);
        System.out.println(repeated+"  /-o-\\  "+repeated);
        System.out.println(repeated+" (_/ \\_) "+repeated);

        for (int i = 0; i < n; i++) {
            System.out.println(repeated2);
        }

    }
}
