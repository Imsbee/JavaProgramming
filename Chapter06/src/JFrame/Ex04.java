package JFrame;

import javax.swing.*;
import java.awt.*;

public class Ex04 extends JFrame {
	JButton btns1, btns2;
	public Ex04() {
		setLayout(new FlowLayout());
		
		btns1 = new JButton("����");
		btns2 = new JButton("���");
		
		add(btns1);
		add(btns2);
		setTitle("��ư ����");
		setSize(300, 100);
		setVisible(true);
	}
	public static void main(String[] args) {
		Ex04 f = new Ex04();
	}
}
