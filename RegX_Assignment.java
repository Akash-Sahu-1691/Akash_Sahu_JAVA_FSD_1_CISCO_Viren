package Program.regex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegX_Assignment {

	public static void main(String[] args) {

		System.out.println (Pattern.matches("^(.+)@(.+).com$", "akooyo@gmail.com"));
		System.out.println (Pattern.matches("^(.+)@(.+).com$", "akooyo123@gmail.com"));
		System.out.println (Pattern.matches("^(.+)@(.+).com$", "akooyo123prepare@co.edu.com"));
		
		System.out.println (Pattern.matches("[+]91[0-9]{10}", "+911234567891"));//Mobile number validation

		System.out.println (Pattern.matches("[A-Z][0-9]{3}[a-zA-Z]{10}", "B890akashSAHU"));//Mobile number validation

	}

}
 