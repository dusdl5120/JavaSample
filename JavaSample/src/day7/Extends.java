package day7;

public class Extends {

	public static void main(String[] args) {
		
		Child1 c = new Child1();			// parents() 기본생성자를 호출하지 않아도 부모클래스를 상속받았기 때문에 부모기본생성자도 호출됨. 
										// 이건 기본생성자만 호출한거고, 각각 부모와 자식생성자가 호출된거. 호출은 부모부터.
		
		// c.prints();					// 부모클래스를 상속받아서 prints()도 호출가능
		
		Child1 c2 = new Child1(1,2,3);	// 얘도 마찬가지. 파라미터 3개의 값을 받아서 호출.
		
		ChildOther co = new ChildOther();
		ChildOther co2 = new ChildOther(4,3,2,1);
		
		System.out.println("child x : " + c2.x);			// 생성자에서 this.setX()로 했으면 호출할 때는 c2.getX()로
		System.out.println("child y : " + c2.getY());
		System.out.println("child z : " + c2.getZ());
		
		System.out.println("childOther x : " + co2.x);
		System.out.println("childOther y : " + co2.getY());
		System.out.println("childOther z : " + co2.getZ());
		System.out.println("childOther num : " + co2.num);

	}

}


class Parents {
	
	public int x;
	protected int y;
	private int z;
	
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}
	
	
	public void prints () {
		
		System.out.println("부모입니다.");
	}
	
	public Parents() {
		
		System.out.println("부모 디폴트 생성자");
		
	}

	public Parents(int x, int y, int z) {		// x,y,z를 입력받아서 값을 저장하는 생성자
		
		this.setY(y);			
		this.setZ(z);
		this.x = x;
		
		System.out.println("부모생성자 오버로딩");
		
	}

}


class Child1 extends Parents {
	
	public void print () {
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(getZ());		// 그냥 z으로는 가져올수 없으니까. getter / setter 만든 후 getZ으로 가져와야함 (private으로 선언되었기 때문에)				
		
	}
	
	@Override
	public void prints() {
		
		System.out.println("자식입니다.");		// 부모클래스에서 print()를 상속받았지만 자식클래스에서 같은 메소드 즉, prints()로 내용을 수정하고 싶으면
												// 오버라이딩을 통해 재정의함으로써 메인메소드에서 호출할 때 자식클래스에서 재정의한 내용으로 호출됨
	}
	
	public Child1 () {
		
		// super()가 자동으로 생략되었다.					// super(); 를 사용할 때는 즉, 부모 클래스의 생성자는 항상 자식클래스 생성자의 첫줄에 입력해야함
		
		System.out.println("자식 디폴트 생성자");			
	}
	
	public Child1(int x, int y, int z) {
		
		super(x,y,z);										// 부모클래스의 생성자를 호출 (같은 매개변수를 받기 때문에 중복이되니까 더 간편하게 코딩)
		System.out.println("자식 생성자 오버로딩");
		
	}
	
	
}


class ChildOther extends Parents {
	
	public int num;
	
	public ChildOther() {
		
		System.out.println("다른 자식 디폴트 생성자");
		
	}
	
	public ChildOther(int x, int y, int z, int num) {
		
		super(x, y, z);		// setZ(z), setY(y) 이런식으로 직접 생성해도 되지만 부모클래스에 있는거 그냥 갖다써라.
		this.num = num;		// 얘는 부모클래스에 없기 때문에 이건 자기가 직접해야함. 부모가 대신해줄수 없는 노릇ㅋㅋ
							// 부모가 같은 형제라 할지라도 형제꺼 못갖다쓴다. 오로지 부모꺼만 갖다 쓸 수 있음
		
		System.out.println("다른 자식 생성자 오버로딩");
		
	}
	
	
	
	
	
	
}
























