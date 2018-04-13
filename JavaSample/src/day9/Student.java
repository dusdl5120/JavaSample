package day9;

public class Student {

	/*
	 * 1. 멤버변수설정
	 * 1-1. 이름 : String
	 * 1-2. 학년 : int
	 * 1-2. 반 : int
	 * 1-2. 번호 : int
	 * 1-2. 국어 : double
	 * 1-2. 영어 : double
	 * 1-2. 수학 : double
	 * 
	 */
	
	private String name;
	private int grade;
	private int ban;
	private int num;
	private double kor;
	private double eng;
	private double math;
	
	
	/* 2. getter와 setter 생성 */
	
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
	 * 3. 생성자
	 * 3-1. 디폴트생성자 만들기
	 * 3-2. 생성자 오버로딩을 이용하여 매개변수가 이름, 학년, 반, 번호, 국어, 영어, 수학이 주어졌을 때 각 멤버 변수에 해당하는 매개변수 값들을 저장
	 * 3-3. 생성자 오버로딩을 이용하여 매개변수가 이름, 학년, 반, 번호가 주어졌을 때 각 멤버변수에 해당하는 매개변수 값을 저장하는데 3-2에서 생성한 생성자를 이용할 수 있다
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
	 * 4. 메소드생성
	 * 4-1. 출력메소드 - 학생정보를 출력하는 메소드 
	 *      : 필요한 매개변수는 없다. 리턴타입은 없다. 메소드명은 print
	 * 4-2. System.out.println을 이용하여 학생정보를 출력
	 * 4-3. 정보수정메소드 : 학생정보를 수정한다.
	 *                       필요한 매개변수는 이름, 학년, 반, 번호, 국어, 영어, 수학
	 *      리턴타입은 없다.
	 *      메소드명은 modifyStudent
	 * 4-4. setter(set메소드)를 통해 각 매개변수 값들로 변경 
	 * 
	 *  
	 */
	
	public void print() {		// 걍 하나씩 출력하면 됨
		
		System.out.println("학생정보출력");
		System.out.println("==============");
		System.out.println("이름 : " + name);
		System.out.println("학년 : " + grade);
		System.out.println("반 : " + ban);
		System.out.println("번호 : " + num);
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + math);
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
	
	
	public Student clone() {		// 다른 클래스에서 원본을 넘겨주는데 그걸 방지하기 위해 복사본을 만들어서 이걸 갖다쓰라는 의미
									// 원본과 값은 똑같음. 쉽게 말하면 제본. 원본을 빌려주는게 아니라 그내용과 똑같은 사본을 떠서 그 제본을 주는거
		                           	// 이 메소드를 갖다쓰면 다른사람이 막 수정하고 그래도 손상되도 상관 없기 때문에 주로 이렇게 사용
		
		// 밑에 두개는 같은거임. 편한걸로 쓰면 됨
		Student tmp = new Student(this.getName(), this.getGrade(), this.getBan(), this.getNum(), this.getKor(), this.getEng(), this.getMath());
		Student tmp2 = new Student(name, grade, ban, num, kor, eng, math);
		
		return null;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
