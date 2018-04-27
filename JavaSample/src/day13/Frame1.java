package day13;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Frame1 {

	public static void main(String[] args) {

		new FrameEx1();
		
		
	}

}



class FrameEx1 extends Frame {
	
	Button btnOk, btnCancel;
	Panel p;
	
	public FrameEx1() {
		
		this.setFrame(); 
		p = new Panel();
		p.setSize(300,  400);
		p.setLayout(new FlowLayout());
		this.setButton(); 
		
		ListenerEx1 listener = new ListenerEx1(this);		
		this.addWindowListener(listener);
		this.btnOk.addActionListener(listener);
		this.btnCancel.addActionListener(listener);
		
	}
	
	public void setFrame() {
		
		this.setSize(500, 470);		
		this.setLayout(new FlowLayout());
		this.setVisible(true);
		this.setLocation(750, 250);
		
	}
	
	public void setButton() {
		
		btnOk = new Button("확인");
		btnCancel = new Button("취소");
		btnOk.setLocation(100, 100);
		btnOk.setEnabled(true);
		
		this.p.add(btnOk);
		this.p.add(btnCancel);
		this.add(p);
		
	}
}

class ListenerEx1 implements WindowListener, ActionListener {

	FrameEx1 frame;
	
	public ListenerEx1(FrameEx1 frame) {
		this.frame = frame;						
	}
	
	@Override
	public void windowOpened(WindowEvent e) {		// 윈도우가 열렷을때
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {		// 해당하는 프로그램이 종료중일때
		System.out.println("종료합니다.");
		System.exit(0); 
		
	}

	@Override
	public void windowClosed(WindowEvent e) {		// 종료되었을 때
		
		
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
	public void windowActivated(WindowEvent e) {		// 활성화되었을 때
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {		// 비활성화 (백그라운드로 실행되고 있을때)
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {		// 이벤트 발생 후 어떠한 발생을 일으킬건지
		
		if (e.getSource() instanceof Button) {
			
			Button btn = (Button) e.getSource();		
			this.buttonListener(btn);
			
			// 한줄요약 : this.buttonListener((Button) e.getSource());
		}
	}
	
	public void buttonListener(Button btn) {
		
		if (btn.getLabel().equals("확인")) {
			System.out.println("확인버튼 클릭");
		
		} else if (btn.getLabel().equals("취소")) {
			System.out.println("취소버튼 클릭");
		} 
		
	}
	
}






















