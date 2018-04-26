package day12;

public class Threads3 {
   
	public static void main(String[] args) {
    
		int data2 = 10;
		Integer2 data1 = new Integer2(10);
		
		ThreadEx1 th1 = new ThreadEx1(data1, data2);
		ThreadEx1 th2 = new ThreadEx1(data1, data2);
		
		th1.start();
		th2.start();
		
	}

}


class ThreadEx1 extends Thread {
	
	Integer2 data1;
	int data2;
	
	
	public void run() {
		for (int i=0; i<10; i++) {
			synchronized (this) {
				
				System.out.println("threadEx1 : data1 - " + data1.num + ", data2 - : " + data2);
				
				data1.num--;
				data2--;
				
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public ThreadEx1 (Integer2 data1, int data2) {
		this.data1 = data1;
		this.data2 = data2;
	}
}

class Integer2 {
	
	int num;
	
	public Integer2(int n) {
		num = n;
	}
	
}












