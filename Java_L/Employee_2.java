import java.io.*;
public class Employee_2{
    // variable is visible
    public String name;
    // vairable is only visible in this class
    private double salary;

    public Employee_2(String empName){
        name = empName;
    }
    public void setSalary(double empSalary){
        salary = empSalary;
    }
    public void printEmp(){
        System.out.println("name : " + name);
        System.out.println("Salary : " + salary);
    }

    public static void main(String args[]){
        Employee_2 empOne = new Employee_2("Ransika");
        empOne.setSalary(1000);
        empOne.printEmp();
    }
}
