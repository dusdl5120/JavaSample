package day11;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx {

	public static void main(String[] args) {
		
		
		//ArrayList<Integer> al = new ArrayList<Integer>();		// 데이터타입을 지정해줘도 되고,
		
		ArrayList<Integer> al = new ArrayList<Integer>();		// 클래스 이름을 지정해줘도 된다
		
		al.add(100);
		al.add(80);
		al.add(50);
		al.add(200);
		
		for (int i=0; i<al.size(); i++) {

			System.out.println(al.get(i));
		}
		
		System.out.println("----");
		
		al.remove(2);
		
		
		
		Iterator<Integer> it = al.iterator();
		
		while (it.hasNext()) {
		
			System.out.println(it.next());
		}
		
		
		
		
	}

}


class Student {
	
	String name;
	int grade;
	int ban;
}