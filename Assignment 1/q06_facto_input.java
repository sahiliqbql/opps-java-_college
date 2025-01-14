import java.util.Scanner;

public class q06_facto_input {
    public static void main(String[] args) {
        System.out.print("enter n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 1;
        for(int i=1; i<=n; i++){
            ans = ans*i;
        }
        System.out.println("fact = "+ans);
    }
}
