package day13;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Frame2 {

	public static void main(String[] args) {
		
		// 프로그램실행
		new FrameCal();
		
		
	}

}

class FrameCal extends Frame {
	
	TextField tfResult;		
	Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnSum, btnSub, btnDiv, btnMul, btnEqual;
	int num1, num2, res;		
	char ch;					// 연산자
	
	//설정한 메소드 호출
	public FrameCal() {
		
		this.setFrame();
		this.setTextField();
		this.setButton();
		
		this.add(tfResult); 
		this.add(btn1);
		this.add(btn2);
		this.add(btn3);
		this.add(btn4);
		this.add(btn5);
		this.add(btn6);
		this.add(btn7);
		this.add(btn8);
		this.add(btn9);
		this.add(btn0);
		this.add(btnSum);
		this.add(btnSub);
		this.add(btnDiv);
		this.add(btnMul);
		this.add(btnEqual);
		
		ListenerCal listener = new ListenerCal(this);		
		
		// 프레임에서 윈도우와 관련된 이벤트가 발생하면 해당이벤트를 동작시키기 위해 리스너와 연결
		this.addWindowListener(listener);
		
		this.btn1.addActionListener(listener);
		this.btn2.addActionListener(listener);
		this.btn3.addActionListener(listener);
		this.btn4.addActionListener(listener);
		this.btn5.addActionListener(listener);
		this.btn6.addActionListener(listener);
		this.btn7.addActionListener(listener);
		this.btn8.addActionListener(listener);
		this.btn9.addActionListener(listener);
		this.btn0.addActionListener(listener);
		this.btnSum.addActionListener(listener);
		this.btnSub.addActionListener(listener);
		this.btnDiv.addActionListener(listener);
		this.btnMul.addActionListener(listener);
		this.btnEqual.addActionListener(listener);
		
		
	}
	
	// 프레임의 기본설정
	private void setFrame() {
		
		this.setSize(400, 470);
		this.setLocation(100, 100);
		this.setLayout(null);
		this.setVisible(true);
		
	}
	
	// 텍스트필드 컴포넌트 설정
	private void setTextField() {
		
		this.tfResult = new TextField();
		this.tfResult.setSize(340, 80);
		this.tfResult.setLocation(30, 60);
		this.tfResult.setEnabled(false);							// 입력못하게 설정
		this.tfResult.setFont(new Font("Times", Font.BOLD, 60));
		this.tfResult.setText("0");
	}
	
	// 버튼설정
	private void setButton() {
		
		int gab = 20;			// 버튼과 버튼 사이의 간격
		int startX = 30;
		int startY = 60 + 80;

		int width = 50;
		int height = 50;
		
		btn1 = new Button("1");
		btn2 = new Button("2");
		btn3 = new Button("3");
		btn4 = new Button("4");
		btn5 = new Button("5");
		btn6 = new Button("6");
		btn7 = new Button("7");
		btn8 = new Button("8");
		btn9 = new Button("9");
		btn0 = new Button("0");
		btnSum = new Button("+");
		btnSub = new Button("-");
		btnDiv = new Button("/");
		btnMul = new Button("*");
		btnEqual = new Button("=");
		
		btn1.setSize(width, height);
		btn2.setSize(width, height);
		btn3.setSize(width, height);
		btn4.setSize(width, height);
		btn5.setSize(width, height);
		btn6.setSize(width, height);
		btn7.setSize(width, height);
		btn8.setSize(width, height);
		btn9.setSize(width, height);
		btn0.setSize(width*3 + gab*2, height);
		btnSum.setSize(width, height);
		btnSub.setSize(width, height);
		btnDiv.setSize(width, height);
		btnMul.setSize(width, height);
		btnEqual.setSize(width, height*4 + gab*3);
		
		btn7.setLocation(startX + width*0 + gab*0, startY + height*0 + gab*1);
		btn8.setLocation(startX + width*1 + gab*1, startY + height*0 + gab*1);
		btn9.setLocation(startX + width*2 + gab*2, startY + height*0 + gab*1);
		btnDiv.setLocation(startX + width*3 + gab*3, startY + height*0 + gab*1);
		
		btnEqual.setLocation(startX + width*4 + gab*4, startY + height*0 + gab*1);
		
		btn4.setLocation(startX + width*0 + gab*0, startY + height*1 + gab*2);
		btn5.setLocation(startX + width*1 + gab*1, startY + height*1 + gab*2);
		btn6.setLocation(startX + width*2 + gab*2, startY + height*1 + gab*2);
		btnMul.setLocation(startX + width*3 + gab*3, startY + height*1 + gab*2);
		
		btn1.setLocation(startX + width*0 + gab*0, startY + height*2 + gab*3);
		btn2.setLocation(startX + width*1 + gab*1, startY + height*2 + gab*3);
		btn3.setLocation(startX + width*2 + gab*2, startY + height*2 + gab*3);
		btnSub.setLocation(startX + width*3 + gab*3, startY + height*2 + gab*3);
		
		btn0.setLocation(startX + width*0 + gab*0, startY + height*3 + gab*4);
		btnSum.setLocation(startX + width*3 + gab*3, startY + height*3 + gab*4);
		
	}
	
}

class ListenerCal implements WindowListener, ActionListener {

	FrameCal frame;
	char tmp;
	
	public ListenerCal(FrameCal frame) {
		this.frame = frame;
		
	}
	
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		
		System.out.println("종료합니다.");
		System.exit(0);
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() instanceof Button) {
			this.ButtonListener((Button) e.getSource());
		}
	}
	
	private void ButtonListener(Button btn) {
		
		Integer inputNum;
		
		try {
			
			inputNum = Integer.parseInt(btn.getLabel());
			
			// 0~9까지의 숫자 버튼을 눌렀을 때에만 동작
			if (this.frame.tfResult.getText().equals("0")) {
				this.frame.tfResult.setText(inputNum.toString());
			
			} else {
				
				if (this.frame.tfResult.getText().length() < 9) {
					this.frame.tfResult.setText(this.frame.tfResult.getText()+inputNum.toString());
				}
			} 
			
		} catch (Exception e) {
			
			if (isOperation(btn.getLabel().charAt(0))) {
				
				if(isOperation(frame.ch)) {
					
					frame.num2 = Integer.parseInt(frame.tfResult.getText());
					frame.res = 0;
					frame.num1 = frame.res; 
					this.Cal();
					
				} else {
					
					frame.num1 = Integer.parseInt(frame.tfResult.getText());
					
				}
			
				frame.ch = btn.getLabel().charAt(0);						// 연산자 덮어쓰기
				
			} else {
				 
				frame.num2 = Integer.parseInt(frame.tfResult.getText());
				
			}
			
				System.out.println(frame.num1);
				System.out.println(btn.getLabel().charAt(0));
			
		}
		
		tmp = btn.getLabel().charAt(0);
	}
	
	private boolean isOperation (char ch) {
		
		switch(ch) {
		case '+' :	case '-' :	case '*' :	case '/' :
			return true;
		default :
			return false;
		}
		
	}
	
	private String Cal() {
		
		switch(frame.ch) {
		
		case '+' :	
			
			frame.res = frame.num1 + frame.num2;
			frame.num1 = frame.res;
			Integer ires = frame.res;
			return ires.toString();
			
		case '-' :	
			
			frame.res = frame.num1 - frame.num2;
			break;
		
		case '*' :	
			
			frame.res = frame.num1 * frame.num2;
			break;
		
		case '/' :
			
			frame.res = frame.num1 / frame.num2;
			break;
			
		}
		
		frame.num1 = frame.res;
		Integer ires = frame.res;
		
		return ires.toString();
		
	}
	
	
	
	
}








