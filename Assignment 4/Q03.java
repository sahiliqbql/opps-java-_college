// 3. Implementation of this keyword to invoke current class method.

class ThisExample {
    void show() {
        System.out.println("show() method called");
    }

    void display() {
        this.show(); // Invoking current class method
    }

    public static void main(String[] args) {
        ThisExample obj = new ThisExample();
        obj.display();
    }
}
