package Program.jav.OOPS;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class CollectionAssign1 {


	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		LinkedHashSet L1 = new LinkedHashSet ();
		LinkedHashSet <Integer> L2 = new LinkedHashSet <Integer> ();
		
		System.out.println("Enter two integers between 1 - 8");
		L1.add(sc.nextInt());
		L1.add(sc.nextInt());
		
		System.out.println("Enter two floats");
		L1.add(sc.nextFloat());
		L1.add(sc.nextFloat());
		
		System.out.println("Enter two chars");
		L1.add(sc.next().charAt(0));
		L1.add(sc.next().charAt(0));
		
		System.out.println("Enter a boolean");
		L1.add(sc.nextBoolean());
		
		System.out.println("LinkedHashSet L1 is : "+ L1);
		
		System.out.println("Enter number 1 to 8 in random order for 8 times");
		L2.add(sc.nextInt());
		L2.add(sc.nextInt());
		L2.add(sc.nextInt());
		L2.add(sc.nextInt());
		L2.add(sc.nextInt());
		L2.add(sc.nextInt());
		L2.add(sc.nextInt());
		L2.add(sc.nextInt());

		System.out.println("hashSet 2 is : "+ L2);
		
		
		TreeSet<String> h = new TreeSet<>();

		h.add("C");
		h.add("C++");
		h.add("Java");
		h.add("JS");
		h.add("Pearl");
		h.add("Erlang");
		
		h.remove("C");
		h.remove("C++");
		
		h.add("Html");
		h.add("CSS");
		h.add("JQuery");
		
		System.out.println("Is java there ? : "+ h.contains("Java"));
		
		System.out.println("treeSet is : "+ h);	

		
		h.clear();	//clearing all objects from TressSet
		
		System.out.println("After removing all elements, we get : "+ h);	


		
	}

}
