package hw1;

public class Q3 {
	//請由程式算出256559秒為多少天、多少小時、多少分與多少秒
	public static void main(String[] args) {
		int totalSeconds = 256559;
		int days = totalSeconds / (3600*24); 
		int hours = totalSeconds %  (3600*24) / 3600;
		int minutes = totalSeconds %  (3600*24) % 3600 /60;
		int seconds = totalSeconds % 60;
		
		// second not seNcond 
		
		System.out.println(days + "天" + hours + "時" + minutes + "分" + seconds + "秒");
	}
}
