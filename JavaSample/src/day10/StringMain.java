package day10;

public class StringMain {

	public static void main(String[] args) {
		
		String s = new String("hello world");
		System.out.println(s.charAt(0));
		
		s = s + "!" ;
		System.out.println(s);
		System.out.println(s.contains("hi"));		// ������ ���ڿ��� ���ԵǾ�����  ==> boolean
		
		s = "hello.txt";
		System.out.println(s);
		System.out.println(s.endsWith(".txt"));		// ������ ���ڿ��� �������� �˻�	==> boolean
		System.out.println(s.equals("hello.txt"));	// �ش��ϴ� ���ڿ��� �� �˻�
		System.out.println(s.indexOf('t'));			// ������ ���ڰ� ����ִ� ��ġ�� �˷��� (������ ���ڰ� ������ -1 ��ȯ)
		
		int[] arr = new int[4];
		int a = s.length();
		
		s = "new.naver.com/main/read.nhm?oid=asldkf/j4651/";
		String[] sp = s.split("/");					//	/�� �������� ���ڿ� �߶� �迭 sp������ ����
		for (int i=0; i<sp.length; i++) {
			System.out.println("sp[" + i + "] : " + sp[i]);
		}
		
		s = "hello";
		System.out.println(s.substring(0, 2));		// 0�������� 2���������� �߶� �Ѱܶ� : he    ==> start <= x < end 
		s = String.valueOf(100); 					// ������ 100�� ���ڿ� 100���� ����ٴ�
		s = String.valueOf('a'); 		
		 
		AA aa = new AA();
		s = String.valueOf(aa);
		System.out.println(s);
		
		StringBuffer sb = new StringBuffer("012345");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		//System.out.println(sb.delete(0, 2)); 
		System.out.println(sb.insert(5, "asdfasdfX"));
		System.out.println(sb.reverse());	// �Ųٷ�
		
		
		
		
		
		
		
	}

}


class AA {
	
}



















