package day12;

public class Threads5 {

	public static void main(String[] args) {
		
		/*
		 * main스레드를 포함하여 2개의 스레드를 이용하여 입출금하는 코드를 작성
		 * 마지막 소스를 참고. main스레드에서는 100원씩 무한대로 입금하고
		 * 다른 스레드에서는 다이얼로그에서 입력한 금액으로 출금
		 *  
		 */
		
		
   }
}

class Account2 {
	
	int balance;
	synchronized void withdraw(int money) {
		
		while (balance < money) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		balance -= money;
		System.out.printf("출금액 : %5d원, 잔액 : %5d원, " , money , balance);
	}
	
}