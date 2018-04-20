package day11;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx {

	public static void main(String[] args) {


		ArrayList<Integer> al = new ArrayList<Integer>();	
		
		al.add(10);											 
		al.add(20);											
		al.add(30);
		al.add(40);
		
		Iterator<Integer> it = al.iterator();		
		
		while (it.hasNext()) {				
			
			int i = (Integer)it.next();		
			System.out.println(i);			
			
		}

	}

}
