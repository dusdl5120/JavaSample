package day6;

import java.util.Scanner;

public class Score {

	public static void main(String[] args) {

		Student[] stu = new Student[30];	// ���� �л����� ������ ������ �迭�� ��Ƴ��
		
		int cnt = 0; 	
		int mode = 0;	
		
		Scanner scan = new Scanner(System.in);
		
		Manager manager = new Manager();		// manager ��ü����
		
		do {							
			menu();						 				
			mode = scan.nextInt();
			
			switch(mode) {
			case 1:			// �л����� �߰�
				
				System.out.print("�л��� �̸��� �Է��϶� : ");
				String name = scan.next();							
				System.out.print("�л��� �г��� �Է��϶� : ");
				int grade = scan.nextInt();
				System.out.print("�л��� ���� �Է��϶� : ");
				int ban = scan.nextInt(); 
				System.out.print("�л��� ��ȣ�� �Է��϶� : ");
				int num = scan.nextInt();
				System.out.print("�л��� ��� �Է��϶� : ");
				int kor = scan.nextInt();
				System.out.print("�л��� ��� �Է��϶� : ");
				int eng = scan.nextInt();
				System.out.print("�л��� ������ �Է��϶� : ");
				int math = scan.nextInt();
				
				manager.addStudent(name, grade, ban, num, kor, eng, math);
				
				break;
				
				
			case 2:			// �л����� ����
					
				System.out.print("�л��� �г��� �Է��϶� : ");
				int serGrade = scan.nextInt();
				System.out.print("�л��� ���� �Է��϶� : ");
				int serBan = scan.nextInt();
				System.out.print("�л��� ��ȣ�� �Է��϶� : ");
				int serNum = scan.nextInt();
				
				System.out.print("������ �л� �̸� : ");
				String modName = scan.next();
				System.out.print("������ �л� ���� : ");
				int modKor = scan.nextInt();
				System.out.print("������ �л� ���� : ");
				int modEng = scan.nextInt();
				System.out.print("������ �л� ���� : ");
				int modMath = scan.nextInt();
				
				manager.modifyStudent(serGrade, serBan, serNum, modName, modKor, modEng, modMath);
				
				break;
				
			
			case 3:								// �л����� ���
				
				manager.printStudent();			// manager�� ȣ��
				
				break;
				

			case 4:
				
				System.out.println("���α׷�����");
				break;
				
				
			default :
				System.out.println("���� �޴��Դϴ�.");	
				
			}
			
			
		} while (mode != 4) ;			
		
		scan.close();
		
	}
	
	
	public static void menu() {
		System.out.println("---------�޴�---------");
		System.out.println("1. �л����� �߰�");
		System.out.println("2. �л����� ����");
		System.out.println("3. �л����� ���");
		System.out.println("4. ����");
		System.out.println("�޴��� �����ϼ��� : ");
	}
	

} 

