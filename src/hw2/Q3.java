package hw2;

//第三題
//請設計一隻Java程式,計算1~10的連乘積 (123*...10) (用for迴圈)
//請設計一隻Java程式,計算1~10的連乘積 (123...*10) (用while迴圈)


public class Q3 {

	public static void main(String[] args) {
		
		//請設計一隻Java程式,計算1~10的連乘積 (123*...10) (用for迴圈)		
//		int product = 1;
//		for(int i = 1 ; i <= 10 ; i ++) {
//			product *= i;
//		}
//		System.out.print(product);
//	}
		
		//請設計一隻Java程式,計算1~10的連乘積 (123*...10) (用for迴圈)
		int product = 1;
		int i = 1 ;
		while( i <= 10 ) {
			product *= i;
			i ++ ;        //先算完成法再計數+1
		}
		System.out.print(product);
	}
	
	
}