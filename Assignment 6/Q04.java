// 4. Write a java program to implement the inheritance in interface.

interface Animal {
    void sound();
}

interface Mammal extends Animal {
    void walk();
}

class Dog implements Mammal {
    public void sound() {
        System.out.println("Dog barks");
    }

    public void walk() {
        System.out.println("Dog walks on four legs");
    }
}

public class Q04 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
        d.walk();
    }
}
