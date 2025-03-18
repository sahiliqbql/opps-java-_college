// 5. Write a java program to implement Java Nested try statement


public class Q05 {
    public static void main(String[] args) {
        try {
            try {
                int a = 5/0;
                System.out.println(a);
            } catch (Exception e) {
                System.out.println("inner catch: "+e);
            }
            int[] arr = {1,2,3};
            arr[4] = 10;
        } catch (Exception e) {
            System.out.println("outer catch: "+e);
        }
    }
}

// inner catch: java.lang.ArithmeticException: / by zero
// outer catch: java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 3
