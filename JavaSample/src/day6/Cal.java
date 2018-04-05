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
																// �Է¹��� �Ű������� ���� ����
		setSu1(su1);				
		setSu2(su2);
		setCh(ch);
		
	}
	
	public Cal() {
		
		
	}
	
	public Cal(double su1, double su2, char ch) {		// �� �����ڴ� setCal �޼ҵ��� ���Ұ� ���Ƽ� �׳� ���پ��� ��
		
		setCal(su1, su2, ch); 				// setCal �޼ҵ�� �Ķ���Ͱ� ���� ������ �����ϰ� �ۼ�
		
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
		
		if(su2 == 0) {					// 1/0 �ϸ� �ȵǴµ��� su2�� 0�̸�  
			return false;				// �߸��Է������� �����۵��� �� �ְ� �ٽ� �Է��϶�� �˷��ִ°�
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
				return true;		// ���� ������ ������ ����� �ȰŸ� true, �ƴϸ� false
			else return false;
			
		default :
			return false;			// �� ��� �߸��ƴٰ� �˷��ִ°� (���� ��� ?�� ! �� �����ڿ� ���Ե��� �ʴ� �����ڰ� �ԷµǾ��� ���)
		}
		
		return true;				// ������� true�̸� ����� ������ �ȰŰ�, false�� ����� ����� �ȵȰ�
									// ���� return true�� �Ƚ��ַ���, �� case���� break �ڸ��� return true�� �����ָ� ��
	}
	
}
