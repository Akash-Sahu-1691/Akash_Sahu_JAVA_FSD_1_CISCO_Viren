package Assignments;



public class Assign2 {
	
	int area;
	float ar;
	
	Assign2()								//default constructor
	{
		System.out.println("Im a default constructor.");
	}
	
	Assign2(int sq)							//Square constructor
	{
		area=sq*sq;
	}
	
	Assign2(float r)						//circle constructor
	{
		ar = 3.14f*r*r;
	}
	
	Assign2(int a,int b)					//rectangle constructor
	{
		area=a*b;
	}
	
	public float area(int h, int b)			//area of traingle
	{
		return (h*b)/2;
	}
	
	public float area(long d1,long d2)		// area of Rhombus
	{
		return d1*d2/2;
	}
	
	public void displaySq()					//Display Square
	{
		System.out.println("Area of square is "+area);
	}
	
	public void displayCircle()				//Display Circle
	{
		System.out.println("Area of circle is "+ar);
	}
	
	public void displayRect()				//Display Rectangle
	{
		System.out.println("Area of rectangle is "+area);
	}
	

	public static void main(String[] args) {

		
		Assign2 o1 = new Assign2();
		Assign2 o2 = new Assign2(3);
		Assign2 o3 = new Assign2(3.5f);
		Assign2 o4 = new Assign2(2,3);
		
		System.out.println("Area of trianle whose height is 4 and base is 5 is "+o1.area(4,5));
		System.out.println("Area of Rhombus whose diagonals are of 5 and 6 is "+o1.area(5L,6L));
		
		o2.displaySq();
		o3.displayCircle();
		o4.displayRect();
		
	}

}
