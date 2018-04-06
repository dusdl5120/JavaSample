package day7;

public class Abstract2 {

	public static void main(String[] args) {
		
		Maths m = new Maths();		// 클래스명 객체명 = new 생성자()'
		
		System.out.println("절대값 메소드 테스트");
		System.out.println(m.abs(-2));
		System.out.println(m.abs(2));
		System.out.println(m.abs(-1.442));
		System.out.println(m.abs(5.145));
		System.out.println();
		
		System.out.println("제곱메소드 테스트");
		System.out.println(m.pow(9, 6));
		System.out.println(m.pow(4, 4));
		
		System.out.println();
		System.out.println("랜덤한 숫자");
		System.out.println(m.randomInt(100, 111));
		
		System.out.println("원의넓이 테스트");
		System.out.println(m.getAreaCircle(7));
		
		Test t1 = new Test();
		t1.num = 10;
		
		Test t2 = new Test();
		
		if (t1.equal(t1, t2)) {
			System.out.println("두 객체가 같음");
		} else {
			System.out.println("두 객체가 다름");
		}
		
		
		
		
	}

}



interface MathInterface {
	
	public final double PI = Math.PI;
				
	public int abs(int num);						// 정수 num의 절대값
	public double abs (double num);					// 실수 num의 절대값
	public int pow(int a, int b); 					// a의 b제곱
	public int randomInt(int a, int b);				// a보다 크거나 같고 b보다 작은 랜덤수
	public double getAreaCircle(int radius); 		// 원의 넓이를 구하는 메소드
	
	
	
	
	
	
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
		
		// 2의 3승 : 2 *2 *2  = 2를 3번곱해
		// a의 b승 : a *a *a  = a를 b번곱해
		
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
	
	// public boolean equal(클래스 객체 1, 클래스 객체 2);
	public boolean equal(Object obj, Object obj1);
	public boolean equal(Object obj);
}


class Test implements Basic {

	int num;
	
	@Override
	public boolean equal(Object obj, Object obj1) {			// object는 최상위 클래스이기 때문에 모든 다른 자식클래스의 형변환이 가능

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



