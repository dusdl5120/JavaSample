package day6;

public class Manager {

	public static final int STUDENT_MAX = 30;	// �Ŵ����� ������ �ִ� ������ �ִ� 30���ε� ��� ������ �� ����(final) ��� Ŭ������ ���� ������� ��ü���� �����ϴ� ��(static)
												// final�� �������� ���ó�� ����ض�. ����ϱ� �翬�� ���� ���ٲ���. final�� �������̴ϱ� ��� ���̻� ���� �ٲܼ� ���� ������. 
												// ����. �ڵ� �߰��� ���� ���� ����
	
	private Student[] stu;						// student �迭 ��� ������� ���� ����  . 
	private int cnt = 0; 						// ���� ����� �л�. ������ �ƹ��� ���� ����
	
	
	public Manager() {
		
		stu = new Student[STUDENT_MAX];			
		
	}
	
	public void addStudent(String name, int grade, int ban, int num, int kor, int eng, int math) {			// ��� �л��� �߰��ϴ� �޼ҵ�. �Ű������� ���� �Է¹ޱ�
		
		stu[cnt] = new Student(name, grade, ban, num, kor, eng, math);		// �л������� �߰�
		
		cnt++;				// �ϳ� �л� �߰������ϱ� �˷��ִ°�
	}
	
	public void printStudent() {  		// ���� �߰��� �л��� ����� �߰��� �ƴ��� ���
		
		for (Student s : stu) {			// stu �迭�� �ִ� �л����θ� �ϳ��� ���� �� ������� s �� �޾�, �޾Ƽ� ó����. 
			if (s != null)				// �л������� ������ �ƴٸ�
				s.printInfo(); 			// �л��� ������ ����  �ƴϸ� �л��� ������ ���ٸ� �ƹ��͵� ���� ����
			
		}
		
	}
	
	public boolean modifyStudent(int serGrade, int serBan, int serNum, String modName, int modKor, int modEng, int modMath) {	
		
		for (int i=0; i<cnt; i++) {
			if (stu[i].compareTo(serGrade, serBan, serNum)) {	
				
				stu[i].setName(modName);		
				stu[i].setKor(modKor);			
				stu[i].setEng(modEng);
				stu[i].setMath(modMath);
				return true;
			}
		}
		return false;
	}
	
	
	
	
	
	
	
	
	
	
	
}
