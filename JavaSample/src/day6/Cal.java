package day6;

public class Cal {

	private double su1;
	private double su2;
	private char ch;
	private double res;
	
	public double getSu1() {
		return su1;
	}

	public void setSu1(double su1) {
		this.su1 = su1;
	}

	public double getSu2() {
		return su2;
	}

	public void setSu2(double su2) {
		this.su2 = su2;
	}

	public char getCh() {
		return ch;
	}

	public void setCh(char ch) {
		this.ch = ch;
	}

	public double getRes() {
		return res;
	}

	public void setRes(double res) {
		this.res = res;
	}


	public void setCal(double su1, double su2, char ch) {
																// 입력받은 매개변수의 값을 설정
		setSu1(su1);				
		setSu2(su2);
		setCh(ch);
		
	}
	
	public Cal() {
		
		
	}
	
	public Cal(double su1, double su2, char ch) {		// 이 생성자는 setCal 메소드의 역할과 같아서 그냥 갖다쓰면 됨
		
		setCal(su1, su2, ch); 				// setCal 메소드와 파라미터가 같기 때문에 간단하게 작성
		
	}
	
	
	public void sum() {
		
		res = su1 + su2;
	}
	
	public void sub() {
		
		res = su1 - su2;
	}
	
	public void mul() {
		
		res = su1 * su2;
	}
	
	public void mod() {
		
		res = su1 % su2;
	}
	
	public boolean div() {
		
		if(su2 == 0) {					// 1/0 하면 안되는듯이 su2가 0이면  
			return false;				// 잘못입력했으니 정상작동할 수 있게 다시 입력하라고 알려주는거
		} else {
			res = su1 / su2;
			return true;
		}
	}
	
	
	public boolean cal() {
		
		switch(ch) {
		
		case '+' :
			sum();
			break;
			
		case '-' :
			sub();
			break;
			
		case '*' :
			mul();
			break;
			
		case '%' :
			mod();
			break;
			
		case '/' :
			if(div())
				return true;		// 만약 나누기 연산이 제대로 된거면 true, 아니면 false
			else return false;
			
		default :
			return false;			// 나 계산 잘못됐다고 알려주는거 (예를 들어 ?나 ! 등 연산자에 포함되지 않는 연산자가 입력되었을 경우)
		}
		
		return true;				// 결과값이 true이면 제대로 연산이 된거고, false면 제대로 계산이 안된거
									// 여기 return true를 안써주려면, 각 case마다 break 자리에 return true를 적어주면 됨
	}
	
}
