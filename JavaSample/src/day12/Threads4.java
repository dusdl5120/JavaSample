package day12;

public class Threads4 {

	public static void main(String[] args) {
		
		Account acc = new Account();
		Thread th = new Thread(new MyThread7(acc));
		th.start();
		
		while(true) {
			acc.deposit(100);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
   }
}

class Account {
	
	int balance=0;
	synchronized void withdraw(int money) {				// 예금이 입금될 떄 까지 기다리는 메소드
			
			while (balance < money) {
				
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			balance -= money;
			System.out.println("출금액 : "+ money + ", 잔액 : " + balance);
		}
		
		synchronized void deposit(int money) {
			balance += money;
			System.out.println("입금액 : "+ money + ", 잔액 : " + balance);
			notify();
		}
}

class MyThread7 implements Runnable {

	Account acc;
	public MyThread7(Account acc) {
		this.acc = acc;
	}
	
	@Override
	public void run() {
		
		while (true) {
			acc.withdraw(1000);
			
			try {
				Thread.sleep(1000);						// 0.5초 쉬기
			} catch (InterruptedException e) {
				e.printStackTrace();
			}				
		}
	}

}