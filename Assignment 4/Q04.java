// 4. Implementation of this keyword to invoke current class constructor.

class ThisConstructor {
    ThisConstructor() {
        System.out.println("Default Constructor");
    }

    ThisConstructor(int x) {
        this(); // Calls default constructor
        System.out.println("Parameterized Constructor: " + x);
    }

    public static void main(String[] args) {
        ThisConstructor obj = new ThisConstructor(10);
    }
}
