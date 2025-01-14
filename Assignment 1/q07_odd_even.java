import java.util.Scanner;

public class q07_odd_even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n: ");
        int n = sc.nextInt();
        if(n%2==0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
    }
}

