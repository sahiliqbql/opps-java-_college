
class Cat {
    String name;

    Cat(String st) {
        this.name = st;
    }
}

public class Q08_parameterized_constructor {
    public static void main(String[] args) {
        Cat c = new Cat("Tom");
        System.out.println(c.name);
    }
}
