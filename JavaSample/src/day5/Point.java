package day5;

public class Point {

	private int x;				// ����ǥ x
	private int y;				// ����ǥ y
	
	public int getX() {			// private�� ������ ����ϱ� ���� public���� �������ְ� getter / setter
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
	
	public void move (int x, int y) {			// �� �̵� move() �����ڸ� ����µ� �ܺο��� x, y�� ���� �޾Ƽ� �������(�Ϲݺ���)�� x�� ���� �־���
		this.setX(x);							// this.x(�Ϲݺ���, �ν��Ͻ�, �������, �ʵ�) = x(�Ű�����); �ص� �Ȱ���.  
		this.setY(y);
	}
	
	public void print() {								// print() ����� ������. 
		System.out.println("(" + x + ", " + y + ")");	// �̷��� ����ҰŴ�. --> (x, y)
	}
	
	public Point() {  	}					// point() �⺻������ �����ε�
	
	public Point(int x, int y) {			// point() �Ű����� 2�� �޾Ƽ� �Ϲݺ����� ����
		this.setX(x);
		this.setY(y);
	}
	
	public Point (Point p) {				// point() �������� ��ü p�� �޾Ƽ� �װ��� �Ϲݺ����� ����
		this.setX(p.x);
		this.setY(p.y); 
	}
	
	
}








