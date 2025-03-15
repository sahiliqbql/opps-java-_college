// 7. Write a java program to implement super() method without parameter.


class Parent {
    Parent() {
        System.out.println("Parent class constructor");
    }
}

class Child extends Parent {
    Child() {
        super();
        System.out.println("Child class constructor");
    }
}

public class Q07 {
    public static void main(String[] args) {
        Child obj = new Child();
    }
}
