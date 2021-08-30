package Day6_Assignments;

import java.lang.Exception;
import java.util.Scanner;

public class Assign_Exception {
	
	
	long power(int n, int p) throws Exception {
	
			if(n<0 || p<0)
				throw new NegativeNumberException("Inputs/Input can't be negative");
			else if(n==0 || p==0)
				throw new ZeroNumberException("Inputs/Input can't be 0");
			else
				return (long) Math.pow(n, p);
		
		
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Assign_Exception ob = new Assign_Exception();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two inputs : ");
		int n = sc.nextInt();
		int p=sc.nextInt();
		
		System.out.println("The result is :"+ob.power(n,p));

	}

}

class NegativeNumberException extends Exception{
	NegativeNumberException(String s)
	{
		super(s);
	}
}

class ZeroNumberException extends Exception{
	ZeroNumberException(String s)
	{
		super(s);
	}
}