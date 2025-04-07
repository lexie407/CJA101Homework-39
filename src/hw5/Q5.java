package hw5;
//身為程式設計師的你,收到一個任務,要幫系統的註冊新增驗證碼的功能,請設計一個方法genAuthCode(),
//當呼叫此方法時,會回傳一個8位數的驗證碼,此驗證碼內容包含了英文大小寫與數字的亂數組合,如圖:


public class Q5 {
	
	public static void main(String[] args) {
		String authCode = genAuthCode();
		System.out.println("本次產生的隨機驗證碼為:" + authCode);

	}
	
	public static String genAuthCode() {
		
		//做一個可以存入所有字元的迴圈(合計62個)
			//數字0-9 -> 48~57，共10個
			//大寫字母A-Z -> 65~90，共26個
			//小寫字母a-z -> 97~122，共26
		
		char[]codes = new char[62];
		int index = 0;  //索引值宣告在外側可以持續累加
		
		//個別建立迴圈將所有的字元丟進去
		for(char c = 'A'; c <= 'Z' ; c++) {
			codes[index] = c;
			index ++;
		}
		
		for(char c = 'a'; c <= 'z' ; c++) {
			codes[index] = c;
			index ++;
		}
		
		for(char c = '0'; c <= '9' ; c++) {
			codes[index] = c;
			index ++;
		}
				
		//用迴圈印出8碼的密碼
		char[] autoCode = new char[8]; 
		for(int i = 0; i < 8 ; i++) {
			int codeIndex = (int)(Math.random()*62);
			autoCode[i] = codes[codeIndex];
		}
		return new String(autoCode);  //回傳字串
		}
	
}
