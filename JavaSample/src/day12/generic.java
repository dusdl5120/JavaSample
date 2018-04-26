package day12;

import java.util.Scanner;

public class generic {

	public static void main(String[] args) {

		int data = 0;
		
		for (int i=0; i<10000; i++) {
			
			System.out.println(i);
			
			if (i%100 == 0) {
				Scanner scan = new Scanner(System.in);
				data = scan.nextInt();
			}
		}
		
	}

}


