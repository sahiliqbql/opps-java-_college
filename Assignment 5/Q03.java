// 3. Write a java program to implement the single inheritance in java.


class Animal {
    void eat(){
        System.out.println("can eat");
    }
}
class Cat extends Animal {

}

public class Q03 {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.eat();
    }
}
