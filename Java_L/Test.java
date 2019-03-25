public class Test{
    public void pupAge(){
        int age = 0;
        // int age;
        age = age + 7;
        System.out.println("Puppy age is :" + age);
    }
	
	public void testLoop(){
		int x = 10;
		while(x < 20){
			System.out.println("value of x : " + x);
			x++;
			System.out.print("\n");
		}
	}
	
	public void testLoop_2(){
		int x = 0;
		do{
			System.out.println("value of x : " + x);
			x++;
			System.out.println("\n");
		}while(x < 20);
	}

	public void testLoop_3(){
		for(int x = 10;x < 20;x++){
			System.out.print("value of x : " + x + "\n");
		}
	}
	
	public void testNewLoop(){
		int[] numbers = {10,20,30,40,50};
		for(int x : numbers){
			System.out.print(x);
			System.out.print(",");
		}
		System.out.print("\n");
		String[] names = {"James","Larry","Tom","Lacy"};
		for(String name : names){
			System.out.print(name);
			System.out.print(",");
		}
	}

	public void testContinue(){
		int[] numbers = {10,20,30,40,50};
		for(int x : numbers){
			if(x == 30){
				continue;
			}
			System.out.print(x);
			System.out.print("\n");
		}
	}	

	public void testInBox(){
		Integer x = 5;		// boxes int to an Integer object
		x = x + 10;			// unboxes the Integer to a int
		System.out.println(x);
	}

	public void testNumber_Math_Method(){
		String a = "1x";	int aa = 0;
		aa = Integer.parseInt(a);
		System.out.println(a);
		System.out.println("*");
		//System.out.print("\n");
	}

    public static void main(String args[]){
        Test test = new Test();

		//test.pupAge();
		//test.testLoop();
		//test.testLoop_2();
		//test.testLoop_3();
		//test.testNewLoop();
		//test.testContinue();
		//test.testInBox();
		test.testNumber_Math_Method();
    }
}
