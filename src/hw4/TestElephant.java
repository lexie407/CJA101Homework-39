package hw4;

public class TestElephant {
	public static void main(String[] args) {
		Animal a1 = new Animal(3, 8.0f);
		a1.speak();
		
		System.out.println("=======");
		
		Elephant e1 = new Elephant(8, 1200.0f, "大象" );
		e1.speak();
	}
}
