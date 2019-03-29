public class VirtualDemo{
    public static void main(String args[]){
        Salary s = new Salary("Mohd Mohtashim","Ambehta,up",3,3600.00);
        Employee e = new Salary("John Adams","Boston,Ma",2,2400.00);
        System.out.println("Call mailCheck using Salary reference --");
        s.mailCheck();
        System.out.println("\n call Mailcheck using Employee reference--");
        e.mailCheck();
    }
}
