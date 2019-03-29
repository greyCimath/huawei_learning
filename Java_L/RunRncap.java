public class RunEncap{
    public static void main(String ages[]){
        EncapTest encap = new EncapTest();
        encap.setName("James");
        encap.setIdNum("12343ms");
        encap.setAge(20);

        System.out.println("Name : " + encap.getName() + " Age: " + encap.getAge());
    }
}
