package test;

public class Main {

	public static void main(String[] args) {
		
		Point pt = new Point();
		
		System.out.print("초기좌표 : ");
		pt.print();
		
		System.out.print("이동 후 좌표 : ");
		pt.move(5, 10);
		pt.print();
		
	}

}
