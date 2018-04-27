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
		
		btnOk = new Button("Ȯ��");
		btnCancel = new Button("���");
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
	public void windowOpened(WindowEvent e) {		// �����찡 ��������
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {		// �ش��ϴ� ���α׷��� �������϶�
		System.out.println("�����մϴ�.");
		System.exit(0); 
		
	}

	@Override
	public void windowClosed(WindowEvent e) {		// ����Ǿ��� ��
		
		
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
	public void windowActivated(WindowEvent e) {		// Ȱ��ȭ�Ǿ��� ��
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {		// ��Ȱ��ȭ (��׶���� ����ǰ� ������)
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {		// �̺�Ʈ �߻� �� ��� �߻��� ����ų����
		
		if (e.getSource() instanceof Button) {
			
			Button btn = (Button) e.getSource();		
			this.buttonListener(btn);
			
			// ���ٿ�� : this.buttonListener((Button) e.getSource());
		}
	}
	
	public void buttonListener(Button btn) {
		
		if (btn.getLabel().equals("Ȯ��")) {
			System.out.println("Ȯ�ι�ư Ŭ��");
		
		} else if (btn.getLabel().equals("���")) {
			System.out.println("��ҹ�ư Ŭ��");
		} 
		
	}
	
}






















