package day11;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class MapTree {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
		
		tm.put(1, "È«±æµ¿");
		tm.put(2, "È«±æµ¿");
		tm.put(3, "È«±æµ¿");
		tm.put(1, "ÀÓ²©Á¤");
		
		Iterator<Map.Entry<Integer, String>> it = tm.entrySet().iterator();

		while (it.hasNext()) {
			Map.Entry<Integer, String> tmp = it.next();
			
			System.out.print("key : " + tmp.getKey());
			System.out.println(", value : " + tmp.getValue());
		}
		
		
		
	}

}
