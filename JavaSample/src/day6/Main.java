package day6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double su1 = sc.nextInt();
		char ch = sc.next().charAt(0);
		double su2 = sc.nextInt();
		
		Cal cal = new Cal(su1, su2, ch);
		
		if (cal.cal()) {
			
			System.out.println("" + cal.getSu1() + cal.getCh() + cal.getSu2() + " = " + cal.getRes());
			
		}else {
			
			System.out.println("계산에 이상이 있음");
		}
		
		sc.close(); 

	}

}
