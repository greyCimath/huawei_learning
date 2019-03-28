public class TestMax{
	/** main method */
	public static void main(String args[]){
		int i = 5;
		int j = 2;
		int k = max(i,j);
		System.out.println("The maximum between " + i + " and " + j + " is " + k);
	}

	/** return the max of two intgers */
	public static int max(int num1,int num2){
		int result;
		if(num1 > num2){
			result = num1;
		} else{
			result = num2;
		}
		return result;
	}
	
	public static double max(double num1,double num2){
		if(num1 > num2){
			return num1;
		} else{
			return num2;
		}
	}
}
