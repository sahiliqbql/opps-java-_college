// 9. Create a user-defined exception named CheckArgument to check 
//    the number of arguments passed through the command line. 
//    If the number of argument is less than 5, throw the 
//    CheckArgumentexception,else print the addition of all the five numbers.


class myException extends Exception {
    myException(String e_msg){
        super(e_msg);
    }
}

public class Q09 {
    public static void main(String[] args) {
        try {
            if(args.length<5){
                throw new myException("less than 5 args");
            }else{
                int sum = 0;
                for(String s:args){
                    sum += Integer.parseInt(s);
                }
                System.out.println("sum = "+sum);
            }
        } catch (myException e) {
            System.out.println("Exception = "+e);
        }
    }
}


// Exception = myException: less than 5 args

