package day7;

public class Abstract2 {

	public static void main(String[] args) {
		
		Maths m = new Maths();		// Ŭ������ ��ü�� = new ������()'
		
		System.out.println("���밪 �޼ҵ� �׽�Ʈ");
		System.out.println(m.abs(-2));
		System.out.println(m.abs(2));
		System.out.println(m.abs(-1.442));
		System.out.println(m.abs(5.145));
		System.out.println();
		
		System.out.println("�����޼ҵ� �׽�Ʈ");
		System.out.println(m.pow(9, 6));
		System.out.println(m.pow(4, 4));
		
		System.out.println();
		System.out.println("������ ����");
		System.out.println(m.randomInt(100, 111));
		
		System.out.println("���ǳ��� �׽�Ʈ");
		System.out.println(m.getAreaCircle(7));
		
		Test t1 = new Test();
		t1.num = 10;
		
		Test t2 = new Test();
		
		if (t1.equal(t1, t2)) {
			System.out.println("�� ��ü�� ����");
		} else {
			System.out.println("�� ��ü�� �ٸ�");
		}
		
		
		
		
	}

}



interface MathInterface {
	
	public final double PI = Math.PI;
				
	public int abs(int num);						// ���� num�� ���밪
	public double abs (double num);					// �Ǽ� num�� ���밪
	public int pow(int a, int b); 					// a�� b����
	public int randomInt(int a, int b);				// a���� ũ�ų� ���� b���� ���� ������
	public double getAreaCircle(int radius); 		// ���� ���̸� ���ϴ� �޼ҵ�
	
	
	
	
	
	
}

class Maths implements MathInterface {

	@Override
	public int abs(int num) {
		
		if (num < 0 ) {
			return num * (-1);
	
		}else {
			return num;
		}
	}

	@Override
	public double abs(double num) {			
		
		if (num < 0.0) {
			return num * (-1);
			
		}else {
			return num;					// return num >= 0 ? num : -num;
		}
	}

	@Override
	public int pow(int a, int b) {
		
		// 2�� 3�� : 2 *2 *2  = 2�� 3������
		// a�� b�� : a *a *a  = a�� b������
		
		int k = 1;						
		
		for(int i=0; i<b; i++) {
			
			k = k * a;
		}
		
		return k;
		
	}

	@Override
	public int randomInt(int a, int b) {		// ran >= a || ran <= b		
		
		return (int)(Math.random() * (b-a+1) + a);
	}

	@Override
	public double getAreaCircle(int radius) {
		
		return (radius*radius)*PI;
	}
	
}


interface Basic {
	
	// public boolean equal(Ŭ���� ��ü 1, Ŭ���� ��ü 2);
	public boolean equal(Object obj, Object obj1);
	public boolean equal(Object obj);
}


class Test implements Basic {

	int num;
	
	@Override
	public boolean equal(Object obj, Object obj1) {			// object�� �ֻ��� Ŭ�����̱� ������ ��� �ٸ� �ڽ�Ŭ������ ����ȯ�� ����

		if (((Test)obj).num == ((Test)obj1).num) {			// 
			return true;

		} else {
			return false;
		}
	}

	@Override
	public boolean equal(Object obj) {
		
		if (((Test)obj).num == this.num) {			// 
			return true;

		} else {
			return false;
		}
	}
	
	
	
}



