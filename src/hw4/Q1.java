package hw4;

public class Q1 {
	public static void main(String[] args) {
		System.out.println("============第一題=============");
//	第一題 陣列暖身 
	// 有個一維陣列如下:
	// {29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
	// 請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
	// (提示:陣列,length屬性)	
		
		int[] intArray = {29, 100, 39, 41, 50, 8, 66, 77, 95, 15};
		int sum = 0;
		for (int i = 0; i < intArray.length; i++) {
			sum += intArray[i];
		}
		
		int avg = sum / intArray.length;
		System.out.println("此陣列的元素平均值為:" + avg);
		System.out.println("大於平均的元素有:");
		
		for(int j = 0; j < intArray.length; j++) {
			if(intArray[j] > avg) {
				System.out.print(intArray[j] + "  ");
			}else {
				continue;
			}
		}
		
		System.out.println();
		System.out.println("============第二題=============");
		
//	第二題
	// 請建立一個字串,經過程式執行後,輸入結果是反過來的
	// 例如String s = “Hello World”,執行結果即為dlroW olleH
	// (提示:String方法,陣列)
		
		String s = "Hello World";
		
		for (int i = s.length()-1; i >= 0; i--) {
			System.out.print(s.charAt(i)); 
		}
		System.out.println();
		System.out.println("============第三題=============");
		
// 	第三題
	// 有個字串陣列如下 (八大行星):
	// {“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
	// 請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
	// (提示:字元比對,String方法)
		
		String[] planets = {"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};
		String vowels = "aeiou";
		int vowelCount = 0;
		
//		要跟每一個字串裡的每一個字元一一比對，有地跳出迴圈&輸出plants[i]
		for(int i = 0; i < planets.length; i++) {
			String planet = planets[i]; 
			for(int j = 0; j < planet.length(); j++) {
				char ch = planet.charAt(j); //陣列裡的每一個字串以單字儲存
				if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ) {
					vowelCount++;
				 }
			}
		}System.out.println("總共有" + vowelCount + "個母音");
	
		
	
	}

}
