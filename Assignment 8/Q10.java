// 10.Consider a Student examination database system that prints the 
//    mark sheet of students. Input the following from the command line.
//    (a) Student’s Name
//    (b) Marks in six subjects
//    These marks should be between 0 to 50. If the marks are not in 
//    the specified range, raise a RangeException, else find the total 
//    marks and prints the percentage of the students.



class RangeException extends Exception {
    RangeException(String e_msg){
        super(e_msg);
    }
}

public class Q10 {
    public static void main(String[] args) {
        try {
            if (args.length < 7) {
                throw new IllegalArgumentException("Insufficient arguments. Provide a name and 6 subject marks.");
            }
            String name = args[0];
            int marks[] = new int[6];
            int total = 0;
            for(int i=0; i<6; i++){
                marks[i] = Integer.parseInt(args[i+1]);
                if(marks[i]<0 || marks[i]>50){
                    throw new RangeException("marks out of range");
                }else{
                    total+=marks[i];
                }
            }
            double percentage = (total / 300.0) * 100;
            System.out.println("Student: " + name);
            System.out.println("Total Marks: " + total);
            System.out.println("Percentage: " + percentage + "%");
            
        } catch (RangeException e) {
            System.out.println(e);
        }catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}




// Error: Insufficient arguments. Provide a name and 6 subject marks.
