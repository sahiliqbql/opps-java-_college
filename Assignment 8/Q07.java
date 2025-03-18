// 7. Write a java program to implement the throws keyword.

public class Q07 {
    public static void main(String[] args) {
        int age = 12;
        try {
            if(age<18){
                throw new ArithmeticException("cant vote");
            }else{
                System.out.println("can vote");
            }
        } catch (ArithmeticException e) {
            System.out.println("Exception:"+e);
        }
    }
}


// Exception:java.lang.ArithmeticException: cant vote
