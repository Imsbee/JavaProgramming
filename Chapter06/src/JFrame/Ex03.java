package JFrame;

import javax.swing.*;
import java.awt.*;

public class Ex03 extends JFrame {
	JLabel lb1, lb2;
	public Ex03() {
		setLayout(new FlowLayout());
		lb1 = new JLabel("����:          ");
		lb2 = new JLabel("�ֹι�ȣ:           ");
		
		add(lb1);
		add(lb2);
		setTitle("�� ����");
		setSize(300, 100);
		setVisible(true);
	}
	public static void main(String[] args) {
		Ex03 f = new Ex03();
	}
}
