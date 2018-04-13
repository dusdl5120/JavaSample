package day9;

public class Student {

	/*
	 * 1. �����������
	 * 1-1. �̸� : String
	 * 1-2. �г� : int
	 * 1-2. �� : int
	 * 1-2. ��ȣ : int
	 * 1-2. ���� : double
	 * 1-2. ���� : double
	 * 1-2. ���� : double
	 * 
	 */
	
	private String name;
	private int grade;
	private int ban;
	private int num;
	private double kor;
	private double eng;
	private double math;
	
	
	/* 2. getter�� setter ���� */
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getBan() {
		return ban;
	}
	public void setBan(int ban) {
		this.ban = ban;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public double getKor() {
		return kor;
	}
	public void setKor(double kor) {
		this.kor = kor;
	}
	public double getEng() {
		return eng;
	}
	public void setEng(double eng) {
		this.eng = eng;
	}
	public double getMath() {
		return math;
	}
	public void setMath(double math) {
		this.math = math;
	}
	
	
	/* 
	 * 3. ������
	 * 3-1. ����Ʈ������ �����
	 * 3-2. ������ �����ε��� �̿��Ͽ� �Ű������� �̸�, �г�, ��, ��ȣ, ����, ����, ������ �־����� �� �� ��� ������ �ش��ϴ� �Ű����� ������ ����
	 * 3-3. ������ �����ε��� �̿��Ͽ� �Ű������� �̸�, �г�, ��, ��ȣ�� �־����� �� �� ��������� �ش��ϴ� �Ű����� ���� �����ϴµ� 3-2���� ������ �����ڸ� �̿��� �� �ִ�
	 *  
	 */
	
	public Student() { }
	
	public Student(String name, int grade, int ban, int num, double kor, double eng, double math) {
		
		this.name = name;
		this.grade = grade;
		this.ban = ban;
		this.num = num;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
		
	}
	
	public Student(String name, int grade, int ban, int num) {
		
		this(name, grade, ban, num, 0, 0, 0);
	}
	
	
	/* 
	 * 4. �޼ҵ����
	 * 4-1. ��¸޼ҵ� - �л������� ����ϴ� �޼ҵ� 
	 *      : �ʿ��� �Ű������� ����. ����Ÿ���� ����. �޼ҵ���� print
	 * 4-2. System.out.println�� �̿��Ͽ� �л������� ���
	 * 4-3. ���������޼ҵ� : �л������� �����Ѵ�.
	 *                       �ʿ��� �Ű������� �̸�, �г�, ��, ��ȣ, ����, ����, ����
	 *      ����Ÿ���� ����.
	 *      �޼ҵ���� modifyStudent
	 * 4-4. setter(set�޼ҵ�)�� ���� �� �Ű����� ����� ���� 
	 * 
	 *  
	 */
	
	public void print() {		// �� �ϳ��� ����ϸ� ��
		
		System.out.println("�л��������");
		System.out.println("==============");
		System.out.println("�̸� : " + name);
		System.out.println("�г� : " + grade);
		System.out.println("�� : " + ban);
		System.out.println("��ȣ : " + num);
		System.out.println("���� : " + kor);
		System.out.println("���� : " + eng);
		System.out.println("���� : " + math);
		System.out.println("---------------"); 
		
	}
	
	public void modifyStudent(String name, int grade, int ban, int num, double kor, double eng, double math) {
		
		this.setName(name);
		this.setGrade(grade);
		this.setBan(ban);
		this.setNum(num);
		this.setKor(kor);
		this.setEng(eng);
		this.setMath(math);
		
	}
	
	
	public Student clone() {		// �ٸ� Ŭ�������� ������ �Ѱ��ִµ� �װ� �����ϱ� ���� ���纻�� ���� �̰� ���پ���� �ǹ�
									// ������ ���� �Ȱ���. ���� ���ϸ� ����. ������ �����ִ°� �ƴ϶� �׳���� �Ȱ��� �纻�� ���� �� ������ �ִ°�
		                           	// �� �޼ҵ带 ���پ��� �ٸ������ �� �����ϰ� �׷��� �ջ�ǵ� ��� ���� ������ �ַ� �̷��� ���
		
		// �ؿ� �ΰ��� ��������. ���Ѱɷ� ���� ��
		Student tmp = new Student(this.getName(), this.getGrade(), this.getBan(), this.getNum(), this.getKor(), this.getEng(), this.getMath());
		Student tmp2 = new Student(name, grade, ban, num, kor, eng, math);
		
		return null;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
