package test;

import java.util.HashMap;
import java.util.Scanner;

public class Account {

	public static void main(String[] args) {

		HashMap<String, String> map = new HashMap<String, String>();

		map.put("hello", "1212");
		map.put("jQuery", "1331");
		map.put("java", "1212");

		Scanner scan = new Scanner(System.in);

		while (true) {
			
			System.out.println("ID�� ��й�ȣ�� �Է��ϼ���. ");
			System.out.print("ID : ");
			String id = scan.nextLine().trim();

			System.out.print("��й�ȣ : ");
			String password = scan.nextLine().trim();
			System.out.println();

			if (!map.containsKey(id)) {
				System.out.println("�Է��Ͻ� ID�� �������� �ʽ��ϴ�. �ٽ� �Է��� �ּ���.");
				continue; 
				
			} else {
				
				if(!(map.get(id)).equals(password)) {
					System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�. �ٽ��Է����ּ���.");
					
				} else {
					System.out.println("ID�� ��й�ȣ�� ��ġ�մϴ�.");
					break;
				}
			}

		}
		
		scan.close();

	}
}