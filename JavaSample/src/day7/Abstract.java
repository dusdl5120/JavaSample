package day7;

public class Abstract {

	public static void main(String[] args) {
		
		/*
		 *  �߻�޼ҵ�� ���� �κ��� ���� �޼ҵ�
		 *  �߻�Ŭ������ �߻�޼ҵ尡 �� �� �̻��̰�, ��ü�� ���� �� ����
		 *  �߻�Ŭ������ ��ӹ��� �Ϲ� Ŭ�������� �߻�Ŭ������ ��ü�� ���� �� �ִ�
		 *  A a = new A(); // �Ұ���
		 *  A a = new B(); // ����
		 * 
		 */
		 
		 /*
		  * �������̽��� ����� �߻�޼ҵ�θ� �̷���� Ŭ����
		  * �������̽� C�� �����ϴ� Ŭ���� D
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

	@Override						// �޼ҵ尡 ������ �ȵǾ��ִ� �θ�Ŭ������ ��ӹ����� �ڽ�Ŭ�������� �ڵ����� �������̵� �ض�
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











