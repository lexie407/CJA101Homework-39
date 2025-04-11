package hw9;

//開啓2個執行緒模擬饅頭人與詹姆士參加快胃王比賽所做的
//競賽過程。
//• 每個動作都以 Thread.sleep()暫停一下,以達到顯示效果。
//Sleep時間由亂數產生500~3000之間的毫秒數,如圖所示
//• 參考範例:CounterRunnable.java
//• 需留意主執行緒執行順序

public class hw9EatingContest extends Thread {
	static boolean ready = false; //!ready代表還沒開始
	static boolean stop = false;  //!stop代表有人吃完了，比賽結束
	String name;
	int counter = 1;
	
	public hw9EatingContest(String name) {
		this.name = name;
	}
	
	public void run() {
		while(!ready) {
			//等待比賽開始的時間
		}
		
		while(counter <= 10 && !stop ) {
			System.out.println(name + "吃了第"+ counter +"碗飯");
			counter++;
			try {
				Thread.sleep((int)(Math.random() * 2501)+500);
			}catch(Exception e){
			}	
		}
		
		if(counter> 10 && !stop ) {
			stop = true;
			System.out.println( name + "吃完了!");
		}else {
			
		}
	}
	

	public static void main(String[] args) {
		
		hw9EatingContest mantou = new hw9EatingContest("饅頭人");
		hw9EatingContest james = new hw9EatingContest("詹姆士");
		mantou.start();
		james.start();
		
		System.out.println("-----大胃王快食比賽開始-----");
		hw9EatingContest.ready = true;
		
		
		try{
		mantou.join();
		james.join();
		}catch(InterruptedException ie) {
			ie.printStackTrace();
		}
		System.out.println("-----大胃王比賽結束-----");
		
	}  
	

}
