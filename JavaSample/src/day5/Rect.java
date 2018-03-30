package day5;

public class Rect {

	protected Point leftup;		
	protected Point rightdown;		
	protected int width;				
	protected int height;				
	
	public Point getLeftup() {
		return leftup;
	}
	public void setLeftup(Point leftup) {
		this.leftup = leftup;
	}
	public Point getRightdown() {
		return rightdown;
	}
	public void setRightdown(Point rightdown) {
		this.rightdown = rightdown;
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
	
	public void calWidth() {										// 너비 생성자
		width = Math.abs(rightdown.getX() - leftup.getX());			// 너비 = 오른쪽아래좌표 x - 왼쪽위좌표 x의 절대값 (쉽게 말하면 공식으로 생각?)
	}
	
	public void calHeight() {										// 높이 생성자
		height = Math.abs(rightdown.getY() - leftup.getY());		// 높이 = 오른쪽아래좌표 y - 왼쪽위좌표 y의 절대값
	}
	
	public Rect() {													// 외부에서 받는 값이 없는 사각형 생성자()
		this.leftup = new Point(0, 10);								// 왼쪽위 좌표 객체생성 (0 , 10)
		this.rightdown = new Point(10, 0);							// 오른쪽아래 좌표 객체생성 (10, 0)
		this.calWidth();											// 위의 값들을 calWidth()와 calHeight()에 각각 대입해보면
		this.calHeight();											// width = 10 - 0 (절대값 10 출력예상) / height = 0 -10 (절대값 10 출력예상)  										
	}
	
	public Rect(int left, int up, int right, int down) {			// 외부에서 받는 매개변수 4개. 
		this.leftup = new Point(left, up);							// 왼쪽위 좌표 객체생성 (왼쪽 , 위)
		this.rightdown = new Point(right, down);					// 오른쪽아래 좌표 객체생성 (오른쪽, 아래)
		this.calHeight();											// 위의 값들을 calWidth()와 calHeight()에 각각 대입해보면
		this.calWidth(); 											// 메인메소드에서 (0,0,10,-10); 이렇게 값을 줬으니 (왼쪽부터 차례대로 왼쪽, 위, 오른쪽, 아래)
																	// width =    ??      (절대값  ??  출력예상) / height =    ??     (절대값  ??  출력예상)
	}

	public Rect (Point leftup, Point rightdown) {					// 외부에서 받는 매개변수 2개. 
		this.leftup = new Point(leftup);							// 
		this.rightdown = new Point(rightdown);						// ㅋㅋㅋ 모르겟다 ㅋㅋㅋ
		this.calHeight();
		this.calWidth(); 
	}
	
	public void print() {
		System.out.println("-- 사각형의 정보 --");
		System.out.print("왼쪽위의 점 : ");
		leftup.print();
		System.out.print("오른쪽위의 점 : ");
		rightdown.print();
		System.out.print("가로 : " + width);
		System.out.println("세로 : " + height);
	}
	
			
		public void print1() {										// 메인메소드에 출력할 생성자
		System.out.println("--사각형의 정보--");
		System.out.print("좌상의 점 : ");
		leftup.print();
		System.out.print("우하의 점 : ");
		rightdown.print();
		System.out.println("가로 : " + width);
		System.out.println("세로 : " + height);
	}
}








