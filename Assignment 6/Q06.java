// 6. Write a java program to implement super keyword in java.

class Parent {
    int num = 100;
}

class Child extends Parent {
    int num = 200;

    void show() {
        System.out.println("Child num: " + num);
        System.out.println("Parent num: " + super.num);
    }
}

public class Q06 {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.show();
    }
}
