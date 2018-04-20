package day10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public class Collection {

	public static void main(String[] args) {

		/*
		 * Collection : List<E> , Set<E>, Map<K, V>
		 * 
		 * List<E> : ������ �ִ� �������� ����, ������ �ߺ���� �� Vector, ArrayList, LinkedList, Stack, Queue
		 * Set<E> : ������ ���� �������� ����, ������ �ߺ����Ұ� �� HashSet, TreeSet
		 * Map<K, V> : Key�� Value�� �ѽ����� �̷���� �������� ����, ������ ����
		 * 			   Key�� ������ ������ �ߺ����Ұ�, Value�� �ߺ�����
		 * 
		 * Stack : LIFO���� (���߿� �� �ְ� ���� ���´� : 1,2,3�� ������� ������ ����� 3,2,1)  ==> Last In  �� First OUt  
		 * Queue : FIFO���� (���� �� �ְ� ���� ���´� : 1,2,3�� ������� ������ ����� 1,2,3) ==> First In  �� First Out
		 * deQueue : �Ա��� �������. double end Queue.  
		 * 
		 * 
		 * ArrayList : ����Ʈ�� �迭�� �����Ұ��� . Ž���� ����. 0������ �ּҸ� �˸� 1,2������ �ּҸ� ���� �˼� ����
		 *             �׷��� �߰��� �����ϰų� ��� ���� ������ �Ұ�� �����. �ֳ�?
		 *             �����Ͱ� ���������� ������ ����ӵ��� ������. �߰��� �ϳ��� �������� �ڿ��ִ� �ͺ��� �ϳ��� ������ ���ܾ���
		 *             ��, �ϳ��� �����Ϸ��� �������� �� �о����. �׷��� ������ ������ ���ϵ�
		 * 
		 * LinkedList : ����Ʈ�� ��ũ�� �����Ұ���. ��ũ�� ����Ǿ�����
		 * 				�߰��� �����͸� �����ϰ� �������, ȭ��ǥ�� ���⸸ �ٲ��ְ� �����ϰ� ���� �����͸� �����ϸ� ��.
		 *  			��, �߰��� �����͸� ����, ������ ����ϰ� �Ͼ�� ������ ����. �׷��� Ž���� �����
		 *  			����Ű�� �ָ� Ÿ�� Ÿ�� �����ϰ�, ��ΰ� ������� ����.
		 *  			
		 * 
		 */
		
		ArrayList<Integer> al = new ArrayList<Integer>();	// <Integer> : ������ �����͸� ����		/ �����ʿ� �ִ� list ���� ���� ��������
		al.add(10);											// integer�� ���������ָ� �پ��� ���� �������ټ� ���� . �Ǽ�Ÿ�Ե� ���� 
		al.add(20);											// ������ ��ü�� �ٷ�Ÿ� ����Ἥ ���ִ°� ����
		al.add(30);
		al.add(40);
		
		for (int i=0; i<al.size(); i++) {
			
			System.out.println(al.get(i));
		}
		System.out.println("���� �� : " + al.size());
		
		al.remove(3);  					// �ش��ϴ� �������� ���� remove(index)
		System.out.println("----");

		for (int i=0; i<al.size(); i++) {
			
			System.out.println(al.get(i));
		}
		System.out.println("���� �� : " + al.size());
		
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		
		System.out.println("----");

		for (int i=0; i<ll.size(); i++) {
			
			System.out.println(ll.get(i));
		}
		
		System.out.println("----");
		Iterator<Integer> it = ll.iterator();		
		
		while(it.hasNext()) {				// ���� �ָ� ������ �ִ��� ����°��� -> ������ true ������ false
			
			int i = (Integer)it.next();		// ������ �ϰ� ���� �ִ� ���� �߿��� ������ �����ͼ� ������ �˷���. �׷� �������� it���� ������°�
			System.out.println(i);			// �Ѱ��ְ� i���� ���� �� �Ѱ��ٶ����� ��� �ݺ�
			
		}
		
		
		
		Vector<Integer> v = new Vector<Integer>();		// �����忡���� ����ȭ�ϴ°� �����ϰ�� ArrayList�� ����
		v.capacity();
		v.size();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}























