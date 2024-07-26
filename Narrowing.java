
import java.util.*;

public class Narrowing {
    public static void main(String args[]) {
        double d = 532.66;
        long l = (long) d;
        int i = (int) l;
        System.out.println("double: " + d);
        System.out.println(" long : " + l);
        System.out.println(" int: " + i);
    }
}
