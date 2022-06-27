package main;

import javax.swing.*;

import window.LocationCenter;

import java.awt.*;
import java.util.Arrays;
import java.util.Random;

public class ont_to_fifty extends JFrame {
	public ont_to_fifty() {
		int w = 500;
		int h = 500;
		int num = 0;
		int i = 0;
		int score = 0;
		setLayout(new GridLayout(5, 5));
		JButton[] btns = new JButton[25];
		Random r = new Random();
		Boolean[] is_status = new Boolean[25];
		Arrays.fill(is_status, false); // boolean�� �迭�� is_status�� ��� ���� false�� �ʱ�ȭ
		
		while(i < 25) {	// 1~25���� ��ư ����
			num = r.nextInt(25);
			btns[i] = new JButton(num + 1 + "");
			if(is_status[num] == false) {
				is_status[num] = true;
				add(btns[i]);
				i++;

			}
		}
		
		while(score < 25) { // ���� ���� �κ�
			btns[score].addActionListener(event -> {
				btns[score].setVisible(false);
				
					
			});
		}
		
		setTitle("1 TO 50");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		LocationCenter lc = new LocationCenter(w, h);
		setBounds(lc.getX(), lc.getY(), w, h);
		setVisible(true);
		
		
	}

	public static void main(String[] args) {
		new ont_to_fifty();
	}
}
