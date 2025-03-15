// 5. Write a java program to implement multiple inheritance using interface.

interface A {
    void methodA();
}

interface B {
    void methodB();
}

class C implements A, B {
    public void methodA() {
        System.out.println("Method from Interface A");
    }

    public void methodB() {
        System.out.println("Method from Interface B");
    }
}

public class Q05 {
    public static void main(String[] args) {
        C obj = new C();
        obj.methodA();
        obj.methodB();
    }
}
