package day12;

public class Threads {
	// static boolean data = false; // ���ڸ� ���� ����
	static int balance = 3000; // ���ڸ� ���� ����

	public static void main(String[] args) {

		Runnable r = new MyTread7();
		Thread th1 = new Thread(r);
		Thread th2 = new Thread(r);

		th1.start();
		th2.start();

		/*
		 * Thread m5 = new Thread(new MyTread5()); m5.start();
		 * 
		 * for (int i = 0; i <= 5; i++) { try { m5.join(); } catch (InterruptedException
		 * e) { e.printStackTrace(); } } System.out.println("������ �ٽý���"); m5.start();
		 * 
		 * m5 = new Thread(new MyTread5()); try { m5.join(); } catch
		 * (InterruptedException e) { e.printStackTrace(); }
		 */

		/*
		 * MyTread m1 = new MyTread(); m1.start(); // start�� �Ѵٽ��� // run�� run ���� ���ϰ�
		 * main ����
		 * 
		 * String data = JOptionPane.showInputDialog("���ڿ��Է�");
		 * System.out.println("�Է¹������ڿ� ��" + data); // �����Է� �� �� �ְ� �ϴ� ��
		 */

		/*
		 * Thread m2 = new Thread(new MyTread2()); m2.setDaemon(true); m2.start();
		 * 
		 * for(int i=0; i<20; i++) { System.out.println(i); try { Thread.sleep(1000); }
		 * catch (InterruptedException e) { e.printStackTrace(); }
		 * 
		 * if (i == 9) { data = true; } }
		 */

	}

}

class MyTread extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				// if (Threads.data.compareTo("q") == 0 ) // q�̸� �����
				// break;
				System.out.println(i);
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

/*
 * class MyTread2 implements Runnable {
 * 
 * @Override public void run() {
 * 
 * while (true) { try { Thread.sleep(3000); } catch (InterruptedException e) {
 * e.printStackTrace(); }
 * 
 * if (Threads.data == true) { System.out.println("������ �ڵ������մϴ�."); } } }
 * 
 * }
 * 
 * class MyTread5 implements Runnable {
 * 
 * @Override public void run() { for (int i = 1; i <= 10; i++) { try {
 * Thread.sleep(1000); } catch (Exception e) { e.printStackTrace(); } }
 * 
 * System.out.println("MyThread5�� �����մϴ�."); } }
 */

class MyTread6 implements Runnable {

	Integer balance = new Integer(3000);

	@Override
	public void run() {

		while (balance > 0) {
			synchronized (this) {
				if (balance >= 1000) {
					balance -= 1000;
					System.out.println(balance);
				}
			}

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class MyTread7 implements Runnable {

	Integer balance = new Integer(3000);

	@Override
	public void run() {
		withdraw();
		
		while (balance > 0) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	synchronized  void withdraw() {
		if (balance >= 1000) {
			balance -= 1000;
			System.out.println(balance);
		}
	}
}








