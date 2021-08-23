package Program.jav.OOPS;


class employee{
	
	float salary =40000f;
	int bonus =5600;						//Class Vars
	
	public void show()
	{
		System.out.println("Inside parent class");
	}
	
	public void display()
	{
		System.out.println("Here im without any ambuiguity");
	}
}


public class programmer extends employee{
	
	int bonus=10000;
	int salary=20000;
	
	public void show()
	{
		System.out.println("Inside child class");
		System.out.println("Bonus of employee is "+super.bonus);
	}

	public static void main(String[] args) {
		
		programmer ob=new programmer();			//created ob of child class
		ob.show();
		ob.display();
		
		System.out.println("Salary of employee is "+ob.salary);
		System.out.println("bonus of employee is "+ob.bonus);

	}

}
