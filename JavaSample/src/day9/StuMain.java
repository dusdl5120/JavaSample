package day9;

public class StuMain {

	public static void main(String[] args) {
		
		/*
		 * 1. StudentŬ������ ��ü s�� new �����ڸ� ���� ������ �� �������� �Ű������� �̸�, �г�, ��, ��ȣ, ����, ����, ������ �Ѱ��ش�
		 * 2. ��ü s�� ���� �������� print() �޼ҵ带 ȣ���Ͽ� ����� Ȯ��
		 * 3. ��ü s�� ���� �������� modifyStudent �޼ҵ带 ȣ���Ͽ� ������ �����ϴµ� �Ű������� �̸�, �г�, ��, ��ȣ, ����, ����, ������ �Ѱ��ش�
		 * 3-1. ��ü s�� ���� �������� print() �޼ҵ带 ȣ���Ͽ� ����� Ȯ��
		 */

		Student s = new Student("ȫ�浿", 2, 3, 10, 90.5, 87.6, 79.4);
		s.print();
		
		
		s.modifyStudent("ȫ���", 5, 5, 5, 100, 59.4, 73.1);
		
		System.out.println();
		System.out.println("�������� ��");
		System.out.println();
		s.print();
		
		/* 
		 * 4. StuManagerŬ������ ��ü sm�� �����ϴµ� �л��� ������ 10�� �����ϵ��� ��ü����
		 * 5. �л� �Ѹ��� ������ ��ü sm�� ������ �ִ� insert �޼ҵ带 �̿��Ͽ� ����
		 * 6. �л����� ������ ��üsm�� ������ �ִ� print �޼ҵ带 �̿��Ͽ� ���
		 */
		
		StuManager sm = new StuManager(10);		// �׳� StuManager()�� �ϸ� ����Ʈ�����ڸ� ȣ���ϴ°ű� ������ 10�� ������ �����Ϸ��� ���� ���ڸ� �־���� �ٸ� �����ڸ� ȣ���Ѵ�.
		
		sm.insert("������", 1, 1, 1, 100, 100, 70);
		sm.insert("������", 3, 3, 2, 90, 80, 50);
		sm.print(); 
		
		/* 
		 * 7. 1�г� 1�� 10�� �˻����� ����� ����ϴ� �ڵ� : ��ü sm�� searchIndex�޼ҵ�� sytem.out.println �޼ҵ带 �̿��Ͽ� �ش��ϴ� ���� ���
		 * 
		 */
		
		//System.out.println(sm.searchIndex(1, 1, 10));
		
		sm.modify(1, 1, 1, "����", 10, 20, 30);
		sm.modify(3, 3, 2, "����", 10, 20, 30);
		sm.print();
		
		
		
		
	}
	
	
		
		

}
