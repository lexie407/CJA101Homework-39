package hw1;

public class Q6 {
	//請寫一隻程式,利用System.out.println()印出以下三個運算式結果:
	//5 + 5
	//5 + ‘5’
	//5 + “5”
	//並請用註解各別說明答案的產生原因
	
	public static void main(String[] args) {
		System.out.println( 5 + 5 );   //基本的數學運算，5 + 5 = 10
		
		System.out.println( 5 + '5' ); //''包住的5為字元，依據ASCII編碼查詢出來的十進位數值為53，故5+53=58
		
		System.out.println( 5 + "5" ); //""包住的5為字串，+符號只是將兩個字元串接成一個字串，故印出55。
	}
	
}
