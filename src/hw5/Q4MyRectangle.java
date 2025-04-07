package hw5;
//請設計一個類別MyRectangle:
public class Q4MyRectangle {
//	(1) 有兩個double型態的屬性為width, depth
	double width;
	double depth;
	
//	(2) 有三個方法:
	//將收到的引數指定給width屬性
	public void setWidth(double width) {
		this.width = width;
	}
	//將收到的引數指定給depth屬性
	public void setDepth(double depth) {
		this.depth = depth;
	}
	//能計算該長方形的面積
	public double getArea(){
		double area = width * depth; 
		return area;
	}
	
//	(3) 有兩個建構子:
	//不帶參數也無內容的建構子
	public Q4MyRectangle() {
		
	}
	
	//傳入的兩個引數會指定給對應的屬性
	public Q4MyRectangle(double width, double depth) {
		this.width = width;
		this.depth = depth;
	}
	
}

