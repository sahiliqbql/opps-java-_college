// 11. Write a program to define a class Employee to accept 
//     emp_id, emp _name, basic_salary from the user and display the gross_salary.

class Employee {
    int id;
    String name;
    double basic_salary;
    Employee (int id,String name,double  salary) {
        this.id = id;
        this.name = name;
        this.basic_salary = salary;
    }
    void gross_salary(){
        double hra = (0.20 / 100) * basic_salary;  // HRA = 20% of Basic Salary
        double da = (0.10 / 100) * basic_salary;
        double ta = (0.05 / 100) * basic_salary;
        double gs = basic_salary + hra + da + ta;
        System.out.println("gross_salary = "+gs);
    }
}

public class Q11 {
    public static void main(String[] args) {
        Employee e1 = new Employee(11, "rahul",47000);
        e1.gross_salary();
    }
}

// gross_salary = 47164.5
