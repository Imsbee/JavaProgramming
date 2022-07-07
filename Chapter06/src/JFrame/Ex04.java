package JFrame;

import javax.swing.*;
import java.awt.*;

public class Ex04 extends JFrame {
	JButton btns1, btns2;
	public Ex04() {
		setLayout(new FlowLayout());
		
		btns1 = new JButton("전송");
		btns2 = new JButton("취소");
		
		add(btns1);
		add(btns2);
		setTitle("버튼 예제");
		setSize(300, 100);
		setVisible(true);
	}
	public static void main(String[] args) {
		Ex04 f = new Ex04();
	}
}
