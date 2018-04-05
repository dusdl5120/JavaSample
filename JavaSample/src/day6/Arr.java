package day6;

public class Arr {

	public static void main(String[] args) {


		A[] arr = new A[4];
		
		for (int i=0; i<arr.length; i++) {
			arr[i] = new A();
		}
		
		
	}

}



class A {
	
	public A() {
		System.out.println("생성자 A호출");
	}
}
