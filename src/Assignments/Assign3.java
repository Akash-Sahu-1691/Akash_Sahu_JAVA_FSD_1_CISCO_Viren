package Assignments;

public class Assign3 {

	String name;
	int age,m1=0,m2,m3;
	char section;
	char gender;
	
	Assign3(String n,int a,char s,char g,int a1,int a2,int a3)	//Constructor with 3 subject marks
	{
		name=n;
		age=a;
		section=s;
		gender=g;
		m1=a1;
		m2=a2;
		m3=a3;

		
	}
	Assign3(String n,int a,char s,char g,int a2,int a3)		   //Constructor with 2 subject marks
	{
		name=n;
		age=a;
		section=s;
		gender=g;
		m2=a2;
		m3=a3;
	
		
	}
	
	public void display()									   // Display method
	{ 
		int total = m1+m2+m3;
		int perc = total/3;
		
		System.out.println("Name: " + name +"   Age : "+age+"   Section :"+section+"   Gender :"+gender+"   Total Marks:"+total+"   Percentage:"+perc+"%");
	}
	
	
	public static void main(String[] args) {

		Assign3 st1 = new Assign3("Akash",23,'A','M',92,93,90);		
		Assign3 st2 = new Assign3("Sneha",23,'B','F',60,70);
		Assign3 st3 = new Assign3("Abhishek",23,'C','M',80,90);
		
		st1.display();
		st2.display();
		st3.display();
	}


	

}
