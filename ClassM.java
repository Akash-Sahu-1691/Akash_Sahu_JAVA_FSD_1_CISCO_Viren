package Cisco.java.P1;


public class ClassM {



		private int p = 100 ;
		long l;
		protected float pi;
		

		public void methodClassM()		//Had to made public, so that this method can be access by other package non-subclass
		{
			
			System.out.println("Value of private int from classM : " + p);
			System.out.println("Value of default long from classM :" + l);
			System.out.println("Value of protected float from classM :" + pi);
		}
}
