package Day6_Assignments;

import java.util.Scanner;

public class Assign_Palindrome {
	
	char a[];

	
	int check(String name)
	{
		int flag=0,j=0;
		
        char[] b = new char[name.length()];//cea
        
        for (int i = 0; i < name.length(); i++) {
            b[i] = name.charAt(i);
        }
        
        char[] a = new char[name.length()];
        
        for (int i = name.length()-1;i>=0; i--) {
            a[i] = name.charAt(i);
        }

		for(int i=name.length()-1;i>=0;i--)
		{
			if(a[i]==b[j])
			{
				flag=1;
				
			}else {
				flag=0;
				break;
			}
			j++;
				
		}
		return flag;
	}
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Assign_Palindrome ob = new Assign_Palindrome();
		
		System.out.println("Enter name : " );
		String name = sc.nextLine();
		
		if(ob.check(name)==1)
			System.out.println("Yes it is a Palindrome");
		else
			System.out.println("Not a Palindrome");


		
	}

}
