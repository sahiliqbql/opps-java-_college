// 8. Prove that this keyword refers to the current class instance variable.

class Q08 {
    int x = 10;

    void show(int x) {
        System.out.println("Local variable x: " + x);
        System.out.println("Instance variable x: " + this.x);
    }

    public static void main(String[] args) {
        Q08 obj = new Q08();
        obj.show(20);
    }
}

