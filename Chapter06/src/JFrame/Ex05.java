package JFrame;

import javax.swing.*;
import java.awt.*;

public class Ex05 extends JFrame {
	JButton btns1, btns2;
	public Ex05() {
		setLayout(new FlowLayout());
		
		btns1 = new JButton("����");
		btns2 = new JButton("���");
		
		btns1.setBackground(Color.YELLOW);
		btns1.setForeground(Color.RED);
		btns2.setBackground(Color.ORANGE);
		btns2.setForeground(Color.BLUE);
		
		add(btns1);
		add(btns2);
		setTitle("���� ����");
		setSize(300, 100);
		setVisible(true);
	}
	public static void main(String[] args) {
		Ex05 f = new Ex05();
	}
}
