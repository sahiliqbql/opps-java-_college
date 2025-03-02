// 1. Implementation of method overloading with respect to parameter number, parameter data type.

class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class Q01 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        
        System.out.println(calc.add(2, 3));       // Output: 5
        System.out.println(calc.add(2.5, 3.7));   // Output: 6.2
        System.out.println(calc.add(1, 2, 3));     // Output: 6
    }
}
