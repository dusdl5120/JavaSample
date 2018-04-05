package day6;


class Student {
	
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
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
	// ����������� ���� �ʱ�ȭ : ������
	
	public Student() {
		
		// �⺻������ �ϳ� ������ְ�

	}

	public Student(String name, int grade, int ban, int num) {       // �������� �Ű������� �̸�, �г�, ��
		
		this(name, grade, ban, num, 0, 0, 0);		
		
		// this�� �Ű����� ������� ������ �� �Ⱦ��� �ؿ� �ִ� �����ڸ� �̿��ؼ� ���ٷ� ����ϴ� �����
		// ���⿡ ���� �Ű������� ������ �⺻������ ����
		
	}
	
	public Student(String name, int grade, int ban, int num, int kor, int eng, int math) {
		
		// �������� �Ű������� �̸�, �г�, ��, ��ȣ, �����, �����, ���м����� �Է¹޴´�
		
		this.name = name;
		this.grade = grade;
		this.ban = ban;
		this.num = num;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
		// �Էµ� �������� ������ ������ �� ���� �־��ش�
	}
	
	public boolean compareTo(Student s) {
		
		// ��ü�� ���͵� �� ������ �Ѱ��ָ� �Ȱ��� ����ص� �ȴ�.
		
		return compareTo (s.grade, s.ban, s.num);
		
	}
	
	public boolean compareTo(int grade, int ban, int num) {
	
		// �̸��� ������ �ٸ��ٰ� �ص� �г�� ��, ��ȣ�� ���� ���� ��ü�� ����Ѵ�
		
		if (this.grade == grade && this.ban == ban && this.num == num) {
			return true;
		}
		return false;
		
	}
	
	public void printInfo() {		// �л��� ������ ���	
		
		System.out.println("�̸� : " + name);
		System.out.println("�г� : " + grade);
		System.out.println("�� : " + ban);
		System.out.println("��ȣ : " + num);
		System.out.println("���� : " + kor);
		System.out.println("���� : " + eng);
		System.out.println("���� : " + math);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}