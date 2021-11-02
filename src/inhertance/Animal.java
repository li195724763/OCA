package inhertance;

abstract class Animal {
	public Animal(int i) {
		System.out.print("Animal " + i + " -> ");
	}
	
	//abstract Animal () {} Can have constractors, Does Not Compile if marked as Abstract.
	
	
	abstract public String getName() ;
	
	//abstract public String getName2() ; //Only does not compile on the first direct child
	
	public static int i = 0;
	
	//public abstract  int a; DOES NOT COMPILE, abstract only work on method
	
	//abstract private String getName1() ; DOES NOT COMPILE for private
	
	 // abstract  public static String getName3() ;DOES NOT COMPILE, static with abstract	
	
	
	//static abstract String getName2() ; DOES NOT COMPILE, static abstract can't be together.
	
	public void methodThrowCheckedException() throws Exception  {
		
	}
}

interface first{
	//final static void method1() {//;does not compile
	//final default void method2() {}//does not compile
	void method3();
	default void method4() {}
}


interface second{
	//final static void method1() {//;does not compile
	//final default void method2() {}//does not compile
	void method3();
	default void method4() {}
}

abstract class third implements first,second{
	//final static void method1() {//;does not compile
	//final default void method2() {}//does not compile
	public void method4() {}//does not compile if not override
}
