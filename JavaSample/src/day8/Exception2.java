package day8;

public class Exception2 implements CalculatorInterface {

	@Override
	public double sum(double a, double b) {
		
		return a+b;
	}

	@Override
	public double sub(double a, double b) {
		
		return a-b;
	}

	@Override
	public double mul(double a, double b)  {
	
		return a*b;
	}

	@Override
	public double div(double a, double b) throws Exception {
	
		if (b == 0) throw new Exception("나누기");
			
		return a/b;
	}

	@Override
	public double mod(double a, double b) throws Exception {
		
		if (b == 0) throw new Exception("나머지");
	
		return a%b;
	}

	@Override
	public double calculate(double a, double b, char ch) throws Exception {
		
		switch(ch) {
		
		case '+':
			return sum(a, b);
		
		case '-':
			return sub(a, b);
			
		case '*':
			return mul(a, b);
			
		case '/':
			return div(a, b);
			
		case '%':
			return mod(a, b);
			
		default :
			throw new Exception("연산자 잘못입력");
		
		}
			
		
	}

}
