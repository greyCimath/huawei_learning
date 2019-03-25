import java.io.*;
public class Employee_3{
    // salary is a static  private variable
    private static double salary;
    // department is a static final constant
    //public static final String DEPARTMENT = "Department";
    public final static String DEPARTMENT = "Department";
    public static void main(String args[]){
        salary = 1000;
        System.out.println(DEPARTMENT + "average salary:" + salary);
    }
}
