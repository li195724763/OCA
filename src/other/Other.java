package other;

interface Other1 {
	static final String i = "From Interface without keyword public";
	
	public Double override(); 
	
	 default void printString() {} ;
	//public static abstract void printString1() {System.out.println("this is a default method");} DOES NOT COMPILE, abstact can't be used to static method
}


interface Other2 {
	void printString();
}


interface testInterfaceOverride extends Other1, Other2 {
	//public double override() {} DOES NOT COMPILE, double is not a covarient of Double

	default void printString() {} ;
	
	
}
