package day12;

public class Threads5 {

	public static void main(String[] args) {
		
		/*
		 * main�����带 �����Ͽ� 2���� �����带 �̿��Ͽ� ������ϴ� �ڵ带 �ۼ�
		 * ������ �ҽ��� ����. main�����忡���� 100���� ���Ѵ�� �Ա��ϰ�
		 * �ٸ� �����忡���� ���̾�α׿��� �Է��� �ݾ����� ���
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
		System.out.printf("��ݾ� : %5d��, �ܾ� : %5d��, " , money , balance);
	}
	
}