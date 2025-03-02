// 5. Implementation of this keyword to pass as an argument in the method.

class Cat5 {
    void disp(Cat5 obj){
        System.out.println("this is a cat");
    }

    void callMethod(){
        disp(this);
    }
}

public class Q05 {
    public static void main(String[] args) {
        Cat5 c = new Cat5();
        c.callMethod();
    }
}
