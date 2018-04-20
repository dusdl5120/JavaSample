package day11;

public class Chainning {

	public static void main(String[] args) {

		/*
		 * Chainning 기법 : 
		 * 
		 * 일반적으로 클래스의 멤버 변수들을 설정할 때 사용하고
		 * 형태는 Build.setNum1(100).setNum2(100).setNum3(100)     --> 일렬로 점을 찍어서 표현
		 * 
		 */
		
		
		Number2 su = new Number2();
		su.setSu1(100).setSu2(200).setSu3(300);
		
		System.out.println(su.su1);
		System.out.println(su.su2);
		System.out.println(su.su3);
		
		System.out.println("===");  
		System.out.println(su.getSu1());
		System.out.println(su.getSu2());
		System.out.println(su.getSu3());
		
		System.out.println("===");  
		su.printSus();
		
		System.out.println(su);
		
	}

}



class Number2 {
	
	int su1;
	int su2;
	int su3;
	
	Number2 setSu1(int su1) {
		
		this.su1 = su1;
		return this;
	}
	
	Number2 setSu2(int su2) {
		
		this.su2 = su2;
		return this;
	}
	
	Number2 setSu3(int su3) {
		
		this.su3 = su3;
		return this;
	}
	
	
	int getSu1() {
		return su1;
	}
	
	
	int getSu2() {
		return su2;
	}
	
	
	int getSu3() {
		return su3;
	}
	
	
	void printSus() {
		System.out.println(su1);
		System.out.println(su2);
		System.out.println(su3);
	}
	
	@Override
	public String toString() {
		return "[su1 : " + su1 + ", su2 : " + su2 + ", su3 : " + su3 + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}