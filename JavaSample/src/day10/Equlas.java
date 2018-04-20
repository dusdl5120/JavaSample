package day10;

public class Equlas {

	Object obj = new Object();

	public static void main(String[] args) {

		A a = new A(10, 20);
		//A a1 = new A(10, 20);
		A a1 = (A)a.clone();
		System.out.println(a.equals(a1));
		System.out.println(a.toString());
		
		// Ŭ���� A�� ��� a : 0~10000���� ����
		// ���� Ŭ���� A�� ������ ��ü�� 10����

	}

}

class A implements Cloneable {	// �������̽� �ȿ� clone�� �ִ°���
	int a;
	int b;

	public A(int a, int b) {

	}

	public boolean equals(Object obj) {
		if (obj != null && obj instanceof A) {
			A tmp = (A) obj;
			if (this.a == tmp.a && this.b == tmp.b)
				return true;
		}
		return false;
	}

	public int HashCode() {
		return a % 100;
	}

	@Override
	public String toString() {
		//return this.getClass().getName() + "@" + Integer.toHexString(this.hashCode());
		return this.a + " : " + this.b;
		
	}
	
	
	public Object clone() {		
		Object obj = null;
		
		try {
			obj = super.clone();						// ���⼭ super : object Ŭ����
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}		
		
		return obj;
	}
	
	
	
	
	
	
}
