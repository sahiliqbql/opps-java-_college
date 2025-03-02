// 9. Implementation of this keyword as local variable suppressor.

class Q09 {
    int x;

    void setX(int x) {
        this.x = x;
    }

    void display() {
        System.out.println("Value of x: " + x);
    }

    public static void main(String[] args) {
        Q09 obj = new Q09();
        obj.setX(100);
        obj.display();
    }
}
