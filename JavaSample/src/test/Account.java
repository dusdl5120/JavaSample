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
			
			System.out.println("ID와 비밀번호를 입력하세요. ");
			System.out.print("ID : ");
			String id = scan.nextLine().trim();

			System.out.print("비밀번호 : ");
			String password = scan.nextLine().trim();
			System.out.println();

			if (!map.containsKey(id)) {
				System.out.println("입력하신 ID는 존재하지 않습니다. 다시 입력해 주세요.");
				continue; 
				
			} else {
				
				if(!(map.get(id)).equals(password)) {
					System.out.println("비밀번호가 일치하지 않습니다. 다시입력해주세요.");
					
				} else {
					System.out.println("ID와 비밀번호가 일치합니다.");
					break;
				}
			}

		}
		
		scan.close();

	}
}