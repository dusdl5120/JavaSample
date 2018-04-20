package day10;

import java.util.HashSet;
import java.util.Iterator;

public class Hash {

	public static void main(String[] args) {
		
		HashSet<Integer> hs1 = new HashSet<Integer>();
		
		hs1.add(10);
		hs1.add(20);
		hs1.add(10);
		hs1.add(20);

		Iterator<Integer> it = hs1.iterator();
		
		while(it.hasNext()) {
			
			System.out.println((Integer)it.next());
		}
		
		
		
		
		HashSet<Integer> hs = new HashSet<Integer>();
		
		hs.add(10);
		hs.add(10);
		hs.add(10);
	
		for (Integer tmp : hs) {
			System.out.println(tmp);
		}
		
		hs.add(new Integer(10));
		hs.add(new Integer(10));
		hs.add(new Integer(10));
		
		for (Integer tmp : hs) {
			System.out.println(tmp);
		}
		
		HashSet<Number> nhs = new HashSet<Number>();
		nhs.add(new Number(10, 10));
		nhs.add(new Number(10, 10));
		nhs.add(new Number(10, 10));
		
		for (Number tmp : nhs) {
			System.out.println(tmp);
		}
		
		
		
		
		
		
	}

}


class Number {
	
	
	int su1;
	int su2;
	
	Number (int su1, int su2) {
		this.su1 = su1;
		this.su2 = su2;
	}
	
	@Override
	public int hashCode() {
		
		return (su1 + su2) % 3;
		
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if (obj != null && obj instanceof Number) {
			
			Number tmp = (Number) obj;
			
			if (this.su1 == tmp.su1 && this.su2 == tmp.su2) {
				return true;
			}
		}
		
		
		return false;
		
	}
	
	
	
	
	
}
























