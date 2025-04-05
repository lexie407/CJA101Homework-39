package hw8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TestTrain{
	//• 設計對應的getter/setter方法,並在main方法裡透過建構子產生以下7個Train的物件,放到每小題需使用的集合裡
	//- (202, “普悠瑪”, “樹林”, “花蓮”, 400)
	//- (1254, “區間”, “屏東”, “基隆”, 700)
	//- (118, “自強”, “高雄”, “台北”, 500)
	//- (1288, “區間”, “新竹”, “基隆”, 400)
	//- (122, “自強”, “台中”, “花蓮”, 600)
	//- (1222, “區間”, “樹林”, 七堵, 300)
	//- (1254, “區間”, “屏東”, “基隆”, 700)
	//• (以下三題請根據使用的集合,練習各種取值寫法,如迭代器、for迴圈或foreach等)
	
	public static void main(String[] args) {
		Train t1 = new Train(202, "普悠瑪", "樹林", "花蓮", 400);
		Train t2 = new Train (1254, "區間", "屏東", "基隆", 700);
		Train t3 = new Train(118, "自強", "高雄", "台北", 500);
		Train t4 = new Train(1288, "區間", "新竹", "基隆", 400);
		Train t5 = new Train(122, "自強", "台中", "花蓮", 600);
		Train t6 = new Train(1222, "區間", "樹林", "七堵", 300);
		Train t7 = new Train(1254, "區間", "屏東", "基隆", 700);
		
		//• 請寫一隻程式,能印出不重複的Train物件
		System.out.println("=====請寫一隻程式,能印出不重複的Train物件=====");
		Set<Train> set = new HashSet<Train>();
		set.add(t1);
		set.add(t2);
		set.add(t3);
		set.add(t4);
		set.add(t5);
		set.add(t6);
		set.add(t7);
		
		System.out.println("--for each--");
		for(Train train1:set){
			System.out.println(train1);
		}
		
		System.out.println("--Iterator--");
		Iterator<Train> train2 = set.iterator();
		while(train2.hasNext())
			System.out.println(train2.next());
		
		System.out.println("--傳統迴圈--");
		Object[] arr = set.toArray(); 
		for (int i = 0; i < arr.length; i++) {
		    System.out.println(arr[i]);
		}
		
		System.out.println();
		
		
		//• 請寫一隻程式,讓Train物件印出時,能以班次編號由大到小印出
		System.out.println("=====請寫一隻程式,讓Train物件印出時,能以班次編號由大到小印出=====");
		List<Train> list = new ArrayList<Train>();
		list.add(t1);
		list.add(t2);
		list.add(t3);
		list.add(t4);
		list.add(t5);
		list.add(t6);
		list.add(t7);
			
		System.out.println("---for each---");
		for(Train train3:list){
			System.out.println(train3);
		}
			
		System.out.println("---Iterator---");
		Iterator<Train> train4 = list.iterator();
		while(train4.hasNext())
			System.out.println(train4.next());
			
		System.out.println("---傳統迴圈---");
		for (int i = 0; i < list.size(); i++) {
			 System.out.println(list.get(i));
		}
		
		System.out.println();
		
		//• 承上,不僅能讓班次編號由大排到小印出, 還可以不重複印出Train物件
		
		System.out.println("=====不僅能讓班次編號由大排到小印出, 還可以不重複印出Train物件=====");
		Set<Train> set2 = new TreeSet<Train>();
		set2.add(t1);
		set2.add(t2);
		set2.add(t3);
		set2.add(t4);
		set2.add(t5);
		set2.add(t6);
		set2.add(t7);
			
		System.out.println("---for each---");
		for(Train train5:list){
			System.out.println(train5);
		}
			
		System.out.println("---Iterator---");
		Iterator<Train> train6 = set2.iterator();
		while(train6.hasNext())
			System.out.println(train6.next());
			
		System.out.println("--傳統迴圈--");
		Object[] arr2 = set2.toArray(); 
		for (int i = 0; i < arr2.length; i++) {
		    System.out.println(arr2[i]);
		}
		
		System.out.println();
		
		
		
		
	}

}
