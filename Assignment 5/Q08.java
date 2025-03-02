// 8. Implementation of dynamic method dispatch in java.

class A {
    void disp(){
        System.out.println("this is A");
    }
}

class B extends A{
    void disp(){
        System.out.println("this is B");
    }
}


public class Q08 {
    public static void main(String[] args) {
        A a = new B();
        a.disp();
    }
}

