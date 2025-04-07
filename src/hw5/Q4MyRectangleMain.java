package hw5;
//• 請另外建立一個MyRectangleMain類別,此類別只有main方法
public class Q4MyRectangleMain {
	public static void main(String[] arg) {
		//(1) 使用public MyRectangle()建構子建立物件,設定width, depth為10, 20,
		//透過getArea()印出結果
		System.out.println("使用public MyRectangle()建構子建立物件");
		Q4MyRectangle r1 = new Q4MyRectangle();
		r1.width = 10;
		r1.depth = 20;
		System.out.println(r1.getArea());
		
		System.out.println();
		
		//(2) 使用public MyRectangle(double width, double depth)建構子建立物件
		//設定width, depth為10, 20,透過getArea()印出結果
		System.out.println("使用public MyRectangle(double width, double depth)建構子建立物件");
		Q4MyRectangle r2 = new Q4MyRectangle(10, 20);
		System.out.println(r2.getArea());
	}

}
