// 1. Implementation of final keyword before a variable.

public class Q01 {
    public static void main(String[] args) {
        final int a = 10;
        a = 20;
        System.out.println(a);
    }
}

// error : cannot assign a value to final variable
