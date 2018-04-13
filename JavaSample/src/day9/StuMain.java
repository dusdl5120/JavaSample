package day9;

public class StuMain {

	public static void main(String[] args) {
		
		/*
		 * 1. Student클래스의 객체 s를 new 연산자를 통해 생성할 때 생성자의 매개변수로 이름, 학년, 반, 번호, 국어, 영어, 수학을 넘겨준다
		 * 2. 객체 s를 통해 만들어놓은 print() 메소드를 호출하여 결과를 확인
		 * 3. 객체 s를 통해 만들어놓은 modifyStudent 메소드를 호출하여 정보를 수정하는데 매개변수로 이름, 학년, 반, 번호, 국어, 영어, 수학을 넘겨준다
		 * 3-1. 객체 s를 통해 만들어놓은 print() 메소드를 호출하여 결과를 확인
		 */

		Student s = new Student("홍길동", 2, 3, 10, 90.5, 87.6, 79.4);
		s.print();
		
		
		s.modifyStudent("홍길순", 5, 5, 5, 100, 59.4, 73.1);
		
		System.out.println();
		System.out.println("정보수정 후");
		System.out.println();
		s.print();
		
		/* 
		 * 4. StuManager클래스의 객체 sm를 생성하는데 학생의 정보를 10개 저장하도록 객체생성
		 * 5. 학생 한명의 정보를 객체 sm이 가지고 있는 insert 메소드를 이용하여 저장
		 * 6. 학생들의 정보를 객체sm이 가지고 있는 print 메소드를 이용하여 출력
		 */
		
		StuManager sm = new StuManager(10);		// 그냥 StuManager()만 하면 디폴트생성자를 호출하는거기 때문에 10개 정보를 저장하려면 옆에 숫자를 넣어줘야 다른 생성자를 호출한다.
		
		sm.insert("갑순이", 1, 1, 1, 100, 100, 70);
		sm.insert("갑돌이", 3, 3, 2, 90, 80, 50);
		sm.print(); 
		
		/* 
		 * 7. 1학년 1반 10번 검색했을 결과를 출력하는 코드 : 객체 sm의 searchIndex메소드와 sytem.out.println 메소드를 이용하여 해당하는 번지 출력
		 * 
		 */
		
		//System.out.println(sm.searchIndex(1, 1, 10));
		
		sm.modify(1, 1, 1, "수니", 10, 20, 30);
		sm.modify(3, 3, 2, "도리", 10, 20, 30);
		sm.print();
		
		
		
		
	}
	
	
		
		

}
