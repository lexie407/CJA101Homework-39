package hw8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
//請建立一個Collection物件並將以下資料加入:
//Integer(100)、Double(3.14)、Long(21L)、Short(“100”)、Double(5.1)、“Kitty”、Integer(100)、
//Object物件、“Snoopy”、BigInteger(“1000”)
//
//• 印出這個物件裡的所有元素(使用Iterator, 傳統for與foreach)
//• 移除不是java.lang.Number相關的物件
//• 再次印出這個集合物件的所有元素,觀察是否已將非Number相關的物件移除成功

public class Q1 {
	
	public static void main(String[] args) {
		List<Object> list = new ArrayList();
		list.add(100);
		list.add(3.14);
		list.add(21L);
		list.add(new Short((short) 100));
		list.add(new Double(5.1));
		list.add("Kitty");
		list.add(new Object());
		list.add(new Integer(100));
		list.add("Snoopy");
		list.add(new BigInteger("1000"));
		
		
		//Iterator
		System.out.println("----Iterator----");
		Iterator<Object> iterator1 = list.iterator();
		while(iterator1.hasNext())
			System.out.println(iterator1.next() + ",");
		
		//for迴圈
		System.out.println("----for迴圈----");
		for(int i = 0; i < list.size(); i++)
		System.out.println(list.get(i) + ",");
		
		
		//for-each
		System.out.println("----foreach----");
		for(Object obj : list)
			System.out.println(obj + ",");
		
		
		//移除不是java.lang.Number相關的物件
		System.out.println("----移除不是java.lang.Number的物件----");
		Iterator <Object> iterator2 = list.iterator(); 
		while(iterator2.hasNext()) {
			if(iterator2.next() instanceof Number == false) {
				iterator2.remove();
			}
		}
		
		//再次印出這個集合物件的所有元素
		for(Object obj2 : list) {
			System.out.println(obj2 + ",");
		}
		
		
		
		
		
		
		
	}

}
