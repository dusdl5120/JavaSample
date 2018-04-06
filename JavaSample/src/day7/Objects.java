package day7;

public class Objects {

	public static void main(String[] args) {
		
		Child c1 = new Child();
		
		c1.setX(1);
		c1.setY(2);
		c1.setZ(3);
		
		Child c2 = new Child();
		
		c2.setX(1);
		c2.setY(2);
		c2.setZ(3);
		
		if (c1 == c2) {
			System.out.println("����");
		
		} else {
			System.out.println("�ٸ�");
		}
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		
		try {
			c1.wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		
	}

}


class Child {		// extends Object�� �����Ǿ� �ִ°� (�ֻ��� �θ�Ŭ����)
	
	private int x;
	private int y;
	private int z;
	
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

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


	@Override
	public boolean equals(Object obj) {
		
		if ( ! (obj instanceof Child) ) {
			return false;
		}
		
		Child c = (Child)obj;
		
		if (x == c.x && y == c.y && z == c.z) {
			return true;
		
		} else {
			return false;
		}
		
	}
	
	
	public String toString() {
		return this.getClass().getName() + "@" + "x : " + x + ", y :" + y + ", z : " + z;
	}
	
}