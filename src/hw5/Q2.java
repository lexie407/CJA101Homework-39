package hw5;
//請設計一個方法為randAvg(),從10個 0~100(含100)的整數亂數中取平均值並印出這10個亂數與平均值,如圖:

public class Q2 {

	public static void main(String[] args){		
		randAvg(); //方法設置為static可以免用物件呼叫
	 }

	public static void randAvg() {

		int[] numbers = new int[10];
		int sum = 0;
		
		System.out.print("本次取出的亂數為:");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = (int) (Math.random() * 101);
			System.out.print(numbers[i] + ", ");
			sum += numbers[i];
		}
		System.out.println();
		int avg = sum / 10;
		System.out.println("平均數為:" + avg);
	}

}