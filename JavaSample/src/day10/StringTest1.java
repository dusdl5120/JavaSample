package day10;

public class StringTest1 {

	public static void main(String[] args) {

		String s = "�ȳ��ϼ���.�� �̸��� ö���Դϴ�.������ �ݰ����ϴ�.";
		
		String[] sp = s.split("\\.");			
		
		for (int i=0; i<sp.length; i++) {
			System.out.println("sp[" + i + "] : " + sp[i]);
		}
		
	}

}
