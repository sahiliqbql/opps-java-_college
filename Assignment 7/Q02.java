// 2. Implementation of final keyword before a method.

class Parent {
    final void disp(){
        System.out.println("parent");
    }
}

class child extends Parent {
    void disp(){
        System.out.println("child");
    }
}

public class Q02 {
    public static void main(String[] args) {
        Parent obj = new child();
        obj.disp();
    }
}

// error: disp() in child cannot override disp() in Parent
// overridden method is final

