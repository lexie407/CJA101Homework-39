package hw4;

public class Elephant extends Animal {
//	系統預設建立一個無參數建構子
//	但回頭去找父類別有無對應的無參數建構子時，發現已經有預設參數的建構子Animal
//	故一開始會報錯。
//	public Elephant(){
//		super(); 
//	}

//	需要宣告有參數的建構子如下；
	
	private String name;
	
	public Elephant(int age, float weight, String name) {
		super(age, weight);  //呼叫父類別建構子
		this.name = name;    //覆寫:追加名字
	}
	
	//方法名稱、型別、參數都要與父類別一樣
	public void speak() {
		super.speak();             //呼叫父類別方法
		System.out.println(name);  //覆寫；追加列印名字
	}

}
