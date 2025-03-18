// 4. Write a java program to implement Java Multi catch block

public class Q04 {
    public static void main(String[] args) {
        try {
            int a = 5/0;
            int[] arr = {1,2,3};
            System.out.println(a);
            System.out.println(arr[4]);
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }
}

// java.lang.ArithmeticException: / by zero
