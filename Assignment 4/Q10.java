// 10. Create a general class ThreeDObject and derive the classes Box, Cube, 
//     Cylinder and Cone from it. The class ThreeDObject has methods wholeSurfaceArea ( ) 
//     and volume ( ). Override these two methods in each of the derived classes 
//     to calculate the volume and whole surface area of each type of three-dimensional objects.
//     The dimensions of the objects are to be taken from the users and passed through 
//     the respective constructors of each derived class. Write a main method to test these classes.

abstract class ThreeDObject {
    abstract double wholeSurfaceArea();
    abstract double volume();
}

class Box extends ThreeDObject {
    double length, width, height;

    Box(double l, double w, double h) {
        length = l;
        width = w;
        height = h;
    }

    double wholeSurfaceArea() {
        return 2 * (length * width + width * height + height * length);
    }

    double volume() {
        return length * width * height;
    }
}

class Cube extends ThreeDObject {
    double side;

    Cube(double s) {
        side = s;
    }

    double wholeSurfaceArea() {
        return 6 * side * side;
    }

    double volume() {
        return side * side * side;
    }
}

public class Q10 {
    public static void main(String[] args) {
        Box b = new Box(3, 4, 5);
        System.out.println("Box Volume: " + b.volume());
        System.out.println("Box Surface Area: " + b.wholeSurfaceArea());

        Cube c = new Cube(4);
        System.out.println("Cube Volume: " + c.volume());
        System.out.println("Cube Surface Area: " + c.wholeSurfaceArea());
    }
}
