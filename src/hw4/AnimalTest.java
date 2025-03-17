package hw4;

public class AnimalTest {
//	在main（裡藉由建構子產生一個Animal；同時初始化該物件的年紀和體重分別為2歲、5.0公斤，並呼叫speak方法得到此Animal的成員變數值
	public static void main(String[] args) {
		Animal a = new Animal(2, 5.0f); //浮點數記得字尾輸入f
		a.speak();
		
		System.out.println("====時光飛逝 歲月如梭...轉眼三年過去了"); //對物件進行資料更新的操作
//		a1.weight = 25.0f;
//		->設定為private，無法存取
		
//		a1.Animal(5, 25.0f)
//		->建構子只能用new呼叫
		
//		a1. = new Animal(5, 25.0f)
//		->只是創建新的物件，與原本的a1已經是不同的物件了

//		正確的操作；->要使用getter/setter進行管理
		a.setAge(5);
		a.setWeight(25.0f);
		
		a.speak();
		
	} 
}
