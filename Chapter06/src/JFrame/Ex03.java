package JFrame;

import javax.swing.*;
import java.awt.*;

public class Ex03 extends JFrame {
	JLabel lb1, lb2;
	public Ex03() {
		setLayout(new FlowLayout());
		lb1 = new JLabel("성명:          ");
		lb2 = new JLabel("주민번호:           ");
		
		add(lb1);
		add(lb2);
		setTitle("라벨 예제");
		setSize(300, 100);
		setVisible(true);
	}
	public static void main(String[] args) {
		Ex03 f = new Ex03();
	}
}
