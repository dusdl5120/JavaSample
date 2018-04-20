package day10;

import java.util.HashSet;
import java.util.Iterator;

public class HashLotto {

	public static void main(String[] args) {

		HashSet<Integer> hs = new HashSet<Integer>();
		
		int a = 1;												// a, b의 값을 초기화해주고
		int b = 20;
		
		for (;hs.size() != 6;) {								// hs의 size가 6이 아닐 경우 밑에 실행
			
			hs.add((int)(Math.random() * (b-a+1) + a));			// hs에 랜덤생성한 값을 추가
					
		}
		
		Iterator<Integer> it = hs.iterator();					// Iterator로 출력
		
		while(it.hasNext()) {
			
			System.out.println((Integer)it.next());
		}
		
		
	}

	
}
