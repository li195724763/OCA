package main;

public class Climber {

	public static void main(String[] args) {
		check((int h, int l) -> {return h > l ;}, 5);
	}

	private static void check(Climb climb, int height) {
		if (climb.isTooHigh(height, 10))
			System.out.println("too high");
		else
			System.out.println("ok");
	}
 
}