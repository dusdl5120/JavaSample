package day9;

public class StuManager {

	/*
	 * 1. 필요한 멤버변수
	 * 1-1. 학생클래스의 배열
	 * 1-2. 학생의 최대 수를 저장하는 변수 : int
	 * 1-3. 현재 저장된 학생의 수 : int
	 * 
	 */
	
	private Student[] std;
	private int max;
	private int cnt;
	
	
	/*  2. getter와 setter 생성 */
	
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
	
	
	/* 3. 생성자
	 * 3-1. 디폴트생성자 : 멤버객체 std의 배열을 new 연산자를 통해 생성한다. 이때 생성되는 배열의 개수(최대)는 30개로 한다
	 * 3-2. 생성자오버로딩 : 매개변수로 생성할 배열의 크기를 넘겨받아 해당크기를 이용하여 배열을 생성한다
	 */
	
	public StuManager() {
		
		max = 30;
		std = new Student[max];
		
		//this(30);
	}
	
	public StuManager(int size) throws RuntimeException {
		 
		if (size <= 0) {
			throw new RuntimeException("배열의 크기 0 또는 음수 불가");
		}
		
		max = size;
		std = new Student[size];
		
	}
	
	/* 4. 필요한 메소드
	 * 4-1. 학생정보를 추가하는 메소드
	 *      필요한 매개변수 : 학생정보들 (이름, 학년, 반, 번호, 국어, 영어, 수학)
	 *      리턴타입 : void
	 * 4-2. 객체를 입력받은 매개변수들을 통해 생성해야하는데 생성하는 배열의 번지는 nowCnt에 저장
	 * 4-3. 현재 저장된 학생수(nowCnt)를 증가
	 */
	
	public void insert(String name, int grade, int ban, int num, double kor, double eng, double math) {
		
		if (cnt == max) {
			throw new RuntimeException("더이상 저장할 수 없다.");
		}
		
		// 검색을 해서 매개변수의 학년, 반, 번호와 정보가 일치하는 객체가 있으면 학생정보 추가를 하지 않고 예외처리를 함
		
		if (searchIndex(grade, ban, num) != -1) { 		// -1이라는 것은 내가 해당하는 객체를 못찾았을 경우니까. -1이 아닌거는 내가 해당하는 객체를 찾았을때를 의미함
			throw new RuntimeException("이미 해당하는 학생의 정보가 있다.");
		}
		
		std[cnt++] = new Student(name, grade, ban, num, kor, eng, math);		
	}
	
	
	/* 
	 * 4-4. 학생들의 정보를 출력하는 메소드
	 *      필요한 매개변수 : 없다
	 *      리턴타입 : void
	 * 4-5. 메소드명 : print
	 * 4-6. 반복문을 이용해서 학생 정보가 저장되어 있는 배열 std를 0번지부터 시작해서 현재저장된 학생수 cnt-1까지 정보출력하는데
	 *      학생정보를 출력할 때 Student클래스의 멤버메소드 print메소드를 이용
	 */
	
	public void print() {
		
		for (int i=0; i<cnt; i++) {

			std[i].print();
		}
	}
	
	/* 
	 * 5. 학생정보검색메소드
	 * 	  필요한 매개변수 : 학년, 반, 번호
	 *    리턴타입 : 번지(int)
	 *    메소드명 : searchIndex
	 * 5-1. 반복을 0번지부터 cnt까지 반복
	 * 5-2. 반복문에는 매개변수 학년, 반, 번호와 값이 일치하는 객체가 있는지 조건문을 통해 확인
	 * 5-3. 확인하여 해당객체를 찾았으면 해당하는 번지를 리턴하고 전부 검색했는데 못찾으면 -1을 리턴한다
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
	 * 6. 학생정보 수정메소드
	 * 	  매개변수 : (검색을 위한) 학년, 반, 번호, 
	 *               (수정을 위한) 이름, 국어, 영어, 수학
	 *    리턴타입 : 학생객체 (Student)
	 *    메소드명 : modify
	 * 6-1. 매개변수 학년, 반, 번호를 통해 학생 배열을 검색하여 해당학생의 정보가 있으면 해당 번지의 학생의 정보를 매개변수 이름, 국어, 영어, 수학으로 수정한다
	 * 6-2. 수정한 후 해당 객체를 리턴한다
	 * 6-3. 해당학생의 정보가 없으면 null값을 리턴
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
