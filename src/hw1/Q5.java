package hw1;

public class Q5 {
	//某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,請用程式計算10年後,本金加利息共有多少錢 (用複利計算,公式請自行google)
	
	public static void main(String[] args) {
		
		double principal  = 1500000; //本金
		double rate = 0.02;  //利率
		double years = 10;       //存款年數
		double amount = principal * Math.pow((1 + rate),years); //【複利公式】期末本利和＝期初本金×（1＋利率）期數次方。
		
		System.out.printf("到期本利合 = %.2f", amount);//計算到小數點後第二位。
		
	}
}
