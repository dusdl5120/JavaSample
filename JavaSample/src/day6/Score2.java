package day6;

import java.util.Scanner;

public class Score2 {

	public static void main(String[] args) {

		Student[] stu = new Student[30];	// 내가 학생들의 정보를 관리할 배열만 잡아논거
		
/*		stu[0] = new Student("홍길동", 1, 2, 3);
		stu[0].printInfo();
		stu[0].compareTo(1,2,4);
		System.out.println(stu[0].compareTo(1,2,3));
		
		// 학생의 성적을 추가했을 때 그때 객체를 생성하는것
		for (int i=0; i<30; i++) {
			stu[i] = new Student();
		}		
		// 이렇게 객체를 생성해주면 되는데 지금은
		   추가된 학생이 없으니까 구지 객체를 생성하지 안하는것
*/		
		
		int cnt = 0; 	// 현재 학생의 수
		int mode = 0;	// 메뉴이 기능을 선택하는 값을 0으로 초기화
		
		Scanner scan = new Scanner(System.in);
		
		do {							// 무조건 메뉴를 선택하고 기능을 출력해야하므로 한번은 실행할수 있게 : do while
			menu();						// 				
			mode = scan.nextInt();
			
			switch(mode) {
			case 1:			// 학생정보 추가
				
				// 입력받은 값들을 일단 각각 변수에 저장
				
				System.out.print("학생의 이름을 입력하라 : ");
				String name = scan.next();							// next() : 문자와 공백 전까지의 문자열만 저장 / nextLine() : 엔터치기전까지의 문자열을 저장 
				System.out.print("학생의 학년을 입력하라 : ");
				int grade = scan.nextInt();
				System.out.print("학생의 반을 입력하라 : ");
				int ban = scan.nextInt(); 
				System.out.print("학생의 번호를 입력하라 : ");
				int num = scan.nextInt();
				System.out.print("학생의 국어를 입력하라 : ");
				int kor = scan.nextInt();
				System.out.print("학생의 영어를 입력하라 : ");
				int eng = scan.nextInt();
				System.out.print("학생의 수학을 입력하라 : ");
				int math = scan.nextInt();
				
				// 입력받은 변수의 값들을 학생 정보에 입력하고 학생수를 증가
				// cnt가 처음엔 0, 우리가 사용할 배열의 0번지에 이름, 학년, 반, 번호, 국어, 영어, 수학의 정보를 하나의 객체를 만들어서 집어넣어라
				// stu[cnt++] ==> stu[] = new ~ 
				// cnt++; 라고 해도 같은문장임 
				// 여기까지 한명의 학생정보추가 완료
				
				stu[cnt++] = new Student(name, grade, ban, num, kor, eng, math);
				
				
				break;
				
				
			case 2:			// 학생정보 수정
					
				// 일단 학생의 정보를 입력 . 
				
				System.out.print("학생의 학년을 입력하라 : ");
				int serGrade = scan.nextInt();
				System.out.print("학생의 반을 입력하라 : ");
				int serBan = scan.nextInt();
				System.out.print("학생의 번호를 입력하라 : ");
				int serNum = scan.nextInt();
				
				// 0번지부터 cnt-1까지 (현재내가 저장한 정보가 3개면 0번지부터 2번지까지니까 -1을 해줘야함)
				
				for (int i=0; i<cnt; i++) {
					if (stu[i].compareTo(serGrade, serBan, serNum)) {	// 전에저장한 정보와 내가 지금 입력한 정보가 비교해서 같으면 아래 항목들을 수정할 수 있게 코딩
						System.out.print("수정할 학생 이름 : ");
						String modName = scan.next();
						System.out.print("수정할 학생 국어 : ");
						int modKor = scan.nextInt();
						System.out.print("수정할 학생 영어 : ");
						int modEng = scan.nextInt();
						System.out.print("수정할 학생 수학 : ");
						int modMath = scan.nextInt();
						
						stu[i].setName(modName);		// 값을 수정하는 부분.
						stu[i].setKor(modKor);			
						stu[i].setEng(modEng);
						stu[i].setMath(modMath);
					}
				}
				
				break;
				
			
			case 3:			// 학생정보 출력
				
				for (int i=0; i<cnt; i++) {
					stu[i].printInfo();  		// 
					
				}
				
				/*
				 * for (Student s: stu) {
					if(s != null) {
						s.printInfo();				조금더 향상된 for문 (위의 조건문이랑 같은거)
					}
				}
				*/
				
				break;
				

			case 4:
				
				System.out.println("프로그램종료");
				break;
				
				
			default :
				System.out.println("없는 메뉴입니다.");	
				
			}
			
			
		} while (mode != 4) ;			// mod가 4가 아닐경우에만 종료
										// 무한루프로 만들고 싶으면 while(true)로 해야함
		
		scan.close();
		
	}
	
	
	public static void menu() {
		System.out.println("---------메뉴---------");
		System.out.println("1. 학생정보 추가");
		System.out.println("2. 학생정보 수정");
		System.out.println("3. 학생정보 출력");
		System.out.println("4. 종료");
		System.out.println("메뉴를 선택하세요 : ");
	}
	

} 

