package hw6;


public class Calculator {

	  public int powerXY(int x, int y) throws CalException {
	      if (x == 0 && y == 0) {
	          throw new CalException("x 與 y 不可同時為 0！");
	      }

	      if (y < 0) {
	          throw new CalException("次方不可為負！");
	      }

	      return (int) Math.pow(x, y);
	  }
}