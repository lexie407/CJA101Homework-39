package hw2;

//第六題
//請設計一隻Java程式(需使用迴圈),輸出結果為以下:
//A
//BB
//CCC
//DDDD
//EEEEE
//FFFFFF


public class Q6 {

	
	
		public static void main(String[] args) {

//			System.out.print((int)'A');  // 測試字母A的編碼
			for(char i = 65; i <= 69 ; i++) {
			
				for(int j = 65 ; j <= i; j++) {
					System.out.print(i);
				}
				System.out.println();
			}
//				
		}
}