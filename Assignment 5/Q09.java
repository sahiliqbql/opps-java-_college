// 9. Write a java program to stop method overriding.



class A {
    final void disp(){
        System.out.println("this is A");
    }
}

class B extends A{
    // void disp(){
    //     System.out.println("this is B");
    // }
    // will result in a compilation error
}


public class Q09 {
    public static void main(String[] args) {
        A a = new B();
        a.disp();
    }
}

