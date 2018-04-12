package day8;

import java.util.Scanner;

public class LottoMain {

	public static void main(String[] args) {
		
		int[] arr = new int[6];
		int[] input = new int[7];
		
		Lotto lo = new Lotto();
		
		char isContinue = 'y';
		Scanner sc = new Scanner(System.in);
		
		while (isContinue == 'y' || isContinue == 'Y') { 
		
			try {
				
				lo.createLottoArr(arr, 1, 45);
				lo.createLottoArr(input, 1, 45);
				int tmp = lo.rank(input, arr);
				
				lo.printArr(arr); 
				lo.printArr(input);
				System.out.println(tmp);
				
			} catch (Exception e) {
				
				System.out.println(e.getMessage());
				
			}
			System.out.println("더하시겠습니까? (y/n) : ");
			isContinue = sc.next().charAt(0);		// 문자하나 받아서 해당문자를 처리
		}
	}
}
