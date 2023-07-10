import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// EX: Given the string "120789466" find the sum of only the even numbers
// -> 2+0+8+9+4+6+6=26

public class Problem23 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        long N = in.nextLong();
        String numbers=String.valueOf(N);
        int sum  = 0;

        //code here from: https://www.quora.com/How-do-I-convert-a-long-number-string-into-a-list-of-integers-in-Java
        String[] a = numbers.split("\\B");  // splits the string on non word boundaries, producing an array of strings each has one digit
        Stream<String> b = Arrays.stream(a);  // convert to a stream of Strings
        Stream<Integer> c = b.map(s->Integer.valueOf(s)); // convert to a stream of Integers
        List<Integer> d =  c.collect(Collectors.toList()); // convert back to a list
        //

        for(int i = 0; i < d.size(); i++){
            if(d.get(i)%2==0)
                sum += d.get(i);
        }

        System.out.println(sum);
    }
}

