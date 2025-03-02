// 7. Implementation of method overriding in java.


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


public class Q07 {
    public static void main(String[] args) {
        A a = new B();
        a.disp();
    }
}

