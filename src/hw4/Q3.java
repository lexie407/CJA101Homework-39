package hw4;

import java.util.Scanner;

public class Q3 {
//第三題
	// ============================================
//請設計由鍵盤輸入三個整數,分別代表西元yyyy年,mm月,dd日,執行後會顯示是該年的第幾天
//例:輸入 1984 9 8 三個號碼後,程式會顯示「輸入的日期為該年第252天」
//(提示1:Scanner,陣列)
//(提示2:需將閏年條件加入)
//(提示3:擋下錯誤輸入:例如月份輸入為2,則日期不該超過29)
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入要查詢的日期(yyyy mm dd):");
		int year = 0, month = 0, day = 0;
		year = sc.nextInt();
		month = sc.nextInt();
		day = sc.nextInt();
		
		if (!isValidDate(year, month, day)) {  
	        	return;
	        }
		
		int dayOfYear = calculateDayOfYear(year, month, day);  
	        System.out.printf("輸入的日期為該年第" + dayOfYear + "天");  

	    sc.close();  
	}
	
	
	//檢查輸入日期是否錯誤
	//1.month必須為1~12
	//2.day不得超過當月最高日數(需考慮閏年)
	public static boolean isValidDate(int year, int month, int day) { 
		if(month < 1 || month > 12) {
			System.out.println("月份輸入錯誤!");
			return false;
		}
		
		int[] daysInMonth = { 0, 31, isLeapYear(year) ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }; 
		if(day < 1 || day>daysInMonth[month]) {
			System.out.println("日期輸入錯誤!");
			return false;
		}
		return true;
	}
	
	
	//判斷是否為閏年(規則:四年一閏；百年不閏，四百年再閏)
	//註:java8版本後另有提供方法；public boolean isLeap()->需要Import.time.*
	public static boolean isLeapYear(int year) {
	    return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
	}
	
	
	//計算當年度的日數
	 public static int calculateDayOfYear(int year, int month, int day) {  
	        int[] daysInMonth = { 0, 31, isLeapYear(year) ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };  
	        int dayOfYear = 0;  
	        for (int i = 1; i < month; i++) {  
	            dayOfYear += daysInMonth[i];  
	        }  
	        dayOfYear += day;  
	        
	        return dayOfYear;  
	    }  
	 
}
