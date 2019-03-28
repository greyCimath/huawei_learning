public class StringDemo{
    public void addString(){
        String string1 = "saw I was";
        System.out.println("Dot " + string1 + "Tod");
	}

    public void newString(){
        char[] helloArray = {'h','e','l','l','o','.'};
        String helloString = new String(helloArray);
        System.out.println(helloString);
    }

	public static void main(String args[]){
        StringDemo ss = new StringDemo();
        //ss.newString();
        ss.addString();
    }
}
