package day7;

public class Extends {

	public static void main(String[] args) {
		
		Child1 c = new Child1();			// parents() �⺻�����ڸ� ȣ������ �ʾƵ� �θ�Ŭ������ ��ӹ޾ұ� ������ �θ�⺻�����ڵ� ȣ���. 
										// �̰� �⺻�����ڸ� ȣ���ѰŰ�, ���� �θ�� �ڽĻ����ڰ� ȣ��Ȱ�. ȣ���� �θ����.
		
		// c.prints();					// �θ�Ŭ������ ��ӹ޾Ƽ� prints()�� ȣ�Ⱑ��
		
		Child1 c2 = new Child1(1,2,3);	// �굵 ��������. �Ķ���� 3���� ���� �޾Ƽ� ȣ��.
		
		ChildOther co = new ChildOther();
		ChildOther co2 = new ChildOther(4,3,2,1);
		
		System.out.println("child x : " + c2.x);			// �����ڿ��� this.setX()�� ������ ȣ���� ���� c2.getX()��
		System.out.println("child y : " + c2.getY());
		System.out.println("child z : " + c2.getZ());
		
		System.out.println("childOther x : " + co2.x);
		System.out.println("childOther y : " + co2.getY());
		System.out.println("childOther z : " + co2.getZ());
		System.out.println("childOther num : " + co2.num);

	}

}


class Parents {
	
	public int x;
	protected int y;
	private int z;
	
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}
	
	
	public void prints () {
		
		System.out.println("�θ��Դϴ�.");
	}
	
	public Parents() {
		
		System.out.println("�θ� ����Ʈ ������");
		
	}

	public Parents(int x, int y, int z) {		// x,y,z�� �Է¹޾Ƽ� ���� �����ϴ� ������
		
		this.setY(y);			
		this.setZ(z);
		this.x = x;
		
		System.out.println("�θ������ �����ε�");
		
	}

}


class Child1 extends Parents {
	
	public void print () {
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(getZ());		// �׳� z���δ� �����ü� �����ϱ�. getter / setter ���� �� getZ���� �����;��� (private���� ����Ǿ��� ������)				
		
	}
	
	@Override
	public void prints() {
		
		System.out.println("�ڽ��Դϴ�.");		// �θ�Ŭ�������� print()�� ��ӹ޾����� �ڽ�Ŭ�������� ���� �޼ҵ� ��, prints()�� ������ �����ϰ� ������
												// �������̵��� ���� �����������ν� ���θ޼ҵ忡�� ȣ���� �� �ڽ�Ŭ�������� �������� �������� ȣ���
	}
	
	public Child1 () {
		
		// super()�� �ڵ����� �����Ǿ���.					// super(); �� ����� ���� ��, �θ� Ŭ������ �����ڴ� �׻� �ڽ�Ŭ���� �������� ù�ٿ� �Է��ؾ���
		
		System.out.println("�ڽ� ����Ʈ ������");			
	}
	
	public Child1(int x, int y, int z) {
		
		super(x,y,z);										// �θ�Ŭ������ �����ڸ� ȣ�� (���� �Ű������� �ޱ� ������ �ߺ��̵Ǵϱ� �� �����ϰ� �ڵ�)
		System.out.println("�ڽ� ������ �����ε�");
		
	}
	
	
}


class ChildOther extends Parents {
	
	public int num;
	
	public ChildOther() {
		
		System.out.println("�ٸ� �ڽ� ����Ʈ ������");
		
	}
	
	public ChildOther(int x, int y, int z, int num) {
		
		super(x, y, z);		// setZ(z), setY(y) �̷������� ���� �����ص� ������ �θ�Ŭ������ �ִ°� �׳� ���ٽ��.
		this.num = num;		// ��� �θ�Ŭ������ ���� ������ �̰� �ڱⰡ �����ؾ���. �θ� ������ټ� ���� �븩����
							// �θ� ���� ������ ������ ������ �����پ���. ������ �θ𲨸� ���� �� �� ����
		
		System.out.println("�ٸ� �ڽ� ������ �����ε�");
		
	}
	
	
	
	
	
	
}
























