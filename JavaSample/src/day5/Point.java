package day5;

public class Point {

	private int x;				// 점좌표 x
	private int y;				// 점좌표 y
	
	public int getX() {			// private인 변수를 사용하기 위해 public으로 지정해주고 getter / setter
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
	
	public void move (int x, int y) {			// 점 이동 move() 생성자를 만드는디 외부에서 x, y의 값을 받아서 멤버변수(일반변수)의 x의 값에 넣어줌
		this.setX(x);							// this.x(일반변수, 인스턴스, 멤버변수, 필드) = x(매개변수); 해도 똑같음.  
		this.setY(y);
	}
	
	public void print() {								// print() 출력할 생성자. 
		System.out.println("(" + x + ", " + y + ")");	// 이렇게 출력할거다. --> (x, y)
	}
	
	public Point() {  	}					// point() 기본생성자 오버로딩
	
	public Point(int x, int y) {			// point() 매개변수 2개 받아서 일반변수에 대입
		this.setX(x);
		this.setY(y);
	}
	
	public Point (Point p) {				// point() 생성자의 객체 p를 받아서 그값을 일반변수에 대입
		this.setX(p.x);
		this.setY(p.y); 
	}
	
	
}








