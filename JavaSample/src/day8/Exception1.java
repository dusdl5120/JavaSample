package day8;

public class Exception1 {
	
	public static void main(String[] args) {

		int[] arr = new int[5];
		int res = 0;
		
		A a = new A();
		
		try {
			
//			int num = 1;
//			res = 5/num;		// 예외가 발생할 수 있는 코드
//			arr[4] = 5;
//			a.count();
			
			div(1,1);
			int cnt = count(arr,6,0);
			
		} catch (ArrayIndexOutOfBoundsException ie) {
			System.out.println("배열번지접근에러 : " + ie.getMessage());

		} catch (NullPointerException ne) {
			System.out.println("Nullpointer 예외");
		
		} catch (Exception e) {
			System.out.println("모든예외처리 : " + e.getMessage());
		
		} finally {
			
			// 예외처리가 끝나면 무조건 실행되는 부분
			
			System.out.println("무조건출력");
			
		}
	}
	
	public static int div (int a, int b) throws ArithmeticException {	// 얘는 워떤 예외를 사용할건지 알려주기만 하는거
		
		if (b == 0) {
			throw new ArithmeticException("0으로 나눌수 없다.");	// 문자열을 문자변수에 저장
		}
		return a/b;
		
	}
	
	public static int count(int[] arr, int size, int num) throws ArrayIndexOutOfBoundsException {	// 이 배열에 넘버가 몇개있는지 알려주는거
		
		int cnt = 0;
		
		for (int i=0; i<size; i++) {
			if(i>=arr.length)
				throw new ArrayIndexOutOfBoundsException("배열의 크기이상인 번지에 접근불가");
			if (arr[i] == num) 
				cnt++;
		}
		
		return cnt;		// 해당하는 배열에 일치하는 넘버가 몇개있는지 알려주는 메소드
		
	}
	
}

class A {
	
	int[] arr;
	
	void count() {
		arr[0] = 10;
	}
	
}