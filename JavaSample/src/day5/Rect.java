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
	
	public void calWidth() {										// �ʺ� ������
		width = Math.abs(rightdown.getX() - leftup.getX());			// �ʺ� = �����ʾƷ���ǥ x - ��������ǥ x�� ���밪 (���� ���ϸ� �������� ����?)
	}
	
	public void calHeight() {										// ���� ������
		height = Math.abs(rightdown.getY() - leftup.getY());		// ���� = �����ʾƷ���ǥ y - ��������ǥ y�� ���밪
	}
	
	public Rect() {													// �ܺο��� �޴� ���� ���� �簢�� ������()
		this.leftup = new Point(0, 10);								// ������ ��ǥ ��ü���� (0 , 10)
		this.rightdown = new Point(10, 0);							// �����ʾƷ� ��ǥ ��ü���� (10, 0)
		this.calWidth();											// ���� ������ calWidth()�� calHeight()�� ���� �����غ���
		this.calHeight();											// width = 10 - 0 (���밪 10 ��¿���) / height = 0 -10 (���밪 10 ��¿���)  										
	}
	
	public Rect(int left, int up, int right, int down) {			// �ܺο��� �޴� �Ű����� 4��. 
		this.leftup = new Point(left, up);							// ������ ��ǥ ��ü���� (���� , ��)
		this.rightdown = new Point(right, down);					// �����ʾƷ� ��ǥ ��ü���� (������, �Ʒ�)
		this.calHeight();											// ���� ������ calWidth()�� calHeight()�� ���� �����غ���
		this.calWidth(); 											// ���θ޼ҵ忡�� (0,0,10,-10); �̷��� ���� ������ (���ʺ��� ���ʴ�� ����, ��, ������, �Ʒ�)
																	// width =    ??      (���밪  ??  ��¿���) / height =    ??     (���밪  ??  ��¿���)
	}

	public Rect (Point leftup, Point rightdown) {					// �ܺο��� �޴� �Ű����� 2��. 
		this.leftup = new Point(leftup);							// 
		this.rightdown = new Point(rightdown);						// ������ �𸣰ٴ� ������
		this.calHeight();
		this.calWidth(); 
	}
	
	public void print() {
		System.out.println("-- �簢���� ���� --");
		System.out.print("�������� �� : ");
		leftup.print();
		System.out.print("���������� �� : ");
		rightdown.print();
		System.out.print("���� : " + width);
		System.out.println("���� : " + height);
	}
	
			
		public void print1() {										// ���θ޼ҵ忡 ����� ������
		System.out.println("--�簢���� ����--");
		System.out.print("�»��� �� : ");
		leftup.print();
		System.out.print("������ �� : ");
		rightdown.print();
		System.out.println("���� : " + width);
		System.out.println("���� : " + height);
	}
}








