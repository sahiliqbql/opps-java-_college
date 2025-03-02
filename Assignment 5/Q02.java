// 2. Write a java program to implement the static method in java.


public class Q02 {
    static int a = 10;
    static void increment(){
        a++;
    }
    public static void main(String[] args) {
        System.out.println(a);
        increment();
        System.out.println(a);
    }
}


// 10
// 11
