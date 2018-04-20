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
		 * List<E> : 순서가 있는 데이터의 집합, 데이터 중복허용 → Vector, ArrayList, LinkedList, Stack, Queue
		 * Set<E> : 순서가 없는 데이터의 집합, 데이터 중복허용불가 → HashSet, TreeSet
		 * Map<K, V> : Key와 Value의 한쌍으로 이루어진 데이터의 집합, 순서가 없음
		 * 			   Key는 고유의 값으로 중복허용불가, Value은 중복가능
		 * 
		 * Stack : LIFO구조 (나중에 들어간 애가 먼저 나온다 : 1,2,3을 순서대로 넣으면 출력은 3,2,1)  ==> Last In  → First OUt  
		 * Queue : FIFO구조 (먼저 들어간 애가 먼저 나온다 : 1,2,3을 순서대로 넣으면 출력은 1,2,3) ==> First In  → First Out
		 * deQueue : 입구가 양방향임. double end Queue.  
		 * 
		 * 
		 * ArrayList : 리스트를 배열로 구현할건지 . 탐색이 쉽다. 0번지의 주소를 알면 1,2번지의 주소를 쉽게 알수 있음
		 *             그러나 중간에 삽입하거나 어떠한 값을 빼려고 할경우 어려워. 왜냐?
		 *             데이터가 많아질수록 데이터 연산속도는 느려짐. 중간에 하나를 빼버리면 뒤에있는 것부터 하나씩 앞으로 땡겨야함
		 *             즉, 하나를 삽입하려면 나머지를 싹 밀어야함. 그렇기 때문에 성능이 저하됨
		 * 
		 * LinkedList : 리스트를 링크로 구현할건지. 링크로 연결되어있음
		 * 				중간에 데이터를 삭제하고 싶을경우, 화살표가 방향만 바꿔주고 삭제하고 싶은 데이터를 삭제하면 됨.
		 *  			즉, 중간에 데이터를 삽입, 삭제가 빈번하게 일어나도 성능이 좋음. 그러나 탐색이 어려움
		 *  			가리키는 애를 타고 타고 가야하고, 경로가 길어지기 때문.
		 *  			
		 * 
		 */
		
		ArrayList<Integer> al = new ArrayList<Integer>();	// <Integer> : 정수형 데이터를 저장		/ 오른쪽에 있는 list 옆에 꺽쇠 생략가능
		al.add(10);											// integer를 지정안해주면 다양한 값을 지정해줄수 있음 . 실수타입도 가능 
		al.add(20);											// 동일한 객체를 다룰거면 꺽쇠써서 해주는게 조음
		al.add(30);
		al.add(40);
		
		for (int i=0; i<al.size(); i++) {
			
			System.out.println(al.get(i));
		}
		System.out.println("삭제 전 : " + al.size());
		
		al.remove(3);  					// 해당하는 번지수를 삭제 remove(index)
		System.out.println("----");

		for (int i=0; i<al.size(); i++) {
			
			System.out.println(al.get(i));
		}
		System.out.println("삭제 후 : " + al.size());
		
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
		
		while(it.hasNext()) {				// 다음 애를 가지고 있는지 물어보는거임 -> 있으면 true 없으면 false
			
			int i = (Integer)it.next();		// 있으면 니가 갖고 있는 정보 중에서 다음꺼 꺼내와서 나한테 알려줘. 그럼 꺼낸값은 it에서 사라지는거
			System.out.println(i);			// 넘겨주고 i한테 값을 다 넘겨줄때까지 계속 반복
			
		}
		
		
		
		Vector<Integer> v = new Vector<Integer>();		// 스레드에서의 동기화하는거 제외하고는 ArrayList와 동일
		v.capacity();
		v.size();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}























