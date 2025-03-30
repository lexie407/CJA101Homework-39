package hw5;
//請設計一個方法為randAvg(),從10個 0~100(含100)的整數亂數中取平均值並印出這10個亂數與平均值,如圖:

import java.util.Random;

public class Q2 {
//(int Math.random()*101)
	//先取10個亂數，存入陣列
	//呼叫方法印出平均值
	
	public static void main(String[] args){
		  
		  int[]numbers = new int[10];
		  
		  for( int i = 0; i < numbers.length; i++){
			  numbers[i] =.Math()*101;
			  System.out.print(numbers[i] + '\t');
		  }
	 
	 }

	  
//	public int avg(int sum, int all){
//		return sum / all; 
//		 }
	
}
	
	
	
