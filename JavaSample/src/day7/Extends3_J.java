package day7;

public class Extends3_J {

	public static void main(String[] args) {
		
		Rect r = new Rect();
		r.draw();
		
		Rect r2 = new Rect(0,0,5,10);
		r2.draw();
		
		 Shape s = new Shape();
		
		if (s instanceof Rect) {			// (Shape)r 형변환 가능?
			System.out.println("ok");		// instanceof는 형변환이 가능한지 불가능한지 물어보는 제어자
			
		}else {
			System.out.println("fall");
			
		}
		
		
	}

}


class Shape {
	
	private int x;
	private int y;
	private int width;
	private int height;
		
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

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	
	public void draw () {
		
		System.out.println("도형입니다.");
		
	}
	
	public void move (int x, int y) {
		
		this.setX(x);
		this.setY(y); 
		
	}
	
	public void resize(int width, int height) {
		
		this.setWidth(width);
		this.setHeight(height); 
		
	}
	
	public Shape() {
		
	}
	
	public Shape(int x, int y, int width, int height) {
		
		this.move(x, y);
		this.resize(width, height); 
		
	}
	
}

class Rect extends Shape {
	
	public Rect() {
		
	}
	
	
	public Rect(int x, int y, int width, int height) {
		
		super(x, y, width, height);
		
	}
	
	@Override
	public void draw() {
		
		System.out.println("사각형");
		System.out.println("왼쪽위의 점 : " + getX() + "," + getY());
		System.out.println("가로 :" + getWidth());
		System.out.println("세로 :" + getHeight());
		
		
	}
	
	
}



















