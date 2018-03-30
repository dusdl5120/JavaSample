package day5;

import day5.Circle;

public class Class {

	public static void main(String[] args) {

		Circle cls = new Circle();
		cls.print(); 
		cls.moveCenter(10, 10);
		cls.print();
		cls.resize(10.1);
		cls.print();
		System.out.println();
		
		Rect r = new Rect();
		r.print();
		Rect r2 = new Rect(0, 0, 10, -10);
		r2.print();
		Rect r3 = new Rect(new Point(0,0), new Point(10,-10));
		r3.print();
		
	}

}

