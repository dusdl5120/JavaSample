package day11;

public class Students {

	
	/*
	 *	1. ������� : �г�, ��, ��ȣ, �̸�, ����, ����, ����
	 *	
	 *  2. getter /setter
	 *     getter�� ������ �����ϰ�
	 *	   setter�� chaning��� ���
	 *	
	 *  3. ������ : �����ڴ� �����Ӱ�
	 *  
	 *  4. ��� �޼ҵ� /  �Ϲݸ޼ҵ�
	 *     �θ�Ŭ������ �޼ҵ� �������̵�
	 *     hashocode()
	 *     equals()
	 *     toString()
	 * 	
	 */
	
	
	private String name;
	private int grade;
	private int ban;
	private int num;
	private int kor;
	private int eng;
	private int math;
	
	
	public String getName() {
		return name;
	}
	Students setName(String name) {
		this.name = name;
		return this;
	}
	public int getGrade() {
		return grade;
	}
	Students setGrade(int grade) {
		this.grade = grade;
		return this;
	}
	public int getBan() {
		return ban;
	}
	Students setBan(int ban) {
		this.ban = ban;
		return this;
	}
	public int getNum() {
		return num;
	}
	Students setNum(int num) {
		this.num = num;
		return this;
	}
	public int getKor() {
		return kor;
	}
	Students setKor(int kor) {
		this.kor = kor;
		return this;
	}
	public int getEng() {
		return eng;
	}
	Students setEng(int eng) {
		this.eng = eng;
		return this;
	}
	public int getMath() {
		return math;
	}
	Students setMath(int math) {
		this.math = math;
		return this;
	}
	
	
	public Students() {
		
		
	}
	
	public Students(int grade, int ban, int num) {
		
		this.grade = grade;
		this.ban = ban;
		this.num = num;
		 
	}
	
	@Override
	public int hashCode() {					
		
		// return 1;						// �׷��� �б� 1���� ����
		// return grade; 					// �г��� ���� 3���� �׸��� ����
		return grade*100 + ban ;			// �г� ���� ���� 30���� �׷��� ���� 
		// 1�г�2��=3, 2�г�1��=3
		// 1*100+2=103, 2*100+1=201			// �ߺ��� �����ϱ� ���� �г⿡ 100�� �����ֱ�
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj != null && obj instanceof Students) {
			Students tmp = (Students) obj;
			if (this.num == tmp.num)
				return true;
		}
		return false;
	}
	
	
	public String toString() {
		return "[�г� : " + grade + ", �̸� : " + name + ", �� : " + ban + ", ��ȣ : " +num + ", ���� : " +kor + ", ���� : " +math + ", ���� : " +eng + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
