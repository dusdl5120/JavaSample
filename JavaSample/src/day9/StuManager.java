package day9;

public class StuManager {

	/*
	 * 1. �ʿ��� �������
	 * 1-1. �л�Ŭ������ �迭
	 * 1-2. �л��� �ִ� ���� �����ϴ� ���� : int
	 * 1-3. ���� ����� �л��� �� : int
	 * 
	 */
	
	private Student[] std;
	private int max;
	private int cnt;
	
	
	/*  2. getter�� setter ���� */
	
	public Student[] getStd() {
		return std;
	}
	public void setStd(Student[] std) {
		this.std = std;
	}
	public int getMax() {
		return max;
	}
	public void setMax(int max) {
		this.max = max;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	
	
	/* 3. ������
	 * 3-1. ����Ʈ������ : �����ü std�� �迭�� new �����ڸ� ���� �����Ѵ�. �̶� �����Ǵ� �迭�� ����(�ִ�)�� 30���� �Ѵ�
	 * 3-2. �����ڿ����ε� : �Ű������� ������ �迭�� ũ�⸦ �Ѱܹ޾� �ش�ũ�⸦ �̿��Ͽ� �迭�� �����Ѵ�
	 */
	
	public StuManager() {
		
		max = 30;
		std = new Student[max];
		
		//this(30);
	}
	
	public StuManager(int size) throws RuntimeException {
		 
		if (size <= 0) {
			throw new RuntimeException("�迭�� ũ�� 0 �Ǵ� ���� �Ұ�");
		}
		
		max = size;
		std = new Student[size];
		
	}
	
	/* 4. �ʿ��� �޼ҵ�
	 * 4-1. �л������� �߰��ϴ� �޼ҵ�
	 *      �ʿ��� �Ű����� : �л������� (�̸�, �г�, ��, ��ȣ, ����, ����, ����)
	 *      ����Ÿ�� : void
	 * 4-2. ��ü�� �Է¹��� �Ű��������� ���� �����ؾ��ϴµ� �����ϴ� �迭�� ������ nowCnt�� ����
	 * 4-3. ���� ����� �л���(nowCnt)�� ����
	 */
	
	public void insert(String name, int grade, int ban, int num, double kor, double eng, double math) {
		
		if (cnt == max) {
			throw new RuntimeException("���̻� ������ �� ����.");
		}
		
		// �˻��� �ؼ� �Ű������� �г�, ��, ��ȣ�� ������ ��ġ�ϴ� ��ü�� ������ �л����� �߰��� ���� �ʰ� ����ó���� ��
		
		if (searchIndex(grade, ban, num) != -1) { 		// -1�̶�� ���� ���� �ش��ϴ� ��ü�� ��ã���� ���ϱ�. -1�� �ƴѰŴ� ���� �ش��ϴ� ��ü�� ã�������� �ǹ���
			throw new RuntimeException("�̹� �ش��ϴ� �л��� ������ �ִ�.");
		}
		
		std[cnt++] = new Student(name, grade, ban, num, kor, eng, math);		
	}
	
	
	/* 
	 * 4-4. �л����� ������ ����ϴ� �޼ҵ�
	 *      �ʿ��� �Ű����� : ����
	 *      ����Ÿ�� : void
	 * 4-5. �޼ҵ�� : print
	 * 4-6. �ݺ����� �̿��ؼ� �л� ������ ����Ǿ� �ִ� �迭 std�� 0�������� �����ؼ� ��������� �л��� cnt-1���� ��������ϴµ�
	 *      �л������� ����� �� StudentŬ������ ����޼ҵ� print�޼ҵ带 �̿�
	 */
	
	public void print() {
		
		for (int i=0; i<cnt; i++) {

			std[i].print();
		}
	}
	
	/* 
	 * 5. �л������˻��޼ҵ�
	 * 	  �ʿ��� �Ű����� : �г�, ��, ��ȣ
	 *    ����Ÿ�� : ����(int)
	 *    �޼ҵ�� : searchIndex
	 * 5-1. �ݺ��� 0�������� cnt���� �ݺ�
	 * 5-2. �ݺ������� �Ű����� �г�, ��, ��ȣ�� ���� ��ġ�ϴ� ��ü�� �ִ��� ���ǹ��� ���� Ȯ��
	 * 5-3. Ȯ���Ͽ� �ش簴ü�� ã������ �ش��ϴ� ������ �����ϰ� ���� �˻��ߴµ� ��ã���� -1�� �����Ѵ�
	 * 
	 */
	
	public int searchIndex(int grade, int ban, int num) {
		
		for (int i=0; i<cnt; i++) {
			
			if (std[i].getGrade() == grade && std[i].getBan() == ban && std[i].getNum() == num) 
				return i;
		}
		
		return -1;
	}	
	
	
	/* 
	 * 6. �л����� �����޼ҵ�
	 * 	  �Ű����� : (�˻��� ����) �г�, ��, ��ȣ, 
	 *               (������ ����) �̸�, ����, ����, ����
	 *    ����Ÿ�� : �л���ü (Student)
	 *    �޼ҵ�� : modify
	 * 6-1. �Ű����� �г�, ��, ��ȣ�� ���� �л� �迭�� �˻��Ͽ� �ش��л��� ������ ������ �ش� ������ �л��� ������ �Ű����� �̸�, ����, ����, �������� �����Ѵ�
	 * 6-2. ������ �� �ش� ��ü�� �����Ѵ�
	 * 6-3. �ش��л��� ������ ������ null���� ����
	 *    
	 */   
	
	
	public Student modify(int grade, int ban, int num, String name, int kor, int eng, int math) {
		   
	      int index = searchIndex(grade, ban, num);
	      
	      if(index == -1)
	         return null;
	      
	      std[index].modifyStudent(name, grade, ban, num, kor, eng, math);
	      
	      return std[index].clone();
	      
	      
	      
	   }
	
	
	
	
	
	
	
	
	
	
	
	
}
