package day6;

import java.util.Scanner;

public class Score {

	public static void main(String[] args) {

		Student[] stu = new Student[30];	// ���� �л����� ������ ������ �迭�� ��Ƴ��
		
/*		stu[0] = new Student("ȫ�浿", 1, 2, 3);
		stu[0].printInfo();
		stu[0].compareTo(1,2,4);
		System.out.println(stu[0].compareTo(1,2,3));
		
		// �л��� ������ �߰����� �� �׶� ��ü�� �����ϴ°�
		for (int i=0; i<30; i++) {
			stu[i] = new Student();
		}		
		// �̷��� ��ü�� �������ָ� �Ǵµ� ������
		   �߰��� �л��� �����ϱ� ���� ��ü�� �������� ���ϴ°�
*/		
		
		int cnt = 0; 	// ���� �л��� ��
		int mode = 0;	// �޴��� ����� �����ϴ� ���� 0���� �ʱ�ȭ
		
		Scanner scan = new Scanner(System.in);
		
		do {							// ������ �޴��� �����ϰ� ����� ����ؾ��ϹǷ� �ѹ��� �����Ҽ� �ְ� : do while
			menu();						// 				
			mode = scan.nextInt();
			
			switch(mode) {
			case 1:			// �л����� �߰�
				
				// �Է¹��� ������ �ϴ� ���� ������ ����
				
				System.out.print("�л��� �̸��� �Է��϶� : ");
				String name = scan.next();							// next() : ���ڿ� ���� �������� ���ڿ��� ���� / nextLine() : ����ġ���������� ���ڿ��� ���� 
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
				
				// �Է¹��� ������ ������ �л� ������ �Է��ϰ� �л����� ����
				// cnt�� ó���� 0, �츮�� ����� �迭�� 0������ �̸�, �г�, ��, ��ȣ, ����, ����, ������ ������ �ϳ��� ��ü�� ���� ����־��
				// stu[cnt++] ==> stu[] = new ~ 
				// cnt++; ��� �ص� ���������� 
				// ������� �Ѹ��� �л������߰� �Ϸ�
				
				stu[cnt++] = new Student(name, grade, ban, num, kor, eng, math);
				
				
				break;
				
				
			case 2:			// �л����� ����
					
				// �ϴ� �л��� ������ �Է� . 
				
				System.out.print("�л��� �г��� �Է��϶� : ");
				int serGrade = scan.nextInt();
				System.out.print("�л��� ���� �Է��϶� : ");
				int serBan = scan.nextInt();
				System.out.print("�л��� ��ȣ�� �Է��϶� : ");
				int serNum = scan.nextInt();
				
				// 0�������� cnt-1���� (���系�� ������ ������ 3���� 0�������� 2���������ϱ� -1�� �������)
				
				for (int i=0; i<cnt; i++) {
					if (stu[i].compareTo(serGrade, serBan, serNum)) {	// ���������� ������ ���� ���� �Է��� ������ ���ؼ� ������ �Ʒ� �׸���� ������ �� �ְ� �ڵ�
						System.out.print("������ �л� �̸� : ");
						String modName = scan.next();
						System.out.print("������ �л� ���� : ");
						int modKor = scan.nextInt();
						System.out.print("������ �л� ���� : ");
						int modEng = scan.nextInt();
						System.out.print("������ �л� ���� : ");
						int modMath = scan.nextInt();
						
						stu[i].setName(modName);		// ���� �����ϴ� �κ�.
						stu[i].setKor(modKor);			
						stu[i].setEng(modEng);
						stu[i].setMath(modMath);
					}
				}
				
				break;
				
			
			case 3:			// �л����� ���
				
				for (int i=0; i<cnt; i++) {
					stu[i].printInfo();  		// 
					
				}
				
				/*
				 * for (Student s: stu) {
					if(s != null) {
						s.printInfo();				���ݴ� ���� for�� (���� ���ǹ��̶� ������)
					}
				}
				*/
				
				break;
				

			case 4:
				
				System.out.println("���α׷�����");
				break;
				
				
			default :
				System.out.println("���� �޴��Դϴ�.");	
				
			}
			
			
		} while (mode != 4) ;			// mod�� 4�� �ƴҰ�쿡�� ����
		// ���ѷ����� ����� ������ while(true)�� �ؾ���
		
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

