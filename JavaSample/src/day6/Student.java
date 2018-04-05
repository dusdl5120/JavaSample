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
	
	// 멤버변수들의 값을 초기화 : 생성자
	
	public Student() {
		
		// 기본생성자 하나 만들어주고

	}

	public Student(String name, int grade, int ban, int num) {       // 생성자의 매개변수로 이름, 학년, 반
		
		this(name, grade, ban, num, 0, 0, 0);		
		
		// this를 매개변수 개수대로 일일이 다 안쓰고 밑에 있는 생성자를 이용해서 한줄로 요약하는 방법임
		// 여기에 없는 매개변수는 값들을 기본값으로 세팅
		
	}
	
	public Student(String name, int grade, int ban, int num, int kor, int eng, int math) {
		
		// 생성자의 매개변수로 이름, 학년, 반, 번호, 국어성적, 영어성적, 수학성적을 입력받는다
		
		this.name = name;
		this.grade = grade;
		this.ban = ban;
		this.num = num;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
		// 입력된 변수들을 각각의 변수에 다 값을 넣어준다
	}
	
	public boolean compareTo(Student s) {
		
		// 객체가 들어와도 이 정보만 넘겨주면 똑같이 사용해도 된다.
		
		return compareTo (s.grade, s.ban, s.num);
		
	}
	
	public boolean compareTo(int grade, int ban, int num) {
	
		// 이름과 성적이 다르다고 해도 학년과 반, 번호가 같은 같은 객체로 취급한다
		
		if (this.grade == grade && this.ban == ban && this.num == num) {
			return true;
		}
		return false;
		
	}
	
	public void printInfo() {		// 학생의 정보를 출력	
		
		System.out.println("이름 : " + name);
		System.out.println("학년 : " + grade);
		System.out.println("반 : " + ban);
		System.out.println("번호 : " + num);
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + math);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}