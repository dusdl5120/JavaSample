package day10;

public class StringMain {

	public static void main(String[] args) {
		
		String s = new String("hello world");
		System.out.println(s.charAt(0));
		
		s = s + "!" ;
		System.out.println(s);
		System.out.println(s.contains("hi"));		// 지정된 문자열이 포함되었는지  ==> boolean
		
		s = "hello.txt";
		System.out.println(s);
		System.out.println(s.endsWith(".txt"));		// 지정된 문자열로 끝나는지 검색	==> boolean
		System.out.println(s.equals("hello.txt"));	// 해당하는 문자열의 값 검색
		System.out.println(s.indexOf('t'));			// 지정된 문자가 들어있는 위치를 알려줌 (지정한 문자가 없으면 -1 반환)
		
		int[] arr = new int[4];
		int a = s.length();
		
		s = "new.naver.com/main/read.nhm?oid=asldkf/j4651/";
		String[] sp = s.split("/");					//	/를 기준으로 문자열 잘라서 배열 sp번지에 대입
		for (int i=0; i<sp.length; i++) {
			System.out.println("sp[" + i + "] : " + sp[i]);
		}
		
		s = "hello";
		System.out.println(s.substring(0, 2));		// 0번지부터 2번지전까지 잘라서 넘겨라 : he    ==> start <= x < end 
		s = String.valueOf(100); 					// 정수형 100을 문자열 100으로 만들겟다
		s = String.valueOf('a'); 		
		 
		AA aa = new AA();
		s = String.valueOf(aa);
		System.out.println(s);
		
		StringBuffer sb = new StringBuffer("012345");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		//System.out.println(sb.delete(0, 2)); 
		System.out.println(sb.insert(5, "asdfasdfX"));
		System.out.println(sb.reverse());	// 거꾸로
		
		
		
		
		
		
		
	}

}


class AA {
	
}



















