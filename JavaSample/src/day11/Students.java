package day11;

public class Students {

	
	/*
	 *	1. 멤버변수 : 학년, 반, 번호, 이름, 국어, 영어, 수학
	 *	
	 *  2. getter /setter
	 *     getter는 이전과 동일하게
	 *	   setter는 chaning기법 사용
	 *	
	 *  3. 생성자 : 생성자는 자유롭게
	 *  
	 *  4. 멤버 메소드 /  일반메소드
	 *     부모클래스의 메소드 오버라이딩
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
		
		// return 1;						// 그룹을 학교 1개로 생성
		// return grade; 					// 학년을 통해 3개의 그릅울 생성
		return grade*100 + ban ;			// 학년 반을 통해 30개의 그룹을 생성 
		// 1학년2반=3, 2학년1반=3
		// 1*100+2=103, 2*100+1=201			// 중복을 방지하기 위해 학년에 100을 곱해주기
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
		return "[학년 : " + grade + ", 이름 : " + name + ", 반 : " + ban + ", 번호 : " +num + ", 국어 : " +kor + ", 수학 : " +math + ", 영어 : " +eng + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
