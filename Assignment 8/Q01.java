// 1. Exception CASE-1: Problem without exception handling
// 3. Exception CASE-3: Exception creates but not handled

public class Q01 {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        int c = a/b;
        System.out.println(c);
    }
}

// Exception in thread "main" java.lang.ArithmeticException: 
//        by zero at Q01.main(Q01.java:7)
