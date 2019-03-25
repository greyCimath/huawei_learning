import java.io.*;
public class EmployeeTest{
    public static void main(String args[]){
        // using constructor to constructe 2 object
        Employee empOne = new Employee("Jame Smith");
        Employee empTwo = new Employee("Mary Anne");

        // using two object with object method
        empOne.empAge(26);
        empOne.empDesignation("Senior Software Engineer");
        empOne.empSalary(1000);
        empOne.printEmployee();

        empTwo.empAge(21);
        empTwo.empDesignation("Software Engineer");
        empTwo.empSalary(500);
        empTwo.printEmployee();

    }
}
