package AccessModifier.pond.swan;
import AccessModifier.pond.shore.Bird;

public class Swan extends Bird{

	public void noReference() {
		System.out.println(text);
		oa();
	}
	
	public void swanReference() {
		Swan swan = new Swan();
		System.out.println(swan.text);
		swan.oa();
	}
	
	public void thisReference() {
		System.out.println(this.text);
		this.oa();
		
	}
	
	public void otherObjReference() {
		OtherObj other = new OtherObj();
		System.out.println(other.text);
		other.oa();
	}
	
	public void otherObjStandalone() {
		OtherObjStandalone otherStandalone = new OtherObjStandalone();
		//otherStandalone.oa(); DOES NOT COMPILE, this place is not in the same package of Bird,  the reference type of otherStandalone is NOT a subclass of Bird
	}
	
	public void birdReference() {
		Bird bird = new Bird();
		Bird bird_2 = new Bird();
		//bird_2.oa;//Does not compile
		//bird.oa(); Does not compile, this place is not in the same package of Bird, the reference type of Bird is NOT a subclass of Bird
	}
}
