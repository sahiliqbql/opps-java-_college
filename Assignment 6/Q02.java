// 2. Write a java program to implement interface.


interface Vehicle {
    void start();
}

class Car implements Vehicle {
    public void start() {
        System.out.println("Car is starting...");
    }
}

public class Q02 {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        myCar.start();
    }
}
