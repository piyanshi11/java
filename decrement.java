import java.util.*;

public class decrement {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the value of a:");
        int a = input.nextInt();
        int b = --a;
        System.out.println("a: " + a + ", b: " + b);
    }
}
