package day10;

public class Equlas {

	Object obj = new Object();

	public static void main(String[] args) {

		A a = new A(10, 20);
		//A a1 = new A(10, 20);
		A a1 = (A)a.clone();
		System.out.println(a.equals(a1));
		System.out.println(a.toString());
		
		// 클래스 A의 멤버 a : 0~10000값을 가짐
		// 현재 클래스 A로 생성된 객체가 10만개

	}

}

class A implements Cloneable {	// 인터페이스 안에 clone이 있는거임
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
			obj = super.clone();						// 여기서 super : object 클래스
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}		
		
		return obj;
	}
	
	
	
	
	
	
}
