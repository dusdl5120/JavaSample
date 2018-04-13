package day9;

import java.util.Scanner;

public class MenuMain {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		StuManager sm = new StuManager(10);		// 얘를 반복문 안에 넣어놓으면 돌때마다 객체를 초기화하고 생성해야되서 안됨. 반복문 밖에다가 한번 해줘야.
		
		sm.insert("갑순이", 1, 1, 1, 100, 100, 70);
		sm.insert("갑돌이", 3, 3, 2, 90, 80, 50);
		//sm.print(); 
		
		while(true) {
			
			printMenu();
			int menu = sc.nextInt();	// menu가 우리가 선택한 메뉴를 의미. 1~4번항목. 
			
			try {
				
				if (menu == 1) {
					
					System.out.println("이름 : " );
					String name = sc.next();
					System.out.println("학년 : " );
					int grade = sc.nextInt();
					System.out.println("반 : " );
					int ban = sc.nextInt();
					System.out.println("번호 : " );
					int num = sc.nextInt();
					System.out.println("국어 : " );
					int kor = sc.nextInt();
					System.out.println("영어 : " );
					int eng = sc.nextInt();
					System.out.println("수학 : " );
					int math = sc.nextInt();
					
					sm.insert(name, grade, ban, num, kor, eng, math);
				
				} else if (menu == 2) {
					
					System.out.println("학년 : " );
					int grade = sc.nextInt();
					System.out.println("반 : " );
					int ban = sc.nextInt();
					System.out.println("번호 : " );
					int num = sc.nextInt();
					System.out.println("이름 : " );
					String name = sc.next();
					System.out.println("국어 : " );
					int kor = sc.nextInt();
					System.out.println("영어 : " );
					int eng = sc.nextInt();
					System.out.println("수학 : " );
					int math = sc.nextInt();
					
					sm.modify(grade, ban, num, name, kor, eng, math);
					
				} else if (menu == 3) {
					
					sm.print();
					
				} else if (menu == 4) {
					
					System.out.println("----------------------");
					System.out.println("프로그램을 종료합니다.");
					System.out.println("----------------------");
				
					break;
				}
			
			} catch (Exception e) {
				
				System.out.println(e.getMessage());
			}
		}
		
		sc.close();		
		
	}
	
	
	/* 
	 * 8. 메뉴를 출력하는 메소드
	 * 	  매개변수 필요없음
	 *    리턴타입 필요없다
	 *    메소드명 : printMenu
     *
	 * 8-1. 아래와 같이 출력 system.out.println을 이용하여  
	 * --- 메뉴 ---
	 * 1. 학생정보 추가
	 * 2. 학생정보 수정
	 * 3. 학생정보 출력
	 * 4. 종료
	 * 
	 */
	
	public static void printMenu() {
		
		System.out.println("=======메뉴=======");
		System.out.println("1. 학생정보추가");
		System.out.println("2. 학생정보수정");
		System.out.println("3. 학생정보출력");
		System.out.println("4. 종료");
		System.out.println("==================");
		System.out.print("메뉴를 선택하세요 : ");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
