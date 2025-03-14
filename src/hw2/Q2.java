package hw2;

//第二題
//請設計一隻Java程式,計算1~1000的偶數和 (2+4+6+8+...+1000)


public class Q2 {

	public static void main(String[] args) {
		
		int sum = 0;
		for(int i = 1 ; i < 1000 ; i ++) {
			if (i % 2 == 1) {
				continue;
			} 
			sum += i;
		}
		System.out.print(sum);
	}
	
}
