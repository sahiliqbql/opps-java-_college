// 12. Write a program to define a class Fraction having data members 
//     numerator and denominator. Initialize three objects using different 
//     constructors and display its fractional value.


class Fraction {
    int numerator;
    int denominator;

    Fraction() {
        this.numerator = 0;
        this.denominator = 1;
    }
    Fraction(int n) {
        this.numerator = n;
        this.denominator = 1;

    }
    Fraction(int n,int d) {
        this.numerator = n;
        this.denominator = d;
    }

    void dispFraction() {
        System.out.println("Fraction: "+numerator+"/"+denominator);
    }
}

public class Q12 {
    public static void main(String[] args) {
        Fraction f1 = new Fraction();
        Fraction f2 = new Fraction(5);
        Fraction f3 = new Fraction(3,5);
        f1.dispFraction();
        f2.dispFraction();
        f3.dispFraction();
        
    }
}
