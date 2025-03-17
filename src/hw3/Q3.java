package hw3;

import java.util.Scanner;

public class Q3 {
//題目:阿文很喜歡簽大樂透（1~49），但他是個善變的人，上次討厭數字是4，但這次他想要依心情決定討厭哪個數字，
//請您設計一隻程式，讓阿文可以輸入他不想要的數字（1~9），畫面會顯示他可以選擇的號碼與總數，如圖：
//（提示：Scanner）

	public static void main(String[] args) {
//	step1先亂數輸入他不要的數字
		Scanner sc = new Scanner(System.in);
		System.out.println("阿文...請輸入你討厭哪個數字?");
		int dislikeNo = sc.nextInt();
		
//		step3用迴圈跳過他不喜歡的數字
		int count = 0;
		for(int i = 0; i < 50 ; i++) {      
			if(i / 10 == dislikeNo || i % 10 == dislikeNo) {
				continue;
				}
			System.out.print(i + " ");
			count++;
			}
		System.out.println();
		System.out.println("總共有" + count + "個數字可以選");

		
//進階題:輸入不要的數字後，直接亂數印出6個號碼且不得重複）->亂數電腦選號且不可以重複(難題)
//		step4以陣列的形式印出剩餘選項(6 * 8)
//		for(int a = 0; a < arr.length; a++) {
//			for(int b=0; b < arr[a].length; b++) { 
//				System.out.print(arr[a][b] + "\t" );
//			}
//			System.out.println();
		
	}
}	
