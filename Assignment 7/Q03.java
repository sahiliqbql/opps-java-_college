// 3. Implementation of final keyword before a class.

final class A {
    void disp(){
        System.out.println("class A");
    }
}

class B extends A {
    void disp(){
        System.out.println("class B");
    }
}

public class Q03 {
    public static void main(String[] args) {
        A a = new B();
        a.disp();
    }
}


// error: cannot inherit from final A
// 1 error
