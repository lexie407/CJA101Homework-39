package hw6;

import java.util.Scanner;

public class CalTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator c = new Calculator();

        try {
            System.out.print("請輸入 x：");
            int x = sc.nextInt(); 

            System.out.print("請輸入 y：");
            int y = sc.nextInt();
            
            int result = c.powerXY(x, y); 
            System.out.println(x + " 的 " + y + " 次方為：" + result);

        } catch (NumberFormatException e) {
            System.out.println("格式錯誤！");
        } catch (CalException e) {
            System.out.println( e.getMessage());
        }

        sc.close();
    }
}
