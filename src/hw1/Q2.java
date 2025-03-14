package hw1;

public class Q2 {
	//請設計一隻Java程式,計算200顆蛋共是幾打幾顆? (一打為12顆)
	public static void main(String[] args) {
		int totalEggs = 200;
		int dozen = totalEggs / 12; //計算有幾打
		int remainingEggs = totalEggs % 12; //計算剩餘幾顆
		System.out.println("共有"+dozen+"打"+"剩下"+remainingEggs+"顆");
	}
}
