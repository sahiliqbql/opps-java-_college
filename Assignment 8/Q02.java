// 2. Exception CASE-2: Exception creates but properly handled

public class Q02 {
    public static void main(String[] args) {
        try{
            int a = 5/0;
            System.out.println(a);
        }catch(Exception e){
            System.out.println(e);
        }
    }
}

// java.lang.ArithmeticException: / by zero
