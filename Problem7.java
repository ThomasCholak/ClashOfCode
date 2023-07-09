import java.util.*;
import java.io.*;
import java.math.*;
public class Problem7 {
    public static void main(String args[]) {
        String example = "Hello, I am a sample String. I am very cool and awesome. I am doing swell! Hope you are too? Thanks.";

        String example2 = example.replace(' ', '_');
        example2 = example2.replace("._", ". ");
        example2 = example2.replace("!_", "! ");
        example2 = example2.replace("?_", "? ");

        System.out.println(example2);
    }
}
