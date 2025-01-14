import  java.util.Scanner;

public class q11_grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter Percentage: ");
        int n = sc.nextInt();
        System.out.println("Grade: ");
        if(n>=90){
            System.out.println("A");
        }else if(n>=80 && n<90){
            System.out.println("B");
        }else if(n>=70 && n<80){
            System.out.println("C");
        }else if(n>=60 && n<70){
            System.out.println("D");
        }else if(n>=40 && n<60){
            System.out.println("E");
        }else{
            System.out.println("F");
        }
    }
}
