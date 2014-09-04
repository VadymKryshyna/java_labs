package com.kryshyna.java1.lab07;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 * @author Kryshyna Vadym
 */

/**
 * �������� ��������� �� ����� Java � ���� GUI-����������. ���������
 * ������������� ��� ������������ ����������� �������������� ������������
 * �������� �������� �������. ������� ���� ���������� ������ ���������: 
 * ������� ����, ������� �������� ����� ���� "�������" �� ����������
 * ���������:
�* "�� ���������" - ��� ����������� �������������� �����������, �����������
 * � ��������� ������� �� ���������; 
 * "��������" - ��� ������� ���������� ������� ����, �� ���� ����������� 
 * ������ ������������ ���������; 
 * "��� ������" - ��� ������������ ����������� �������������� �����������, 
 * ����������� �������� �������� ������.
 * �������:
 * ���������� ���������:
 * � � [-4�, 4�]
 * Y(x) = sin(x+1)*3;
 * Y(x) = sin(x+2)*2;
 * Y(x) = sin(x+1)*3 + sin(x+2)*2;
 */

//����� ���������� ����� ����� � ���������
public class MyApplet {
	//����� ����� � ���������
	public static void main(String[] args) {
		//�������� ������� ������ JFrame � ����������� ��� ����������
	JFrame frame = new JFrame("������������ ������ � 7. ������� �3. ������� �.�.");
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 400);
		final MyGrafikPanel panel=new MyGrafikPanel();
		frame.setContentPane(panel);
		//�������� ���� ���� � ����������� ������������ ������� ��������� ����
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		JMenu menu1 = new JMenu("M�� �������");
		menuBar.add(menu1);
		JMenuItem menuItem = new JMenuItem("��� �������");
	    menuItem.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		panel.choose = 4;
	    		panel.repaint();
	    	}
	    });
		menu1.add(menuItem);
		menuItem = new JMenuItem("������ 1");
	    menuItem.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		panel.choose=1;
	    		panel.repaint();
	    	}
	    });
		menu1.add(menuItem);
		menuItem = new JMenuItem("������ 2");
	    menuItem.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		panel.choose = 2;
	    		panel.repaint();
	    	}
	    });
		menu1.add(menuItem);
		menuItem = new JMenuItem("������ 3");
	    menuItem.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		panel.choose = 3;
	    		panel.repaint();
	    	}
	    });
		menu1.add(menuItem);
		menuItem = new JMenuItem("��������");
	    menuItem.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		panel.choose = 5;
	    		panel.repaint();
	    	}
	    });
	    menu1.add(menuItem);
		menuItem = new JMenuItem("�����");
	    menuItem.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {	System.exit(0);	}
	    });
		menu1.add(menuItem);
		frame.setVisible(true);
	}
}
