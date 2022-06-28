package main;

import javax.swing.*;

import window.LocationCenter;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Random;

public class ont_to_fifty extends JFrame {
	JButton[] btns = new JButton[25];
	Random r = new Random();
	Boolean[] is_status = new Boolean[25];
	int[] number = new int[25];
	int score = 0;
	int i = 0;

	public ont_to_fifty() {
		int w = 500;
		int h = 500;
		int num = 0;
		setLayout(new GridLayout(5, 5));
		Arrays.fill(is_status, false); // boolean�� �迭�� is_status�� ��� ���� false�� �ʱ�ȭ

		// 1~25���� ��ư ����
		while (i < 25) {
			num = r.nextInt(25);
			btns[i] = new JButton(num + 1 + "");
			if (is_status[num] == false) {
				is_status[num] = true;
				add(btns[i]);
				i++;
			}
		}

		// ���� ���� 1~25�� �ʱ�ȭ
		for (i = 1; i <= 25; i++) {
			number[i - 1] = i;
		}

		// â ���� ����
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
