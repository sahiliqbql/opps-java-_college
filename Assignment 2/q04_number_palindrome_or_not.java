import java.util.Scanner;

public class q04_number_palindrome_or_not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int copy = n;
        int s = 0;
        while(n>0){
            int d = n%10;
            s = s*10+d;
            n = n/10;
        }
        System.out.println(s);
        if(copy==s){
            System.out.println("palindrome");
        }else{
            System.out.println("not");
        }
    }
}
