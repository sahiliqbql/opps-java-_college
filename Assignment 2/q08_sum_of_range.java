// 1 2 3 4 ...
import java.util.Scanner;

public class q08_sum_of_range {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the starting number: ");
        int start = sc.nextInt();
        System.out.print("Enter the ending number: ");
        int end = sc.nextInt();

        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += i;
        }
        System.out.println("The sum of numbers from " + start + " to " + end + " is: " + sum);
    }
}
