package Day6_Assignments;

abstract class Pen{
	
	abstract void write();
	abstract void refill();
	
}

class Fountain_Pen extends Pen{

	@Override
	void write() {
		// TODO Auto-generated method stub
		System.out.println("This is write method inside Fountain Pen class");
		
	}

	@Override
	void refill() {
		// TODO Auto-generated method stub
		System.out.println("This is refill method inside Fountain Pen class");

	}
	
	void nib()
	{
		System.out.println("This is nib method ");

	}
}

class monkey{
	void jump() {
		System.out.println("Jump method...");
	}
	
	void bite() {
		System.out.println("bite method...");
	}
}

class human extends monkey{
	void eat()
	{
		System.out.println("Eat method of human");
	}
	
	void sleep()
	{
		System.out.println("sleep method of human");
	}
	
	void jump() {
		System.out.println("Jump method of human");
	}
	
	void bite() {
		System.out.println("bite method of human");
	}
}
public class Assign_OOPS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fountain_Pen ob = new Fountain_Pen();
		ob.refill();
		ob.write();
		ob.nib();
		
		monkey m =new human();
		m.bite();
		m.jump();

	}

}
