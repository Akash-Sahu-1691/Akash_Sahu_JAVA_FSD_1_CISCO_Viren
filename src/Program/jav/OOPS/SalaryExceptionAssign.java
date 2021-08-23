package Program.jav.OOPS;


// CUSTOM EXCEPTION EXAMPLE 


public class SalaryExceptionAssign {

	static void check(int num) throws CustomException1 {

		if (num < 2000)
			throw new CustomException1("You need to work hard");
		else if (num > 2100 && num < 5000)
			System.out.println("Your salary is somehow good");
		else
			System.out.println("Your salary is Awesome");
	}

	public static void main(String[] args) {
		try {
			check(1500);
		} catch (Exception e) {
			System.out.println("Exception occured : " + e.getMessage());

		} finally {
			System.out.println("Handled properly");

		}

	}

}

class CustomException1 extends Exception {
	CustomException1(String s) {
		super(s);
	}
}