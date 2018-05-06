package test;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수를 입력하세요 : ");
		int su1 = sc.nextInt();
		
		System.out.print("연산자를 입력하세요 : ");
		char ch = sc.next().charAt(0);
		
		System.out.print("두번째 정수를 입력하세요 : ");
		int su2 = sc.nextInt();
		
		Cal cal = new Cal(su1, su2, ch);
		
		if (cal.cal()) {
			
			
			System.out.println("연산결과 : " + cal.getSu1() + cal.getCh() + cal.getSu2() + " = " + cal.getRes());
			
		}
		
		sc.close(); 
		
	}

}


class Cal {

	private int su1;
	private int su2;
	private char ch;
	private int res;
	

	public int getSu1() {
		return su1;
	}

	public void setSu1(int su1) {
		this.su1 = su1;
	}

	public int getSu2() {
		return su2;
	}

	public void setSu2(int su2) {
		this.su2 = su2;
	}

	public char getCh() {
		return ch;
	}

	public void setCh(char ch) {
		this.ch = ch;
	}

	public int getRes() {
		return res;
	}

	public void setRes(int res) {
		this.res = res;
	}

	public void setCal(int su1, int su2, char ch) {
																
		setSu1(su1);				
		setSu2(su2);
		setCh(ch);
		
	}
	
	public Cal() {
		
		
	}
	
	public Cal(int su1, int su2, char ch) {		
		
		setCal(su1, su2, ch); 				
		
	}
	
	
	public int sum() {
		
		return res = su1 + su2;
	}
	
	public int sub() {
		
		return res = su1 - su2;
	}
	
	public int mul() {
		
		return res = su1 * su2;
	}
	
	public int mod() {
		
		return res = su1 % su2;
	}
	
	public int div() {
		
		return res = su1 / su2;
	}
	
	public boolean cal() {
		
		switch(ch) {
		
		case '+' :
			sum();
			break;
			
		case '-' :
			sub();
			break;
			
		case '*' :
			mul();
			break;
			
		case '%' :
			mod();
			break;
			
		case '/' :
			div();
			break;
			
		default :
			return false;			
		}
		
		return true;				
	}
	
}
