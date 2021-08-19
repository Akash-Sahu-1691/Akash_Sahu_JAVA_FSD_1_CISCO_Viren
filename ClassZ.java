package Cisco.java.P2;
import Cisco.java.P1.*;

public class ClassZ extends ClassM{

	public static void main(String[] args) {

		new ClassM().methodClassM() ;	// No need , but according to question requirement
		new ClassN().methodClassN();	
		new ClassP().ClassPmethod();	//ClassPmethod() holds info of ClassM and ClassN
		
		new ClassX().ClassXmethod();
		
	}

}
