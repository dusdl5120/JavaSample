package day10;

import java.util.HashSet;
import java.util.Iterator;

public class HashLotto {

	public static void main(String[] args) {

		HashSet<Integer> hs = new HashSet<Integer>();
		
		int a = 1;												// a, b�� ���� �ʱ�ȭ���ְ�
		int b = 20;
		
		for (;hs.size() != 6;) {								// hs�� size�� 6�� �ƴ� ��� �ؿ� ����
			
			hs.add((int)(Math.random() * (b-a+1) + a));			// hs�� ���������� ���� �߰�
					
		}
		
		Iterator<Integer> it = hs.iterator();					// Iterator�� ���
		
		while(it.hasNext()) {
			
			System.out.println((Integer)it.next());
		}
		
		
	}

	
}
