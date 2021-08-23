package Assignments;

public class Assign1 {

	public int add(int a, int b) // Addition of two numbers
	{
		return a + b;
	}

	public float area(float r) // Area of circle
	{
		float res = 3.14f * r * r;
		return res;
	}

	public int recArea(int a, int b) // Area of rectangle
	{
		return a * b;
	}

	public static void main(String[] args) {

		Assign1 ob = new Assign1();
		System.out.println("Addition of 2 and 3 is " + ob.add(2, 3));
		System.out.println("Area of circle whose radius is 3 is" + ob.area(3));
		System.out.println("Area of rectangle whose length is 2 and breadth is 3 is:" + ob.recArea(2, 3));

	}

}
