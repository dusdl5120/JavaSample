package day5;

public class Main {

	public static void main(String[] args) {

		Circle cl = new Circle();		// Circle 클래스의 객체생성
		cl.printCircle();				// printCircle 생성자 호출 -> 그럼 매개변수 없는 Circle생성자를 호출함과 동시에 객체 생성할거임
										// circle() 생성자는 기본값으로 중심좌표 0,0 / 반지름값 5.0으로 줬기 때문에 고대로 이렇게 출력 예상 
		
		cl.moveCenter(10, 10);			// moveCenter() 생성자 호출 -> 얘도 외부에서 중심좌표값 (10, 10)으로 받아서 전달. 반지름은 외부에서 받은값이 없기 때문에 기본값 그대로 5.0
		cl.printCircle();				// 그 후 출력하면 중심좌표 10, 10 / 반지름값 5.0으로 출력 예상
		
		cl.resize(20.1);				// resize() 생성자 호출 -> 얘도 외부에서 반지름값 (20.1)로 받아서 전달. 중심좌표값은 외부에서 받은값이 없기 때문에 아까 그대로 10, 10
		cl.printCircle();				// 그 후 출력하면 중심좌표 10, 10 / 반지름 : 20.1 으로 출력 예상
		
		System.out.println();

	/********************************************************************************************************************************************************************************/	
		
		Rect r = new Rect();				// 매개변수 없는 Rect() 생성자 객체생성
		r.print();							// print() 호출
		
		Rect r2 = new Rect(0,0,10,-10);		// 매개변수 4개짜리 Rect() 생성자 객체생성
		r2.print();							// print() 호출 <-- Rect 클래스 참고
		
		Rect r3 = new Rect(new Point(0,0), new Point(10,-10)); 		// Point클래스의  ㅋㅋㅋㅋ 뭔소리야ㅋㅋㅋㅋ
		r3.print();
		
	}

}
