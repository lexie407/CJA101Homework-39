package hw4;
//課堂練習
//1.建立一個物件陣列，可以放入Animal,Elephant
//2.跑迴圈，呼叫speak()

public class PolyAnimal {
	public static void main(String[] args) {
		Animal[] a = new Animal[2]; // 要選一個父類別、同時也有speak()方法
		a[0] = new Animal(3, 8.0f);
		a[1] = new Elephant(8, 1200.0f, "大象" );
		
		for (int i = 0; i < a.length; i++)
			//System.out.println(a[i].speak()); //speak()已經有包含print，且不會回傳值所以不能印
			a[i].speak();
			System.out.println("=================");
	}
	
}
