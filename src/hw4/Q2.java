package hw4;

import java.util.Scanner;

public class Q2 {
//第二題 樂透
	// ========================
	//阿文上班時忘了帶錢包,想要向同事借錢,和他交情比較好的同事共有5個,其員工編號與身上現金列表如下:
	//請設計一個程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事有錢可借他;並且統計有錢可借的總人數:例如輸入1000就顯示「有錢可借的員工編號:25 19 27共3人!」
	//(提示:Scanner,二維陣列)
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("要借多少錢？");
		int needMoney = 0;
		needMoney = sc.nextInt();

		System.out.print("有錢可借的員工編號: ");
		int[][] colleages = { { 25,2500}, {32, 800}, {8, 500}, {19,1000}, {27, 1200} };
		int count = 0;
		for (int i = 0; i < colleages.length; i++) {
			if (colleages[i][1] >= needMoney) {     //指比對陣列內的第二個數字         
			System.out.print(colleages[i][0] + " ");
			count++;
			}
			
		}
		System.out.print("共 " + count + " 人");
		sc.close();
	}

}
