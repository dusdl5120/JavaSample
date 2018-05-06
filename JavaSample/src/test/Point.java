package test;

public class Point {

	private int x;				// Á¡ÁÂÇ¥ x
	private int y;				// Á¡ÁÂÇ¥ y
	
	public int getX() {			
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public void move (int x, int y) {			
		this.setX(x);							
		this.setY(y);
	}
	
	public void print() {								
		System.out.println("(" + x + ", " + y + ")");	
	}
	
}








