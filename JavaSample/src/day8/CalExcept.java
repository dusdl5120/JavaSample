package day8;

public class CalExcept {

	public static void main(String[] args) {

		Exception2 ee = new Exception2();
		
		double res = 0;
		
		try {
			res = ee.calculate(1, 0, '%');
			System.out.println(res);
		
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		
		
	}

}
