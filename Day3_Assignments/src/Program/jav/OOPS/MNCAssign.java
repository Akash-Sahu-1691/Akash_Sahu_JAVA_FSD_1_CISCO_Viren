package Program.jav.OOPS;

abstract class mnc {
	mnc() {
		System.out.println("Im in mnc default constructor");
	}

	public void method1() {
		System.out.println("method in mnc");

	}

	abstract public void dept(); // abstract methods

	abstract public void org();
}

abstract class infosys extends mnc {
	abstract public void dept();

	public void org() {
		System.out.println(" in Infosys");

	}
}

class Hello2 extends infosys {
	public void dept() {
		System.out.println(" in Hello");

	}

	public void method2() { // normal method
		System.out.println("method in Hello2");

	}

}

public class MNCAssign {

	public static void main(String[] args) {
		infosys i = new Hello2(); // dynamic polymorphism
		Hello2 ob = new Hello2();

		i.method1();
		// i.method2(); //calling child class method by base class reference,even
						// method2() isnt defined for infosys.
		ob.method2();
		i.dept();
		i.org();

	}

}
