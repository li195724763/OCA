package inhertance;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Lion  extends Animal{
	public static int i = 0;
	public Lion() {
		//this(1); DOES NOT COMPILE
		super(10);
		//this(1); DOES NOT COMPILE
		
		System.out.println("Lion ->");

	}
	
	public Lion(int i) {
		super(10);
	}
	
	public static void overrideMethod() {
		System.out.println("static method in Lion");
	}
	
	public boolean isBird() {
		return false;
	}
	
	public String getName() {
		return "Lion";
	}
	
	public String getNameForLion() {
		return this.getName();
	}
	
	public void throwCheckedException() throws FileNotFoundException {
		
	}
	
	public void throwError() throws StackOverflowError{} 
	@Override
	public void methodThrowCheckedException() {
		
	}
	public static void main(String args[]) {
		Animal a = new Lion();
		//a.methodThrowCheckedException();//does not compile without try catch
	}
}


class SmallLion extends Lion {
	
	public static int i = 1;
	
	public static void overrideMethod() {
		System.out.println("static method in SmallLion, hidden the static method in Lion");
	}
	
	public boolean isBird() {
		return true;
	}
	
	public String getName() {
		return "SmallLion";
	}
	
	
	public String thisPrintName() {
		return this.getName();
	}
	
	public String superPrintName() {
		return super.getName();
	}
	
	public void throwException() {
		//throw new NullPointerException();//OK
		//throw new IOException(); DOES NOT COMPLE. need to declare 
	}
	
	public void throwCheckedException() {//throws FileNotFoundException{ //checked exception needs to follow the override rule
		
	}
	
	public void throwError() throws Error{} //Error no need to follow the override rule
	
	public void throwErrorinBoday() {
		throw new Error();
		
	}//Unlike checked exception, it's No need to declare if throwing in the method body.
	
	private void handleException() throws FileNotFoundException { // checked exception must be declared or handled
		//throw new IOException(); DOES NOT COMPILE, can't throw a border type exception
		//throw new FileNotFoundException();// you can throw a subclass type exception
	}
}

abstract class defaultAbs {
	
	//abstract static int a = 0;DOES NOT COMPILE;
	// abstract static int aMethod();  //DOES NOT COMPILE, abstract method is only public or protected
	
}
