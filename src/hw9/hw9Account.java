package hw9;
//熊大在念大學,生活費倚靠媽媽。媽媽怕熊大一天到晚領
//錢亂花,不好好唸書,所以只要看到熊大帳戶的餘額超過
//3000元,就會停止匯款給熊大;但要是帳戶餘額在2000元
//以下,熊大就會要求媽媽匯款給他。如果帳戶餘額低於熊
//大要提款的金額,熊大就會暫停提款,直到媽媽告知他錢
//已經入帳戶。假設媽媽一次匯款 2000 元,熊大一次提款
//1000元,寫一個Java程式模擬匯款10次與提款10次的情
//形。

class Account {
	private int balance = 0; //存款餘額
	
	
	//存款(Mom)
	synchronized public void deposit(int money){  //輸入減少金額
		
//		Boolean flag = false;
//		if(flag) {
			while(balance > 3000) {
				System.out.println("媽媽看到餘額在3000以上，暫停匯款");

				//System.out.println("熊大被媽媽告知帳戶已經有錢");
//				flag = false;	
				try {
				
				wait();
				} catch (InterruptedException e) {
				e.printStackTrace();
				}
			}
//		}
		
		balance+=money;
		System.out.println("媽媽存了"+ money +"，帳戶共有:" + balance);

		notify();
	
	}
	
	//提款(Son)
	synchronized public void withdrawal(int money){  //輸入增家金額
		
		while(balance < money) {
			System.out.println("熊大看到帳戶沒錢，暫停提款!");
			System.out.println("媽媽被熊大要求匯款!");
			notify();
			
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}	
		balance-=money;
		System.out.println("熊大領了"+ money +"，帳戶共有:"+ balance);
		
		if(balance <= 2000) 
			System.out.println("熊大看到餘額在2000以下，要求匯款");
//		notify();
	}
}

class Mom extends Thread{
	Account account;
	public Mom(Account account) {
		this.account = account;
	}
	
	public void run() {
		
		for(int i = 1; i <= 10; i++) { //模擬存了10次
			account.deposit(2000);     //每次存入2000元
		}
	}
}

class Son extends Thread{
	Account account;
	public Son(Account account) {
		this.account = account;
	}
	
	public void run() {
		for(int i = 1; i <= 10; i++) { //模擬存了10次
			account.withdrawal(1000);     //每次提領3000元
		}
	}
}


public class hw9Account {
	public static void main(String[] args) {
		Account account =new Account();
		Mom mom = new Mom(account);
		Son son = new Son(account);
		son.start();
		mom.start();


	}

}
