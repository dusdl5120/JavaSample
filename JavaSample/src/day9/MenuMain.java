package day9;

import java.util.Scanner;

public class MenuMain {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		StuManager sm = new StuManager(10);		// �긦 �ݺ��� �ȿ� �־������ �������� ��ü�� �ʱ�ȭ�ϰ� �����ؾߵǼ� �ȵ�. �ݺ��� �ۿ��ٰ� �ѹ� �����.
		
		sm.insert("������", 1, 1, 1, 100, 100, 70);
		sm.insert("������", 3, 3, 2, 90, 80, 50);
		//sm.print(); 
		
		while(true) {
			
			printMenu();
			int menu = sc.nextInt();	// menu�� �츮�� ������ �޴��� �ǹ�. 1~4���׸�. 
			
			try {
				
				if (menu == 1) {
					
					System.out.println("�̸� : " );
					String name = sc.next();
					System.out.println("�г� : " );
					int grade = sc.nextInt();
					System.out.println("�� : " );
					int ban = sc.nextInt();
					System.out.println("��ȣ : " );
					int num = sc.nextInt();
					System.out.println("���� : " );
					int kor = sc.nextInt();
					System.out.println("���� : " );
					int eng = sc.nextInt();
					System.out.println("���� : " );
					int math = sc.nextInt();
					
					sm.insert(name, grade, ban, num, kor, eng, math);
				
				} else if (menu == 2) {
					
					System.out.println("�г� : " );
					int grade = sc.nextInt();
					System.out.println("�� : " );
					int ban = sc.nextInt();
					System.out.println("��ȣ : " );
					int num = sc.nextInt();
					System.out.println("�̸� : " );
					String name = sc.next();
					System.out.println("���� : " );
					int kor = sc.nextInt();
					System.out.println("���� : " );
					int eng = sc.nextInt();
					System.out.println("���� : " );
					int math = sc.nextInt();
					
					sm.modify(grade, ban, num, name, kor, eng, math);
					
				} else if (menu == 3) {
					
					sm.print();
					
				} else if (menu == 4) {
					
					System.out.println("----------------------");
					System.out.println("���α׷��� �����մϴ�.");
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
	 * 8. �޴��� ����ϴ� �޼ҵ�
	 * 	  �Ű����� �ʿ����
	 *    ����Ÿ�� �ʿ����
	 *    �޼ҵ�� : printMenu
     *
	 * 8-1. �Ʒ��� ���� ��� system.out.println�� �̿��Ͽ�  
	 * --- �޴� ---
	 * 1. �л����� �߰�
	 * 2. �л����� ����
	 * 3. �л����� ���
	 * 4. ����
	 * 
	 */
	
	public static void printMenu() {
		
		System.out.println("=======�޴�=======");
		System.out.println("1. �л������߰�");
		System.out.println("2. �л���������");
		System.out.println("3. �л��������");
		System.out.println("4. ����");
		System.out.println("==================");
		System.out.print("�޴��� �����ϼ��� : ");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
