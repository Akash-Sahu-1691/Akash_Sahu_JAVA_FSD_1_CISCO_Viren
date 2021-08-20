package Program.jav.OOPS;

class vehicle {
	int speed = 40;
	long distance = 100l;

	vehicle() {
		System.out.println("Im in default constructor of vehicle");

	}

	vehicle(int n) {
		System.out.println("Im in parametrized constructor of vehicle");
		fuel(2);			
		fuel(110f, "Abc");
		fuel('X', 420);
		run();
		stop();

	}

	public void fuel(int a) {
		System.out.println("pump number: " + a);
	}

	public void fuel(float a, String n) {
		System.out.println("fuel price: " + a + " name " + n);

	}

	public void fuel(char a, int b) {
		System.out.println("Symbol: " + a + "Street number: " + b);

	}

	public void run() {
		System.out.println("run() of vehicle");
	}

	public void stop() {
		System.out.println("stop() of vehicle");

	}

	public void display() {
		// We will have to define display() , even though keep its body empty, else
		// gives "display() undefined for vehicle".

	}

}

class w2 extends vehicle {

	int speed = 45;
	long distance = 110l;
	int tyre = 2;

	w2() {
		System.out.println("Im in default constructor of 2w");
	}

	public void stop() {
		System.out.println("stop() of w2");

	}

	public void run() {
		System.out.println("run() of w2");
	}

	public void display() {
		System.out.println("speed of w2 :" + speed);
		System.out.println("distance of w2 :" + distance);
		System.out.println("tyre of w2 :" + tyre);
		System.out.println("speed of vehicle :" + super.speed);
		System.out.println("distance of vehicle :" + super.distance);
	}
}

class w3 extends vehicle {

	int speed = 50;
	long distance = 120l;
	int tyre = 3;

	w3() {
		System.out.println("Im in default constructor of 3w");
	}

	public void stop() {
		System.out.println("stop() of w3");

	}

	public void run() {
		System.out.println("run() of w3");
	}

	public void display() {
		System.out.println("speed of w3 :" + speed);
		System.out.println("distance of w3 :" + distance);
		System.out.println("tyre of w3 :" + tyre);
		System.out.println("speed of vehicle :" + super.speed);
		System.out.println("distance of vehicle :" + super.distance);
	}
}

class w4 extends vehicle {

	int speed = 55;
	long distance = 130l;
	int tyre = 4;

	w4() {
		System.out.println("Im in default constructor of 4w");
	}

	public void stop() {
		System.out.println("stop() of w4");

	}

	public void run() {
		System.out.println("run() of w4");
	}

	public void display() {
		System.out.println("speed of w4 :" + speed);
		System.out.println("distance of w4 :" + distance);
		System.out.println("tyre of w4 :" + tyre);
		System.out.println("speed of vehicle :" + super.speed);
		System.out.println("distance of vehicle :" + super.distance);
	}
}

class w8 extends vehicle {

	int speed = 60;
	long distance = 140l;
	int tyre = 8;

	w8() {
		System.out.println("Im in default constructor of 8w");
	}

	public void stop() {
		System.out.println("stop() of w8");

	}

	public void run() {
		System.out.println("run() of w8");
	}

	public void display() {
		System.out.println("speed of w8 :" + speed);
		System.out.println("distance of w8 :" + distance);
		System.out.println("tyre of w8 :" + tyre);
		System.out.println("speed of vehicle :" + super.speed);
		System.out.println("distance of vehicle :" + super.distance);
	}
}

public class vehicleAssign {

	public static void main(String[] args) {
		
		new vehicle(2);// calling parametrized constructor
		System.out.println(" ");

		vehicle ob;
		ob = new w2(); // Runtime Polymorphism
		ob.display();
		System.out.println(" ");

		ob = new w3();
		ob.display();
		System.out.println(" ");

		ob = new w4();
		ob.display();
		System.out.println(" ");

		ob = new w8();
		ob.display();

	}

}
