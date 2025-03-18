// 6. Write a java program to implement the throw keyword.

public class Q06 {
    public static void main(String[] args) {
        int age = 12;
        if(age<18){
            throw new ArithmeticException("cant vote");
        }else{
            System.out.println("can vote");
        }
    }
}

// Exception in thread "main" java.lang.ArithmeticException: cant vote
//         at Q06.main(Q06.java:7)
