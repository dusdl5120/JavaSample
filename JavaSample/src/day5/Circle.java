package day5;

public class Circle {

	// �� �����

	private int centerX;						// �߽���ǥ x
	private int centerY;						// �߽���ǥ y
	private double radius;						// ���������� 

	public int getCenterX() {					// ���� 
		return centerX;							
	}

	public void setCenterX(int centerX) {		// ����
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

	public Circle() {						// �Ű����� ���°�
	      this.setCenter(0,0);				// this()�����ڸ� ��������ν� �Ű������� x,y (�߽���ǥ) ���� 2�� ��������
	      this.setRadius(5.0);				// �굵 this()�����ڸ� ��������ν� �Ű������� c (������)�� ���� 1�� �������� (double�̴ϱ� �Ǽ���)
	   }

	public Circle(int x, int y, double r) {			// �Ű����� �߽���ǥ x, y , ������ r 
	      this.setCenter(x, y);						// �ٵ� �굵 this()�����ڸ� ����ϴϱ� �Ű����� x,y 2����
	      this.setRadius(10.0);						// �굵 �Ȱ���
	   }

	public Circle(Circle c) {
	      this.setCenter(c.centerX, c.centerY);			// �굵 this()�����ڸ� ����ϴµ� �ܺο� �ִ� ���� �޾ƿͼ� �ʵ� centerX�� ���� �־��ְ� , Y�� �Ȱ���
	      this.setRadius(c.radius);						// �굵 �Ȱ��� �ʵ忡 ���� �־��ֱ�
	   }

	public void setCenter(int x, int y) {				// ����� �ֵ��� ��Ƽ� �ѹ��� ���� �ְ� setCenter()������ ������ֱ�. �ߺ�����
		this.setCenterX(x);								// ��� this.centerX = x ; �� ������.  �ƹ��ų� �ᵵ ����� ���� ��. �ڱⰡ ���Ѱɷ� ���⤻
		this.setCenterY(y);								
		
	}
	
	public void moveCenter(int x, int y) {				// �굵 setCenter()�� ȣ��. �� this()�� ����ϴ°���. �ܺο��� x, y �޾Ƽ� this()������ ����ϸ鼭
		this.setCenter(x, y);							// �ʵ忡 �� ����ֱ�
	}
	
	public void resize(double r) {						// ������ �Ű����� r�� �ܺο��� ���� �޾Ƽ� �ʵ忡 ���� ����ֱ�
		this.setRadius(r);
	}

	public void printCircle() {								// �׷��� ��»�����
		System.out.println("��������");
		System.out.println("�߽���ǥ : " + centerX + ", " + centerY);
		System.out.println("������ : " + radius);
	}

	public void print() {
		// TODO Auto-generated method stub
		
	}
	
}