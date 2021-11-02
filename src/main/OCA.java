package main;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.function.*;
import java.util.*;
import java.sql.*;

//import static java.util.*; DOES NOT COMPILE
import static java.util.Arrays.sort;
import static java.util.Collections.sort; //NO NEED TO PUT () and input parameter list.

import java.io.FileNotFoundException;
import java.io.IOException;


 class OCA {// can omit the access modifier "public" \
	/*********OCA QUESTION****************/
	static int[] ocaQuestion14;
	/*********OCA QUESTION****************/
	static Object good = new OCA();
	public void Main() throws Exception {
		number = 5;
	}
	final static public double AAAAAA = 1.0; 
	final protected int thursday = 4;
	//private String s;
	static String scruffy ;//DOES NOT COMPILE if marked as final
	public String  nonStaticString  = "Scruffy";
	static final int A = 1;
	final static int B = 5;
	double four = 4.;
	static int charInt =  (int)'c';
	  {
		scruffy = "abc";
		nonStaticString = "bcd";
		//instance initializer can initialize non-final static member.
	}
	//final static int Bb ;// COMPILE ERROR due to not initialize a final memeber.
	final public  double AA = 1.0;
	boolean barray[] = {true, true};
	 
	enum Season {WINTER, SPRING, SUMMER, FALL}
	static public  final void main(String... ardsfgs) {
		int abc = new Integer(1);// This compiles
		Integer efg = new Integer(5);
		
		String assingtoInt[][][] = new String[1][][];
		Object[] obj = assingtoInt;
		
		int [] enhancedFor1 = new int[] {1,3,5};
		for(Object j : enhancedFor1)// AUTOBOXING!!!!
		{}
		int lable = 0;
		lable: lable += 1;
		//break lable; DOES NOT COMPILE
		
		

		//assingtoInt[0] = 1; DOES NOT COMPILE
		
		//String asdf = 10;// DOES NOT COMPILE, can't assign a int to String
		efg.byteValue();
		// 
		/*
		 * Main m = new Main(); A a; System.out.println(m.number); double dNum = 123;
		 * System.out.println(dNum); int oct = 016; int bin = 0b10; double dddd = 1.1d;
		 * float fff = 1111.0f;
		 * 
		 * //int deci = 5.1; float hhh = 123; System.out.println(oct);
		 * System.out.println(bin); System.out.println(m.s); long max = 1231123; if(1 >=
		 * 1) System.out.println("abc");
		 */
		Integer xx = null;
		int yyy = 0;
		/*
		 * if(xx==yyy) {
		 * 
		 * }
		 *///Allow compare Wrapper class and primitive type
		
		String sBoolean = "abc";
		sBoolean.equals(100f);//compile!!!Autoboxing
		String bBoolean = bBoolean = "bcd"; //DOES NOT COMPILE if "final String bBoolean = bBoolean = "bcd";" since you are trying to set a final twice
		String tiger = "Tiger";
		String lion = "Lion";
		//String statement = 250 > 338 ? lion : tiger = "is Bigger"; DOES NOT COMPILE since the expression value of "250 > 338 ? lion : tiger" is not a variable
		
		if(true) {
			int i = 0;
		} else {
			int i = 1;
		}

		
		System.out.println("bBoolean is " + bBoolean);
		//System.exit(0);
		scruffy.isEmpty();
		integerToInt(new Integer(2)); // unboxing is valid.
		//String does't have capacity() function.
		String[] lizard = {"iguana", "gecko"};
		List<String> list = Arrays.asList(lizard);
		list.set(1, "");
		System.out.println("the list is " + list.get(1));
		System.out.println("the value of charInt casing from C is " + charInt);
		
		Integer daysOfWeek = 0;
		switch(daysOfWeek) {
		case 0:
			System.out.println("Sunday");//break;
		case 1:
			System.out.println("Monday");//break;
	
		case 6:
			System.out.println("Saturday");
		default :
			System.out.println("Weekday");
		case 2:
			System.out.println("Tuesday");//break;
		case 3:
			System.out.println("Wednesday");
		}

		Season ss = Season.SUMMER;
		switch(ss) {
		case WINTER : WINTER : System.out.println("case enum WINTER");
		break;
		}
		//for(int i=0; i<5;i=i++) //INFINITE LOOP
		//System.out.println("i is " + i);
		System.out.println("out of for loop ");
		boolean bol = false;
		int x = 0;
		int primitiveInt = 0;
		Integer wrapperInt = null;
		Double wrapperDou = 100d;
		
		if(primitiveInt == wrapperDou) {
			System.out.println("primitive and wrapper are equal");
		} else {
			System.out.println("primitive and wrapper are not equal");
		}
		
		/*
		 * for(int x = 0; x <1 ; x++) { //DOES NOT COMPILE for duplicate variable in for loop
		 * 
		 * }
		 */
		
		//String s = null;
		//s = bol; DOES NOT COMPILE, can't assign boolean to String
		//if(x == s) {} does not compile
		/*
		 * do { int ia =0; }while(ia > 1); //dose not compile, out of scope
		 */
		boolean aa = false;
		boolean bb = true;
		
		boolean cc = aa && (bb = false);
		int[] braceArray = {1,2,3};
		//boolean dd = aa+bb; DOES NOT COMPILE, invalid operator

		//for(int i=0;i<10;) {
			//i= 0;
		//i = ++i;	
			//System.out.println("the value of i is " + i);
		//}
		 //infinate loop, since i reset to 0
		
		System.out.println("ABC" == "ABC");
		
		List<String> enhancedFor = new ArrayList<String>();
		enhancedFor.add("e");
		enhancedFor.add("n");
		enhancedFor.add("h");
		enhancedFor.add("a");
		enhancedFor.add("n");
		enhancedFor.add("c");
		enhancedFor.add("e");
		enhancedFor.add("d");
		enhancedFor.add(" ");
		enhancedFor.add("f");
		enhancedFor.add("o");
		enhancedFor.add("r");
		//enhancedFor.add(1);DOES NOT COMPILE when trying to add a int to <String> type.
		enhancedFor.add("\n");
		for(String s : enhancedFor) { System.out.print(s);}
		
		List<Integer> l1 = new ArrayList(); // NOTICE THE left-hand side
		
		l1.add(1);
		
		int[]aary = new int[3];
		int []bary = {1,2,3};
		int cary[] = new int[] {1,2,3};
		//int cary[] = new int[3] {1,2,3};// DOES NOT COMPILE
		
		int twoD[][] = {};
		
		
		OCA mtoS = new OCA();
		String chapter3 = "abc";
		chapter3 = chapter3 + 1;
		System.out.println(aary.toString());
		System.out.println(mtoS.toString());
		ArrayList<Integer> arrlist = new ArrayList();
		arrlist.add(1);
		System.out.println("set(0,2) " + arrlist.set(0,2));
		Double ddddd = new Double(1);
		Float fffff = new Float(1.0);
		double aaa = 1.0;
		Integer ia = Integer.valueOf("123");
		//Character does not participate in parse or valueOf, Character.valueOf() //DOES NOT COMPILE
		ArrayList<String> as = new ArrayList<>();
		//as.add("Hawk").add("robin");// DOES NOT COMPILE , since first add returns boolean
		as.add("Hawk");
		as.add("robin");
		as.add("test");
		System.out.println("to String implemented for List: " + as.toString());
		String[] stringArray = as.toArray(new String[10]);
		System.out.println("stringArray length is " + stringArray.length);
		System.out.println("as size is " + as.size());
		//System.out.println(stringArray == as); DOES NOT COMPILE. can't compare Array with ArrayList
		
		
		String[] arrayA = {"hawk", "robin"};
		List<String> stringList = Arrays.asList(arrayA);
		arrayA[0] = "arrayChange";
		stringList.set(1, "ListChange");
		//stringList.add("abc");// COMPILE BUT THROW UNCHECKED EXCEPTION, can't change Array backed list
		System.out.println(stringList);
		System.out.println(Arrays.toString(arrayA));
		LocalDate date = LocalDate.of(2021, Month.JANUARY, 12);//import java.time.LocalDate
		LocalTime.now();LocalDate.now();
		Period pp = Period.ofMonths(1);
		LocalTime time = LocalTime.of(1, 1);
		LocalDateTime dateTime = LocalDateTime.now();
		//time.plus(pp);// COMPILE BUT THROW UNCHECKED EXCEPTION
		System.out.println(time.format(DateTimeFormatter.ISO_LOCAL_TIME));//will  throw exception if using ISO_LOCAL_DATE or ISO_LOCAL_DATE_TIME
		System.out.println(date.format(DateTimeFormatter.ISO_LOCAL_DATE));//will  throw exception if using ISO_LOCAL_TIME or ISO_LOCAL_DATE_TIME
		System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE));
		DateTimeFormatter dateFormat = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		//Period ppp = new Period(1,1,1); Period has private constractor
		//System.out.println(dateFormat.format(time));//Throw exception if a Date formatter trying to formate a time, but it can formate dateTime and print out only the date part
		//LocalDate tooBigDay = LocalDate.of(2021, Month.APRIL, 49); //Can compile but throw exception
		
		int iais = 0;
		StringBuilder testChangeStringBuilder = new StringBuilder("Oringin");
		testChangeStringBuilder.delete(7, 1000); //throw exception if put 8 as the first number
		List ballons = new ArrayList<String>();
		ballons.add(1);
		ballons.add('c');
		//StringBuilder testChangeStringBuilder = new StringBuilder("Oringin").insert(testChangeStringBuilder.length(), "bcd");//DOES NOT COMPILE
		testChangeStringBuilder.append(false);
		System.out.println("testChangeStringBuilder is " + testChangeStringBuilder);
		String passAStringBuilder = "Oringin";
		//passAStringBuilder.substring(1, 0); //THROW EXCEPTION , StringIndexOutOfBoundsException
		String passAString = "Oringin";
		System.out.println("String.equals() pass in an StringBuilder and result is " + passAStringBuilder.equals(testChangeStringBuilder));
		System.out.println("String.equals() pass in an StringBuilder and result is " + passAStringBuilder.equals(passAString));
		testChangeStringBuilder.insert(0, 'a');
		testChangeStringBuilder.append(true);
		testChangeStringBuilder.toString();
		System.out.println("testChangeStringBuilder is " + testChangeStringBuilder);
		new OCA().changeStringBuilder(testChangeStringBuilder);
		System.out.println("testChangeStringBuilder is " + testChangeStringBuilder);
		int testChangePrimitive = 1;
		new OCA().changePrimitives(testChangePrimitive);
		System.out.println("testChangePrimitive : " + testChangePrimitive);
		String addBol = "aa";
		boolean bbb = false;
		int stringInt1 = 1;
		int stringInt2 = 1;
		//String addInt3 = stringInt1 + stringInt2; NOT COMPILE, can't assign int to String
		addBol += bbb;
		String addInt = addBol + stringInt1;
		System.out.println("addBol " + addBol);
		int[] java = new int[1];
		stringList.size();
		testChangeStringBuilder.capacity();
		String name[] = {"Tom", "Dick", "John"};
		for(String s : name) {
			
		}
		List<String> nameList = Arrays.asList(name);
		nameList.equals(null);//List i equals
		//nameList.remove(1);//exception, trying to remove() an array backed list
		//nameList.add("ac");//exception, trying to change the size by using add to an array backed list.
		String se1 = new String("eee");
		//testChangeStringBuilder.insert(100,"a");THROW EXCETION
		String se2 = new String("eee");
		System.out.println("String1 " + se1.equals(se2));
		System.out.println("String2 " + se1.equals("eee"));//String implements equals()
		StringBuilder ae1 = new StringBuilder("equal");
		StringBuilder ae2 = new StringBuilder("equal");
		System.out.println(ae1.equals(ae2));//StringBuilder does not implements equals()
		ae1.equals(se1);
		//System.out.println("abcde".replace("a", 'b'));DOES NOT COMPILE
		String[] arraySA = {"a"};
		String[] arraySB = {"a"};
		System.out.println("Does array implement equals()? " + arraySA.equals(arraySB));
		testLocalVariable();
		new OCA().testPass(123L);
		new OCA().testPass((long)1);//DOES NOT COMPILE if only pass 1, can't do two step promotion. 
		
		new OCA().testOverloadAutoboxing(123);
		//new Main().testOverloadVarargs(123); //DOES NOT COMPILE, can't covert twice 
		
		System.out.println(replaceString("abc"));
		//String s = "anc";
		//StringBuilder sb23 = s;DOES NOT COMPILE
		//StringBuilder sb23 = "asf";
		
		OCAExam();
		
/***************************************************************************
 * Lambda expression practices:
 * 
 * 
 * */
		List<Animal> animals = new ArrayList<Animal>();
		//for( ; ; ) System.out.println("loop"); //the code after this DOES NOT COMPILE
		//for(;;); the code after this DOES NOT COMPILE
		
		animals.add(new Animal("fish", false, true,1));
		animals.add(new Animal("dog", true, true,2));
		animals.add(new Animal("pig", true, false,3));
		
		print(animals, (Animal a) -> {return a.canHop();});
		//print(animals, Animal a -> {return a.canHop();}); DOES NOT COMPILE, need parentheses when having the type speficied 
		//print(animals, (Animal a) ->  a.canHop(););DOES NOT COMPILE, need braces when "return" or ";" presents
		
		int iii = 0;
		System.out.println(" ");
		check((h, l) -> h>l,5);
		//check((h, l) -> { h>l },5); // DOES NOT COMPILE, missing return and ; when having {}
		// check((int h, l) -> h>l,5); DOES NOT COMPILE, inconsistend parameter defination : "(int h, l)"
		String chapter31 = "abc";
	    Predicate<String> lambda2 = s -> chapter31.startsWith(s);	
	    
	    BiPredicate<String, String> bi = (a,b) -> a.length() > 0; 
	}
	
	
	private static void check(Climb climb, int height) {
		if(climb.isTooHigh(height, 10)) {
			System.out.println("too heigh");
		} else {
			System.out.println("OK");
		}
	}

	private static void print(List<Animal> animals, Predicate<Animal> checker) {
		for(Animal animal : animals) {
			if(checker.test(animal)) {
				System.out.print(animal + " ");
			}
		}
	}
	
	
/***************************************************************************
 * Lambda expression practices:
 * */
	static void testLocalVariable () {
		int a;
		int b;
		A aa;
		float value = 104.0f;
	}
	private int number = 3;
	{number = 4;}
	
	void changeStringBuilder(StringBuilder sb) {
		sb.append("changed");
		sb = new StringBuilder("address assigns to a new Chapter7Util.OBJECT");
	}
	
	void changePrimitives(int i) {
		i = i + 1;
	}	
	
	//void testPass(int i) {}
	void testPass(Long i) {}
	
	void testOverload() {}
	
	static void testOverload(int i) {}
	
	void testOverloadAutoboxing (long i) {
		System.out.println("testOverloadAutoboxing at long");
	}
	
	void testOverloadAutoboxing (Integer i) {
		System.out.println("testOverloadAutoboxing at Integer");
	}
	
	void testOverloadVarargs (Long i) {
		System.out.println("testOverloadAutoboxing at Integer");
	}
	
	static void  integerToInt(int i) {
		System.out.println("the type of input parameter is " + i);
	}
	
	void throwException() throws FileNotFoundException {
		//throw new IOException(); DOES NOT COMPILE
	}
	
	void generiaArrayList(ArrayList<String> al) {
		
	}
	
	static String replaceString(String s) {
		StringBuilder sb = new StringBuilder("bcd");
		s = s.replace("abc", sb);
		s = s.replace(sb, "abc");
		
		//s = s.replace(sb, 1);//DOES NOT COMPILE
		
		try {
			return "return statument in try";
		}catch(Exception e) {
			
		}finally {
			return "finally statument in finally after try"; //THIS DOES COMPILE
		}
		//return s;
	}
	
	 static void OCAExam() {
		 //ocaQuestion14[100] = 0; //this compiles even though the array is not initialized, but will throw NPE.
		/*These does not compile, can't use an empty<> on the left side of equal sign 
		 * List<> b = new ArrayList(); 
		 * List<> e = new ArrayList<>();
		 * List<> f = new ArrayList<String>();
		 */
		 int i = 1;
		 double d = 0;
		 float f = 0;
		 
		 d = i;
		 f = i; // legal
		 
		 d = f;
		 //f = d; need cast 
		 
		 int intChar = 'c';
		 
		 //protected String abc = "abc";// DOES NOT COMPILE
		 
	 }
	 
	 @Override public int hashCode() {
		 
		 return 123;
	 }
	 
	
}

class A {
	public A() {
		
	}
}

abstract class B {}

interface Climb {// interface is assumed as abstract, means compiler will provide the key word if missing
	boolean isTooHigh(int height, int limit);
}


