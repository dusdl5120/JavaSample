package day5;

public class Circle {

	// 원 만들기

	private int centerX;						// 중심좌표 x
	private int centerY;						// 중심좌표 y
	private double radius;						// 반지름길이 

	public int getCenterX() {					// 게터 
		return centerX;							
	}

	public void setCenterX(int centerX) {		// 세터
		this.centerX = centerX;
	}

	public int getCenterY() {
		return centerY;
	}

	public void setCenterY(int centerY) {
		this.centerY = centerY;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public Circle() {						// 매개변수 없는거
	      this.setCenter(0,0);				// this()생성자를 사용함으로써 매개변수가 x,y (중심좌표) 값을 2개 세팅해줌
	      this.setRadius(5.0);				// 얘도 this()생성자를 사용함으로써 매개변수가 c (반지름)가 값을 1개 세팅해줌 (double이니까 실수로)
	   }

	public Circle(int x, int y, double r) {			// 매개변수 중심좌표 x, y , 반지름 r 
	      this.setCenter(x, y);						// 근데 얘도 this()생성자를 사용하니까 매개변수 x,y 2개팅
	      this.setRadius(10.0);						// 얘도 똑같이
	   }

	public Circle(Circle c) {
	      this.setCenter(c.centerX, c.centerY);			// 얘도 this()생성자를 사용하는데 외부에 있는 값을 받아와서 필드 centerX에 값을 넣어주고 , Y도 똑같이
	      this.setRadius(c.radius);						// 얘도 똑같이 필드에 값을 넣어주기
	   }

	public void setCenter(int x, int y) {				// 비슷한 애들을 모아서 한번에 쓸수 있게 setCenter()생성자 만들어주기. 중복방지
		this.setCenterX(x);								// 얘는 this.centerX = x ; 와 같은거.  아무거나 써도 상관은 없는 듯. 자기가 편한걸로 쓰기ㅋ
		this.setCenterY(y);								
		
	}
	
	public void moveCenter(int x, int y) {				// 얘도 setCenter()를 호출. 즉 this()를 사용하는거지. 외부에서 x, y 받아서 this()생성자 사용하면서
		this.setCenter(x, y);							// 필드에 값 집어넣기
	}
	
	public void resize(double r) {						// 반지름 매개변수 r을 외부에서 값을 받아서 필드에 값을 집어넣기
		this.setRadius(r);
	}

	public void printCircle() {								// 그러고 출력생성자
		System.out.println("원의정보");
		System.out.println("중심좌표 : " + centerX + ", " + centerY);
		System.out.println("반지름 : " + radius);
	}

	public void print() {
		// TODO Auto-generated method stub
		
	}
	
}