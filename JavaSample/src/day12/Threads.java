package day12;

public class Threads {
	// static boolean data = false; // 문자를 받을 변수
	static int balance = 3000; // 문자를 받을 변수

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
		 * e) { e.printStackTrace(); } } System.out.println("스레드 다시시작"); m5.start();
		 * 
		 * m5 = new Thread(new MyTread5()); try { m5.join(); } catch
		 * (InterruptedException e) { e.printStackTrace(); }
		 */

		/*
		 * MyTread m1 = new MyTread(); m1.start(); // start는 둘다실행 // run은 run 실행 다하고
		 * main 실행
		 * 
		 * String data = JOptionPane.showInputDialog("문자열입력");
		 * System.out.println("입력받은문자열 ㅣ" + data); // 문자입력 할 수 있게 하는 것
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
				// if (Threads.data.compareTo("q") == 0 ) // q이면 멈춘다
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
 * if (Threads.data == true) { System.out.println("파일을 자동저장합니다."); } } }
 * 
 * }
 * 
 * class MyTread5 implements Runnable {
 * 
 * @Override public void run() { for (int i = 1; i <= 10; i++) { try {
 * Thread.sleep(1000); } catch (Exception e) { e.printStackTrace(); } }
 * 
 * System.out.println("MyThread5를 종료합니다."); } }
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








