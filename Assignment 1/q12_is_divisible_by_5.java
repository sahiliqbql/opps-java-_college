import java.util.Scanner;

public class q12_is_divisible_by_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n: ");
        int n = sc.nextInt();
        if (n % 5 == 0) {
            System.out.println("divisible");
        } else {
            System.out.println("not divisible");
        }
    }
}
