package hw3;

import java.util.Scanner;

public class Q2 {
//題目﹔請設計一隻程式，會亂數產生一個0~9的數字，然後可以玩猜數字遊戲，猜錯會顯示錯誤訊息，猜對則顯示正確訊息，如圖示結果：
//（提示：Scanner，亂數方法，無窮迴圈）
//（進階功能：產生0~100亂數，每次猜就會提示你是大於還是小於正確答案）
	
	public static void main(String[] args) {

//	step1亂數產生答案數字
		int an = (int)(Math.random() * 10);
		Scanner sc = new Scanner(System.in);
		
//	step2 開始遊戲，掃描玩家手動輸入的數字
		int gn ;
		outer:
		while (true) {
			System.out.println("開始猜數字吧!");
			gn = sc.nextInt();	
//	step3比較猜的數字有沒有猜中
			if(gn == an) {
				System.out.println("猜對了!答案就是" + an);
				break outer;
			}else {
				System.out.println("猜錯了!");
			}
				
		}
	}	
}