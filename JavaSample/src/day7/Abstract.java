package day7;

public class Abstract {

	public static void main(String[] args) {
		
		/*
		 *  추상메소드는 구현 부분이 없는 메소드
		 *  추상클래스는 추상메소드가 한 개 이상이고, 객체를 만들 수 없다
		 *  추상클래스를 상속받은 일반 클래스에서 추상클래스의 객체를 만들 수 있다
		 *  A a = new A(); // 불가능
		 *  A a = new B(); // 가능
		 * 
		 */
		 
		 /*
		  * 인터페이스는 상수와 추상메소드로만 이루어진 클래스
		  * 인터페이스 C를 구현하는 클래스 D
		  * class D implements C { }
		  * 
		  */
		
		
		
		
	}

}


interface CC {
	
	public abstract void Test();
	
}



interface ShapeInterface {
	
	public abstract void draw();	
	public abstract void resize(int width, int height);	
	public abstract void move(int x, int y);	
	
}

class Shape2 implements ShapeInterface , CC {

	public int x;
	public int y;
	public int width;
	public int height;

	@Override						// 메소드가 구현이 안되어있는 부모클래스를 상속받으면 자식클래스에서 자동으로 오버라이딩 해라
	public void draw() {
		
		
	}

	@Override
	public void resize(int width, int height) {
		
		this.width = width;
		this.height = height;
		
	}

	@Override
	public void move(int x, int y) {
		
		this.x = x;
		this.y = y;
		
	}

	@Override
	public void Test() {

		
	}
	
	
	
	
	
	
}











