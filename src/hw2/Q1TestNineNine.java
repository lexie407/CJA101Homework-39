package hw2;

//製作九九乘法
//******************老師上課示範****************************
//public static void main(String[] args) {
//	int i, j;
//	for(i = 1; i <= 9; i++) {
//		for(j = 1; j <= 9; j++)
//			System.out.print(i + "*" + j + "=" + i * j + "\t");
//		System.out.println();
//	}
//}
//*******************************************************

public class Q1TestNineNine {



	public static void main(String[] args) {		

//*****************使用 for + while************************	
//		for(int i = 1; i <= 9; i ++) {   	                          //i代表被乘數,外迴圈控制，for迴圈可以自動帶入+1	
//			int j = 1; 					                              //j代表乘數，每次到直行到這行就回覆初始值1
//			while(j <= 9) {                                           //內迴圈，控制j，兩行敘述不可省略{}
//			System.out.print(i + "*" + j + "=" + i * j + "\t");       
//				j++;						                          
//			}
//			System.out.println();                                     
//		}
//********************************************************		
	
		
//*****************使用 for + do while*********************
//		for(int i = 1; i <= 9; i ++) {   	                          //i代表被乘數,外迴圈控制，for迴圈可以自動帶入+1	
//			int j = 1; 					                              //j代表乘數，每次到直行到這行就回覆初始值1
//			do {
//				System.out.print(i + "*" + j + "=" + i * j + "\t"); 
//				j ++;
//			}while(j <= 9);                                           //內迴圈，控制j，不可省略";" 									                         
//			System.out.println();                                    
//		}
//********************************************************

		
//*****************使用 while + do while*******************
		int i = 1;
		while(i <= 9) {   	                                          //i代表被乘數,外迴圈控制	
			int j = 1; 					                              //j代表乘數，每次到直行到這行就回覆初始值1
			do {
				System.out.print(i + "*" + j + "=" + i * j + "\t"); 
				j ++;
			}while(j <= 9);                                           //內迴圈，控制j，不可省略";" 									                         
			System.out.println();
			i ++;													  //i需要手動輸入外迴圈變化，閱讀性較差
		}	
//********************************************************
		
		
	}
	
}
