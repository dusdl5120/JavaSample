package day6;

import java.util.Scanner;

public class Score {

	public static void main(String[] args) {

		Student[] stu = new Student[30];	// 내가 학생들의 정보를 관리할 배열만 잡아논거
		
		int cnt = 0; 	
		int mode = 0;	
		
		Scanner scan = new Scanner(System.in);
		
		Manager manager = new Manager();		// manager 객체생성
		
		do {							
			menu();						 				
			mode = scan.nextInt();
			
			switch(mode) {
			case 1:			// 학생정보 추가
				
				System.out.print("학생의 이름을 입력하라 : ");
				String name = scan.next();							
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
				
				manager.addStudent(name, grade, ban, num, kor, eng, math);
				
				break;
				
				
			case 2:			// 학생정보 수정
					
				System.out.print("학생의 학년을 입력하라 : ");
				int serGrade = scan.nextInt();
				System.out.print("학생의 반을 입력하라 : ");
				int serBan = scan.nextInt();
				System.out.print("학생의 번호를 입력하라 : ");
				int serNum = scan.nextInt();
				
				System.out.print("수정할 학생 이름 : ");
				String modName = scan.next();
				System.out.print("수정할 학생 국어 : ");
				int modKor = scan.nextInt();
				System.out.print("수정할 학생 영어 : ");
				int modEng = scan.nextInt();
				System.out.print("수정할 학생 수학 : ");
				int modMath = scan.nextInt();
				
				manager.modifyStudent(serGrade, serBan, serNum, modName, modKor, modEng, modMath);
				
				break;
				
			
			case 3:								// 학생정보 출력
				
				manager.printStudent();			// manager만 호출
				
				break;
				

			case 4:
				
				System.out.println("프로그램종료");
				break;
				
				
			default :
				System.out.println("없는 메뉴입니다.");	
				
			}
			
			
		} while (mode != 4) ;			
		
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

