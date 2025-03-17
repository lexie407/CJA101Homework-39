package hw3;

import java.util.Scanner;

public class Q1 {
//題目:請設計一隻程式，使用者輸入三個數字後，輸出結果會為正三角形、等腰三角形、其它三角形或不是三角形，如圖示結果：
//（提示：Scanner，三角形成立條件，判斷式if else）
//（進階功能：加入直角三角形的判斷）

	public static void main(String[] args) {
//	step1	輸入數字形成一維陣列
		System.out.print( "請輸入三個整數:");
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[3];
		for(int i = 0; i < arr.length; i++) {
			if(sc.hasNextInt()){  //確保輸入數值為int
				arr[i] = sc.nextInt();
			}
		}
		
		
//	step2	指派陣列裡的值作為三邊長
		int a = arr[0];
		int b = arr[1];
		int c = arr[2];
		
//	step3	比較屬於哪一種三角形 		
		if( a + b > c && a + c > b && b + c >a) {
			if( a == b && b ==c) {
				System.out.println("這是正三角形");
			}else if(a == b || b == c || a == c) {
				System.out.println("這是等腰三角形");
			}else if(a * a + b * b == c * c || b * b + c * c == a * a  || c * c + a * a == b * b ) {
				System.out.println("這是直角三角形");
			}else{
				System.out.println("這是其他三角形");
			}	
		}else {
			System.out.println("這不是三角形");
		}
			
	}
}