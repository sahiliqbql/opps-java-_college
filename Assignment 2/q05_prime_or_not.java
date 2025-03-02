import java.util.*;

public class q05_prime_or_not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = 0;
        for(int i=1; i<=n; i++){
            if(n%i==0){
                s++;
            }
        }
        if(s==2){
            System.out.println("prime");
        }else{
            System.out.println("not");
        }
    }
}
