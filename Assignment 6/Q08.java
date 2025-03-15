// 8. Write a java program to implement super() method with parameter.

class Parent {
    Parent(String msg) {
        System.out.println("Parent class constructor: " + msg);
    }
}

class Child extends Parent {
    Child(String msg) {
        super(msg);
        System.out.println("Child class constructor");
    }
}

public class Q08 {
    public static void main(String[] args) {
        Child obj = new Child("Hello from Parent");
    }
}
