// 9. Create an interface called Player. The interface has an abstract method called play() 
    // that displays a message describing the meaning of “play” to the class. Create classes called Child, 
    // Musician, and Actor that all implement Player. Create an application that demonstrates the use of 
    // the classes(UsePlayer.java



interface Player {
    void play();
}

class Child implements Player {
    public void play() {
        System.out.println("A child plays with toys.");
    }
}

class Musician implements Player {
    public void play() {
        System.out.println("A musician plays an instrument.");
    }
}

class Actor implements Player {
    public void play() {
        System.out.println("An actor plays different roles.");
    }
}

public class Q09 {
    public static void main(String[] args) {
        Player p1 = new Child();
        Player p2 = new Musician();
        Player p3 = new Actor();

        p1.play();
        p2.play();
        p3.play();
    }
}

