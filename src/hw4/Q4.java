package hw4;

public class Q4 {
//	班上有8位同學,他們進行了6次考試結果如下:請算出每位同學考最高分的次數
//	(提示:二維陣列)
	
	//建立個人每次考試的成績陣列
	public static void main(String[] args) {
		int [][]student = {
		{ 10, 37, 100, 77, 98, 90 },
		{ 35, 75, 70, 95, 70, 80 }, 
		{ 40, 77, 79, 70, 89, 100 }, 
		{ 100, 89, 90, 89, 90, 75 },
		{ 90, 64, 75, 60, 75, 50 },
		{ 85, 75, 70, 75, 90, 20 },
		{ 75, 70, 79, 85, 89, 99 },
		{ 70, 95, 90, 89, 90, 75 }
		};
	
	//建立個人得到最高分次數的陣列
		int[] count = new int[student.length]; 
		
		for(int j = 0; j < student[0].length; j++) {	 
	//比較每一輪考試中的最高分max分別是多少	
			int max = student[0][j]; 
			for(int i = 0; i < student.length; i++) { 
				if(student[i][j] > max) {             
				max = student[i][j];     //誰分數比較高，就變成max
				}
			}
	//每一輪比完，比對得到最高分的是誰，幫他的count++
			for (int i = 0; i < student.length; i++) { 
	            if (student[i][j] == max) {
	                count[i]++;
	            }
	        }
		}
		
	// 印出每位同學獲得最高分的次數
        for (int i = 0; i < count.length; i++) {
            System.out.println("學生 " + (i + 1) + " 考最高分次數: " + count[i]);
        }
		
		
	}	
}
