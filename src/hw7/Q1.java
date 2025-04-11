package hw7;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

//請寫一個程式讀取這個Sample.txt檔案,並輸出以下訊息:
//Sample.txt檔案共有xxx個位元組,yyy個字元,zzz列資料
//FileInputStream -> 計算位元組數
//FileReader      ->讀字元（配合 char 陣列）
//BufferedReader  ->讀列數（readLine()）


public class Q1 {
	public static void main (String[] args) {
		int i;
		try {
			
			//一次讀取1bit
			
			//一次讀取1byte
			FileInputStream fis = new FileInputStream("C:\\CJA101_Workspace\\Homework-039\\files\\Sample.txt");
			BufferedInputStream bis = new BufferedInputStream(fis);
			while((i = bis.read()) != -1)
				System.out.println((char)i);
			bis.close();
			fis.close();
			
			//一次讀取1行
			
			
			
		}catch(IOException e) {
		}
		
	}  

}

//參考答案
//import java.io.*;
//public class SampleFileStats {
//    public static void main(String[] args) {
//        // 用來統計資料
//        int byteCount = 0;    // 位元組數
//        int charCount = 0;    // 字元數（中文、英文皆算 1）
//        int lineCount = 0;    // 行數
//
//        try (
//            // 建立位元組輸入流 → 用於計算總位元組數
//            FileInputStream fis = new FileInputStream("C:\\CJA101_Workspace\\Homework-039\\files\\Sample.txt");
//            // 用位元組流包裝緩衝輸入流 → 用來讀出每個字元內容
//            BufferedInputStream bis = new BufferedInputStream(fis);
//            // 用來逐行讀文字的讀者（為了算行數）
//            BufferedReader br = new BufferedReader(
//                new InputStreamReader(new FileInputStream("C:\\CJA101_Workspace\\Homework-039\\files\\Sample.txt"), "UTF-8")
//            )
//        ) {
//            // 計算位元組數（實際讀取所有 byte）
//            while (bis.read() != -1) {
//                byteCount++;
//            }
//
//            // 重設字元讀取器來重新讀文字
//            String line;
//            while ((line = br.readLine()) != null) {
//                lineCount++;                         // 每讀到一行就加 1 行
//                charCount += line.length();          // 每行的字元長度加總
//                System.out.println(line);            // 印出該行內容
//            }
//
//            // 輸出統計結果
//            System.out.println("Sample.txt 檔案共有 " + byteCount + " 個位元組，"
//                                + charCount + " 個字元，"
//                                + lineCount + " 列資料");
//
//        } catch (IOException e) {
//            e.printStackTrace(); // 印出錯誤訊息以便除錯
//        }
//    }
//}

