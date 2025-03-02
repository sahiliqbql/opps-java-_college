// 2. Write a java program to implement of constructor overloading.

class Cat2 {
    String name;
    Cat2(){
        System.out.println("this is a cat");
    }
    Cat2(String name){
        this.name = name;
        System.out.println(this.name);
    }
}

public class Q02 {
    public static void main(String[] args) {
        Cat2 d = new Cat2();
	    Cat2 d1 = new Cat2("tom");
    }
}
