// 7. Implement this keyword can be used to return current class instance.

class Cat7 {
    Cat7 getInstance() {
        return this;
    }

    void disp() {
        System.out.println("This is a cat");
    }
}

public class Q07 {
    public static void main(String[] args) {
        Cat7 c = new Cat7();
        c.getInstance().disp();
    }
}
