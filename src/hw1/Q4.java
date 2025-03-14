package hw1;

public class Q4 {
	//請定義一個常數為3.1415(圓周率),並計算半徑為5的圓面積與圓周長
	public static void main(String[] args) {
		final double PI = 3.1415;
		int radius = 5;
		double area = radius * radius * PI;
		double circumference = radius * 2 * PI;
		
		System.out.println("園面積=" + area);
		System.out.println("園周長=" + circumference);
		
	}
}
