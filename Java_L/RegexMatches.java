import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatches{
	String line = "This order was palced for QT3000!OK?";
	String pattern_1 = "(.*)(\\d+)(.*)";
	
	String REGEX_2 = "cat";
	String INPUT_2 = "cat cat cat cattie cat";

	String REGEX_3 = "foo";
	String INPUT_3 = "foooooooooooooo";
	
	String REGEX_4 = "dog";
	String INPUT_4 = "The dog says meow." + "All dogs say meow.";
	String REPLACE_4 = "cat"; 

	public void showFind(){
		Pattern r;	Matcher m;
		r = Pattern.compile(pattern_1);
		m = r.matcher(line);
		if(m.find()){
			System.out.println("Found value: " + m.group(0));
			System.out.println("Found value: " + m.group(1));
			System.out.println("Found value: " + m.group(2));
		} else{
			System.out.println("NO MATCH");
		}
	}

	public void showStart(){
		Pattern p;	Matcher m;
		p = Pattern.compile(REGEX_2);
		m = p.matcher(INPUT_2);
		int count = 0;
		while(m.find()){
			count++;
			System.out.println("Match number" + count);
			System.out.println("start(): " + m.start());
			System.out.println("end(): " + m.end());
		}
	}

	public void showLookingAt(){
		Pattern r;	Matcher m;
		r = Pattern.compile(REGEX_3);
		m = r.matcher(INPUT_3);
		
		System.out.println("Current REGEX is: " + REGEX_3);
		System.out.println("Current INPUT is: " + INPUT_3);

		System.out.println("lookingAt() " + m.lookingAt());
		System.out.println("matches(): " + m.matches());
	}

	public void showReplace(){
		String str;		
		//p = Pattern.compile(REGEX_4);
		//m = p.matcher(INPUT_4);
		str = str.replaceALL(REGEX_4,REPLACE_4);
		System.out.println(str);
	}

	public static void main(String args[]){
		RegexMatches test = new RegexMatches();
		//test.showFind();
		//test.showStart();
		//test.showLookingAt();
		test.showReplace();
	}
}
