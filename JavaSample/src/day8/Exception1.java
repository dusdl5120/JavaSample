package day8;

public class Exception1 {
	
	public static void main(String[] args) {

		int[] arr = new int[5];
		int res = 0;
		
		A a = new A();
		
		try {
			
//			int num = 1;
//			res = 5/num;		// ���ܰ� �߻��� �� �ִ� �ڵ�
//			arr[4] = 5;
//			a.count();
			
			div(1,1);
			int cnt = count(arr,6,0);
			
		} catch (ArrayIndexOutOfBoundsException ie) {
			System.out.println("�迭�������ٿ��� : " + ie.getMessage());

		} catch (NullPointerException ne) {
			System.out.println("Nullpointer ����");
		
		} catch (Exception e) {
			System.out.println("��翹��ó�� : " + e.getMessage());
		
		} finally {
			
			// ����ó���� ������ ������ ����Ǵ� �κ�
			
			System.out.println("���������");
			
		}
	}
	
	public static int div (int a, int b) throws ArithmeticException {	// ��� ���� ���ܸ� ����Ұ��� �˷��ֱ⸸ �ϴ°�
		
		if (b == 0) {
			throw new ArithmeticException("0���� ������ ����.");	// ���ڿ��� ���ں����� ����
		}
		return a/b;
		
	}
	
	public static int count(int[] arr, int size, int num) throws ArrayIndexOutOfBoundsException {	// �� �迭�� �ѹ��� ��ִ��� �˷��ִ°�
		
		int cnt = 0;
		
		for (int i=0; i<size; i++) {
			if(i>=arr.length)
				throw new ArrayIndexOutOfBoundsException("�迭�� ũ���̻��� ������ ���ٺҰ�");
			if (arr[i] == num) 
				cnt++;
		}
		
		return cnt;		// �ش��ϴ� �迭�� ��ġ�ϴ� �ѹ��� ��ִ��� �˷��ִ� �޼ҵ�
		
	}
	
}

class A {
	
	int[] arr;
	
	void count() {
		arr[0] = 10;
	}
	
}