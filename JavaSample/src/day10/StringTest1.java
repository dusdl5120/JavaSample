package day10;

public class StringTest1 {

	public static void main(String[] args) {

		String s = "안녕하세요.제 이름은 철수입니다.만나서 반갑습니다.";
		
		String[] sp = s.split("\\.");			
		
		for (int i=0; i<sp.length; i++) {
			System.out.println("sp[" + i + "] : " + sp[i]);
		}
		
	}

}
