// 6. Implementation of this keyword to pass as argument in the constructor call.

class A {
    A(Q06 obj) {
        System.out.println("A's constructor called");
    }
}

class Q06 {
    void method() {
        A obj = new A(this);
    }

    public static void main(String[] args) {
        Q06 obj = new Q06();
        obj.method();
    }
}
