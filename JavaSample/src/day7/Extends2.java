package day7;

public class Extends2 {

	public static void main(String[] args) {
		

		RectC r = new RectC();
		r.draw();
		
		RectC r2 = new RectC(0,0,10,10);
		r2.draw();
		
		
	}

}


class ShapeP {
	
	public int x;
	public int y;
	public int width;
	public int height;
	
	public ShapeP() {
		
	}
	
	public ShapeP(int x, int y, int width, int height) {
		
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	public void draw() {
		
		System.out.println("�����Դϴ�.");
	}
	
	public void move(int x, int y) {
		
		this.x = x;
		this.y = y;
		
	}
	
	public void resize(int width, int height) {
		
		this.width = width;
		this.height = height;
		
	}
	
}

class RectC extends ShapeP {
	
	public RectC() {
		
	}
	
	public RectC(int x, int y, int width, int height) {
		
		super(x,y,width,height);
	}
	
	@Override
	public void draw() {
		
		System.out.println("�簢���Դϴ�.");
		System.out.println("�������� �� : " + x + "," + y);
		System.out.println("���� :" + width);
		System.out.println("���� :" + height);
		
	}
	
	
}






















