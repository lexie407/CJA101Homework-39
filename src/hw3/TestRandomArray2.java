package hw3;

public class TestRandomArray2 {
//運用「方法設計」省略重複出現的內容(step2,3 ;step5)
	// 課堂練習題:請分別建立X，Y，2三個3x3的int陣列，然後把x和y陣列的加總存放到z陣列裡，再將結果顯示於螢幕上
	//  - x和y陣列中的數字：請用亂數產生介於0~30之間的整數
	//	- 亂數之取得可參考 java.lang.Math的靜態方法 random（）
	//	- public static double random)；傳回亂數值其範圍為0.0~1.0
	
//	呼叫方法製作出結果(使用main方法說明主要執行的動作是甚麼，透過.調用寫在下面的各種方法)

	
	
	public static void main(String[] args) {
		TestRandomArray2 tra = new TestRandomArray2(); //創建一個可以適用在TestRamdonArray2類別下的實體tra，以利後續調用方法getRandomArray()
		int[][] x = tra.getRandomArray();  //每次調用 getRandomArray() 都是產生一個新的陣列，再指示到陣列x，而不會影響到其他的變數或實例的狀態。
		int[][] y = tra.getRandomArray();  //每次調用 getRandomArray() 都是產生一個新的陣列，再指示到陣列y，而不會影響到其他的變數或實例的狀態。
		int[][] z = new int[3][3];
		
		for (int i = 0; i < z.length; i++) {          //單純用巢狀迴圈製作出陣列z
			for (int j = 0; j < z[i].length; j++) {
				z[i][j] = x[i][j] + y[i][j];
			}
		}
		
		tra.printArray(x);      //運用物件實體tra呼叫印出方法.printArray()，印出陣列x
		tra.printArray(y);      //運用物件實體tra呼叫印出方法.printArray()，印出陣列y
		tra.printArray(z);      //運用物件實體tra呼叫印出方法.printArray()，印出陣列z
	}

	
	//方法命名，get取得回傳值，取代亂數重複建立陣列x,陣列y
	public int[][] getRandomArray(){
				int[][]data = new int[3][3];
				for (int i = 0; i < data.length; i++) {
					for (int j = 0; j < data[i].length; j++) {
						int r = (int) (Math.random() * 30) + 1; 
						data[i][j] = r; 				
					}
				}
				return data;
			}
	
	//方法命名，print取得回傳值
	public void printArray(int[][] data){ //void印完就不用再回傳值，設計參數讓區域變數x[][]可以傳遞過來
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				System.out.print(data[i][j] + " \t "); 
			}
			System.out.println();
		}
		System.out.println("=========================");
	}
	

}

