package day6;

public class Manager {

	public static final int STUDENT_MAX = 30;	// 매니저가 가지고 있는 개수는 최대 30개인데 얘는 수정할 수 없고(final) 모든 클래스를 통해 만들어진 객체들을 공유하는 값(static)
												// final은 변수지만 상수처럼 취급해라. 상수니까 당연히 값을 못바꾸지. final이 마지막이니까 얘는 더이상 값을 바꿀수 없기 때문에. 
												// 고정. 코딩 중간에 값을 변경 못해
	
	private Student[] stu;						// student 배열 몇개를 만들건지 변수 선언  . 
	private int cnt = 0; 						// 현재 저장된 학생. 지금은 아무도 없는 상태
	
	
	public Manager() {
		
		stu = new Student[STUDENT_MAX];			
		
	}
	
	public void addStudent(String name, int grade, int ban, int num, int kor, int eng, int math) {			// 얘는 학생을 추가하는 메소드. 매개변수를 통해 입력받기
		
		stu[cnt] = new Student(name, grade, ban, num, kor, eng, math);		// 학생정보를 추가
		
		cnt++;				// 하나 학생 추가했으니까 알려주는거
	}
	
	public void printStudent() {  		// 내가 추가한 학생이 제대로 추가가 됐는지 출력
		
		for (Student s : stu) {			// stu 배열에 있는 학생전부를 하나씩 전부 다 끄집어내서 s 너 받아, 받아서 처리해. 
			if (s != null)				// 학생정보가 저장이 됐다면
				s.printInfo(); 			// 학생의 정보를 찍어라  아니면 학생의 정보가 없다면 아무것도 찍지 마라
			
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
