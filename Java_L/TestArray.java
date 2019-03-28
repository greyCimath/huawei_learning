public class TestArray{
    public static double[] myList = {1.9,2.9,3.5,3.4};

    public void Array(){
        for(int i = 0;i < myList.length;i++){
            System.out.println(myList[i] + " ");
        }
        double total = 0;
        for(int i = 0;i < myList.length;i++){
            total += myList[i];
        }
        System.out.println("Total is " + total);
        double max = myList[0];
        for(int i = 1;i < myList.length;i++){
            if(myList[i] > max){
                max = myList[i];
            }
        }
        System.out.println("Max is " + max);
    }

    public void testLoop(){
        for(double element : myList){
            System.out.println(element);
        }
    }

    public void ArrayUse2FunctionDigit(double[] array){
        for(double element : array){
            System.out.print(element + " ");
        }
    }

    public static double[] resverse(double[] array){
        // this method is used to show the array in to function's return element
        double[] result = new double[array.length];
        for(int i = 0,j = result.length - 1;i < array.length;i++,j--){
            result[j] = array[i];
        }
        return result;
    }

    public void printArray(double[] array){
        for(double element : array){
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String args[]){
        TestArray test = new TestArray();
        double[] ans;
        //test.Array();
        //test.testLoop();
        //test.ArrayUse2FunctionDigit(myList);
        //test.printArray(resverse(myList));
        ans = test.resverse(myList);
        test.printArray(ans);
    }
}
