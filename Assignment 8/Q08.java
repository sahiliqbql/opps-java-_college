// 8. Finally
// Case 1: finally example where exception doesn't occur.
// Case 2: finally example where exception occurs and not handled.
// Case 3: finally example where exception occurs and handled.


class Case1 {
    public void div(){
        try {
            System.out.println("Case1 try");
        } finally {
            System.out.println("Case1 Done");
        }
    }
}

class Case2 {
    public void div(){
        try {
            int c = 5/0;
        } finally {
            System.out.println("Case2 Done");
        }
    }
}

class Case3 {
    public void div(){
        try {
            int c = 5/0;
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e);
        } finally {
            System.out.println("Case3 Done");
        }
    }
}


public class Q08 {
    public static void main(String[] args) {
        Case1 c1 = new Case1();
        Case2 c2 = new Case2();
        Case3 c3 = new Case3();
        c1.div();
        c2.div();
        c3.div();
    }
}


// Case1 try
// Case1 Done

// Case2 Done
// Exception in thread "main" java.lang.ArithmeticException: / by zero
//         at Case2.div(Q08.java:20)
//         at Q08.main(Q08.java:46)

// Exception caught: java.lang.ArithmeticException: / by zero
// Case3 Done
