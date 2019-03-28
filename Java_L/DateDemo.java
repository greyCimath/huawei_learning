import java.util.Date;
import java.util.*;
import java.text.*;

public class DateDemo{
	public void showDate(){
		Date date = new Date();
		System.out.printf(date.toString());	
	}

	public void printDate(){
		Date dNow = new Date();
		SimpleDateFormat ft = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
		System.out.printf("Current Date: " + ft.format(dNow));
	}	
	
	public void formatDate(){
		Date date = new Date();
		String str = String.format("Current Date/Time : %tc",date);
		System.out.printf(str);
	}

	public void mutiFormatDate(){
		Date date = new Date();
		System.out.printf("%1$s %2$tB %2$td,%2$tY","Due date: ",date);
	}

	public void sleepDemo(){
		try{
			System.out.println(new Date() + '\n');
			Thread.sleep(5*60*10);
			System.out.println(new Date() + '\n');
		} catch (Exception e){
			System.out.println("Got an exception!");
		}
	}

	public static void main(String args[]){
		DateDemo test = new DateDemo();
		//test.showDate();
		//test.printDate();
		//test.formatDate();
		test.mutiFormatDate();
	}
}
