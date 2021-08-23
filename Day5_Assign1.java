package Assignments;
import java.util.*;

public class Day5_Assign1 {

	public static void main(String[] args) {

		
		String t="Delhi";
		String o="Mumbai";
		String k="delhi";
		String y=new String("Mumbai");
		String l=new String("delhi");
		String p=new String("Hello");
		
	

		System.out.println("o equals with l :"+o.equals(l));
		System.out.println("Result is o == l :"+o == l);
		
		System.out.println("y equals with p :"+y.equals(p));
		System.out.println("y == p :" +y == p);
		
		System.out.println("t equals with o :"+t.equals(o));
		System.out.println("t == o :"+t == o);
		
		System.out.println("y equals with k :"+y.equals(k));
		System.out.println("y == k :"+y == k);
		
		System.out.println("y equals with p :"+y.equals(p));
		System.out.println("y == p :"+o == l);
	}

}
