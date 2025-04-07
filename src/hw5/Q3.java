package hw5;
//利用Overloading,設計兩個方法int maxElement(int x[][])與double maxElement(double x[][]),
//可以找出二維陣列的最大值並回傳,如圖:


public class Q3 { 
	
	public static void main(String[] args) {
		int [][] intArray = {
				{1, 6, 3},
				{9, 5, 2}
		};
		
		double [][] doubleArray = {
				{1.2, 3.5, 2.2},
				{7.4, 2.1, 8.2}
		};
		
		Q3 w = new Q3();
		System.out.println(w.maxElement(intArray));
		System.out.println(w.maxElement(doubleArray));
		
	}


	public int maxElement(int[][] intArray) {
		int max = 0;
		for(int[] row : intArray) {
			for(int e1 : row) {
				if ( e1 > max) 
					max = e1;  //比出最大值
			}
		}
		return max;
	}
	
	public double maxElement(double [][] doubleArray) {
		double max = 0;
		for(double[] row : doubleArray) {
			for(double e2 : row) {
				if ( e2 > max) 
					max = e2;  //比出最大值
			}
		}
		return max;
	}

}
