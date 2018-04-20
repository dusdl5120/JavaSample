package day10;

import java.util.Iterator;
import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;

public class Mapp {

	public static void main(String[] args) {

		TreeMap<Integer, String> tmap = new TreeMap<Integer, String>();
		
		tmap.put(10, "hi");		
		tmap.put(20, "hello");
		tmap.put(30, "hello");		// key���� �ߺ��Ұ�, value���� �ߺ����
		
		
		Iterator it = tmap.entrySet().iterator();	// set�̱� ������ iterator�� ���� (map�� iterator ������)
		
		while (it.hasNext()) {
			
			Map.Entry<Integer, String>
			map = (Map.Entry<Integer, String>)
			it.next(); 
			
			String value = map.getValue();
			int key = map.getKey();
			
			System.out.print("key : " + key );
			System.out.println(", value : " + value); 
		}
		
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(10);
		stack.pop();
		
		for (int i=0; i<10; i++) {
			stack.push(i);
		}
		
		while (!stack.isEmpty()) {
			System.out.print(stack.pop() + " ");
		}
		
	}

}
