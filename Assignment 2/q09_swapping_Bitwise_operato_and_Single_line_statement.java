import java.util.*;
public class q09_swapping_Bitwise_operato_and_Single_line_statement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter a: ");
        int a = sc.nextInt();
        System.out.print("enter b: ");
        int b = sc.nextInt();

        // Swapping using bitwise XOR operator
        a = a ^ b;  // a becomes a ^ b
        b = a ^ b;  // b becomes a (original a)
        a = a ^ b;  // a becomes b (original b)

        System.out.println("After swapping using bitwise operator: a = " + a + ", b = " + b);

        // Swapping using single-line statement
        // a = a + b; 
        // b = a - b;
        // a = a - b;
        a = (a + b) - (b = a);

        System.out.println("After swapping using single-line statement: a = " + a + ", b = " + b);
    }
}
