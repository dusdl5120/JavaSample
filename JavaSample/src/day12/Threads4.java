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
	synchronized void withdraw(int money) {				// ������ �Աݵ� �� ���� ��ٸ��� �޼ҵ�
			
			while (balance < money) {
				
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			balance -= money;
			System.out.println("��ݾ� : "+ money + ", �ܾ� : " + balance);
		}
		
		synchronized void deposit(int money) {
			balance += money;
			System.out.println("�Աݾ� : "+ money + ", �ܾ� : " + balance);
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
				Thread.sleep(1000);						// 0.5�� ����
			} catch (InterruptedException e) {
				e.printStackTrace();
			}				
		}
	}

}