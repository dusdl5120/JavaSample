package day11;

public class StudentsMain {

	public static void main(String[] args) {

		Manager sm = new Manager();
		sm.insert(new Students(1, 1, 1), "ȫ�浿", 100, 90, 80);
		sm.insert(new Students(1, 1, 2), "�Ӳ���", 100, 100, 100);
		sm.print();

		System.out.println("--------------------------------------------------------------------------------");
		sm.delete(new Students(1, 1, 1));
		sm.print();
		
		System.out.println("--------------------------------------------------------------------------------");
		sm.update(new Students(1, 1, 2), "ȫ�浿", 50, 90, 90);
		sm.print();
		
		
		
		
		
		
		
		
		

		/*
		 * Students std = new Students("ȫ",1,1,1);
		 * std.setKor(100).setEng(100).setMath(100);
		 * 
		 * Students std1 = new Students("ȫ",1,1,1);
		 * std1.setKor(100).setEng(100).setMath(100);
		 * 
		 * //System.out.println(std);
		 * 
		 * HashSet<Students> hs = new HashSet<Students>(); hs.add(std); hs.add(std1);
		 * 
		 * for (Students tmp : hs) { System.out.println(tmp); }
		 */

	}

}
