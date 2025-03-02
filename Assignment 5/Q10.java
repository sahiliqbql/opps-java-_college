// 10. Create a “circle” class & a “point” class. The coordinates of the 
//     circle are given and used within the “circle” class as 
//     object of the “point” class. Display the area of circle

class Point {
    int x;
    int y;
}

class Circle {
    int radius;
    Point p = new Point();
    Circle(int r,int x,int y){
        this.radius = r;
        p.x = x;
        p.y = y;
    }
    void area(){
        double a = Math.PI*radius*radius;
        System.out.println("area = "+a);
    }
}

public class Q10 {
    public static void main(String[] args) {
        Circle c = new Circle(10,0,0);
        c.area();
        System.out.println("index = "+c.p.x+","+c.p.y);
    }
}


// area = 314.1592653589793
// index = 0,0
