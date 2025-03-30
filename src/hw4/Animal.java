package hw4;

public class Animal {
//- 建立一個class ，名為Animal.java
//	- 此類別有兩個成員變數分別為age（年紀- 型別int）、weight（體重- 型別float）
//	- 此類別需宣告有參數的建構子
//	- 有一成員方法名為speak（），用以列印上述兩個值(列印成果)	

	
	private int age;
	private float weight;
	
//把無參數的建構子宣告回來
	public Animal() {
		//	1.方便給子類別對應
		//  2.無參數建構子也是Java Bean的規範之一
		//	3.留著給日後搭配的框架使用(框架工具利用此建構子幫我們產生實體)
	}

//有參數建構子，設定屬性
	public Animal(int age, float weight) {
		this.age = age; //區分出事實體變數的存取
		this.weight = weight;
	}
	
	public void speak() {
		System.out.println("年齡是" + age);
		System.out.println("體重是" + weight);
	}
	
	//用來更新資料用，還是要設置setter/getter
	

	
	public void setAge(int age) {
		this.age = age;
	}
	
		
	public void setWeight(float weight) {
		this.weight = weight;
	}
	
	public int getAge() {
		return age;
	}
	
	
	public float getWeight() {
		return weight;
	}
	
	
}
