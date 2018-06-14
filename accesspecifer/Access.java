package accesspecifer;

class Test {
	
	String color = "Black";
	void msg() {
		
	}
}

public class Access extends Test{

	String color = "BlackRed";
	void colorChange() {
		System.out.println(color);
	}
	
	public static void main(String[] args) {
	

	}

}
