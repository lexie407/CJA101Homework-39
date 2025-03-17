package hw3;

public class TestRandomArray1 {
	//課堂練習題:請分別建立X，Y，2三個3x3的int陣列，然後把x和y陣列的加總存放到z陣列裡，再將結果顯示於螢幕上
	// - x和y陣列中的數字：請用亂數產生介於0~30之間的整數
	// - 亂數之取得可參考 java.lang.Math的靜態方法 random（）
    // - public static double random)；傳回亂數值其範圍為0.0~1.0
	
	//************ .random()的使用方式舉例:取1 ~ 10************
	//	int i1 = (int) (Math.random() * 10) + 1;
	//	System.out.println(i1);
	//***************************************************
	
	public static void main(String[] args) {


		// step 1:建立3個3×3的二維陣列
	   	 int x[][] = new int[3][3];
		 int y[][] = new int[3][3];
		 int z[][] = new int[3][3];
		
		// step 2:將亂數資料填入到x陣列裡
		for (int i=0; i < x.length; i++) {
			for(int j=0; j < x[i].length; j++) {
				int r = (int) (Math.random() * 30) + 1; //執行+放入陣列*多次 ->放入迴圈裡
				x[i][j] = r;                            //依序遍歷陣列裡的每個值=亂數r
														//也可以改成 x[i][j] = (int) (Math.random() * 30) + 1;
			}
		}
		
		// step 3:將亂數資料填入到y陣列裡
		for (int i=0; i < y.length; i++) {
			for(int j=0; j < y[i].length; j++) {
				y[i][j] = (int) (Math.random() * 30) + 1;
			}
		}
		
		// step 4:將x與y對應位置的元素加總結果放到陣列對應位置；x[0][0]+y[0][0] -> z[0][0]帶入同樣的索引值
		for (int i = 0; i < z.length; i++) {
			for (int j = 0; j < z[i].length; j++) {
				z[i][j] = x[i][j] + y[i][j];
			}
		}
		
		
		
		// step 5:列印顯示3個陣列各別的元素(類似九九乘法表的列印方式，分別印出x[][]、y[][]、z[][])
		for (int i = 0; i < x.length; i++) {
			for(int j = 0; j < x[i].length; j++) {
				System.out.print(x[i][j] + " \t ");
			}
			System.out.println();
		}
		
		System.out.println("===============================");
		
		for (int i = 0; i < y.length; i++) {
			for(int j = 0; j < y[i].length; j++) {
				System.out.print(y[i][j] + " \t ");
			}
			System.out.println();
		}
		
		System.out.println("===============================");
		
		for (int i = 0; i < z.length; i++) {
			for(int j = 0; j < z[i].length; j++) {
				System.out.print(z[i][j] + " \t ");
			}
			System.out.println();
		}
		
	}
	
}
