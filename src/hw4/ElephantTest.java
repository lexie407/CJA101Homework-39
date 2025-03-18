package hw4;

public class ElephantTest {
	public static void main(String[] args) {
//		動物一
		Animal a1 = new Animal(3, 8.0f);
		a1.speak();
//		動物二
		System.out.println("=======");
		
		Elephant e1 = new Elephant(8, 1200.0f, "大象" );
		e1.speak();
	}
}
