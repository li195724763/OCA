package main;
//this is for Lambda expression
public class Animal {
	private String species;
	private boolean canHop;
	private boolean canSwim;
	private final int i;// does not compile if no initialization in constructor or instance initializer, final i needs to initialize.
	
	
	public Animal(String species, boolean canHop, boolean canSwim, int i) {
		this.species = species;
		this.canHop = canHop;
		this.canSwim = canSwim;
		this.i = i;
	}
	
	public boolean canHop() {
		return canHop;
	}
	
	public boolean canSwim() {
		return canSwim;
	}
	
	public String toString() {
		return species;
	}
	
}
