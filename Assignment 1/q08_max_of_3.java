import java.util.Scanner;

public class q08_max_of_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 3 num: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a>b){
            if(a>c){
                System.out.println("max = "+a);
            }else{
                System.out.println("max = "+c);
            }
        }else{
            if(b>c){
                System.out.println("max = "+b);
            }else{
                System.out.println("max = "+c);
            }
        }
    }
}
