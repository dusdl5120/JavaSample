package day5;

public class Main {

	public static void main(String[] args) {

		Circle cl = new Circle();		// Circle Ŭ������ ��ü����
		cl.printCircle();				// printCircle ������ ȣ�� -> �׷� �Ű����� ���� Circle�����ڸ� ȣ���԰� ���ÿ� ��ü �����Ұ���
										// circle() �����ڴ� �⺻������ �߽���ǥ 0,0 / �������� 5.0���� ��� ������ ����� �̷��� ��� ���� 
		
		cl.moveCenter(10, 10);			// moveCenter() ������ ȣ�� -> �굵 �ܺο��� �߽���ǥ�� (10, 10)���� �޾Ƽ� ����. �������� �ܺο��� �������� ���� ������ �⺻�� �״�� 5.0
		cl.printCircle();				// �� �� ����ϸ� �߽���ǥ 10, 10 / �������� 5.0���� ��� ����
		
		cl.resize(20.1);				// resize() ������ ȣ�� -> �굵 �ܺο��� �������� (20.1)�� �޾Ƽ� ����. �߽���ǥ���� �ܺο��� �������� ���� ������ �Ʊ� �״�� 10, 10
		cl.printCircle();				// �� �� ����ϸ� �߽���ǥ 10, 10 / ������ : 20.1 ���� ��� ����
		
		System.out.println();

	/********************************************************************************************************************************************************************************/	
		
		Rect r = new Rect();				// �Ű����� ���� Rect() ������ ��ü����
		r.print();							// print() ȣ��
		
		Rect r2 = new Rect(0,0,10,-10);		// �Ű����� 4��¥�� Rect() ������ ��ü����
		r2.print();							// print() ȣ�� <-- Rect Ŭ���� ����
		
		Rect r3 = new Rect(new Point(0,0), new Point(10,-10)); 		// PointŬ������  �������� ���Ҹ��ߤ�������
		r3.print();
		
	}

}