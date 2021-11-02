package inhertance;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.List;
/*import java.util.Date;
import java.sql.Date;*/

import other.*;

public class MainInhertanceTest {
	int instanceA;
	int instanceB;
	static int instanceC;

	public static void main(String[] args) {
		///Date date;
		//double a = null;DOES NOT COMPILE, null is a reference value, can't assign to primitive.
		char assignToIn = 'c';
		int assignToChar = 1;
		//assignToIn = assignToChar;//does not compile
		//assignToChar = assignToIn;//compiles
		Lion ll = new SmallLion();
		System.out.println();
		SmallLion smalLion = new SmallLion();
		Lion lion = new SmallLion();
		Lion lion2 = new Lion();
		System.out.println(smalLion.getNameForLion());
		System.out.println(lion.getNameForLion());
		System.out.println(lion2.getNameForLion());

		System.out.println(Animal.i);
		Animal poly1 = new SmallLion();
		// Lion lionPoly = poly1; DOES NOT COMPILE , need to cast. 
		//casing an Chapter7Util.OBJECT from  superclass to subclass requires explicit cast. BIG assign to SMALL, need cast.

		SmallLion poly2 = new SmallLion();
		Animal animalPoly2 = poly2; // COMPILE, casing an Chapter7Util.OBJECT from subclass to super class doesn't require
									// explicit cast. SMALL assign to BIG, no need to cast.

		Lion polyException = new Lion();
		// SmallLion polyExceptionSmallLion = (SmallLion)polyException; //COMPILE but throw RunTimeException, ClassCastException

		System.out.println(poly2.thisPrintName());
		System.out.println(poly2.superPrintName());
		System.out.println(ll.getNameForLion());

		smalLion.overrideMethod();
		lion.overrideMethod();

		System.out.println(lion.i);
		System.out.println(smalLion.i);

		ArrayList a = new ArrayList();
		List aa = a;

		List b = new ArrayList();
		ArrayList bb = (ArrayList) b;

		try {

		} finally {

		} // finally {} DOES NOT COMPILE, at most one finally is allowed.

		
//		try { 
//			 throwException(); 
//		} catch(IOException e) { // DOES NOT COMPILE if trying to catch a checked exception which is not declared from the calling method, since the exception will never thrown
//		  
//		}
		

		try {

		} catch (StackOverflowError e) {// you can still try to handle an error without compile error

		}

		smalLion.throwException();// no need to handle if the overriden method do not throw any exception.
		smalLion.throwCheckedException();// checked exception must handle, no need to handle if the subclass override
											// method choose not to throw it
		smalLion.throwError(); // Not required to handle error
	}

	private static void throwException() {
	}
	
	public void add() {
		int c = instanceA + instanceB;
	}

}
