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
 * Написать программу на языке Java в виде GUI-приложения. Программа
 * предназначена для графического отображения математических зависимостей
 * согласно варианту задания. Главное окно приложения должно содержать: 
 * Главное меню, которое включает пункт меню "Графика" со следующими
 * командами:
 * "По умолчанию" - для отображения математической зависимости, построенной
 * с исходными данными по умолчанию; 
 * "Очистить" - для очистки клиентской области окна, то есть отображения 
 * только координатной плоскости; 
 * "Моя фигура" - для графического отображения математической зависимости, 
 * построенной согласно заданным данным.
 * Задание:
 * Добавление колебаний:
 * х Е [-4п, 4п]
 * Y(x) = sin(x+1)*3;
 * Y(x) = sin(x+2)*2;
 * Y(x) = sin(x+1)*3 + sin(x+2)*2;
 */

//Класс содержащий точку входа в программу
public class MyApplet {
	//Точка входа в программу
	public static void main(String[] args) {
		//Создание обьекта класса JFrame с последующей его настройкой
	JFrame frame = new JFrame("Лабораторная работа № 7. Вариант №3. Кришина В.Й.");
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 400);
		final MyGrafikPanel panel=new MyGrafikPanel();
		frame.setContentPane(panel);
		//Создание меню окна с добавлением обработчиков событий элементов меню
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		JMenu menu1 = new JMenu("Mои графики");
		menuBar.add(menu1);
		JMenuItem menuItem = new JMenuItem("Все графики");
	    menuItem.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		panel.choose = 4;
	    		panel.repaint();
	    	}
	    });
		menu1.add(menuItem);
		menuItem = new JMenuItem("График 1");
	    menuItem.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		panel.choose=1;
	    		panel.repaint();
	    	}
	    });
		menu1.add(menuItem);
		menuItem = new JMenuItem("График 2");
	    menuItem.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		panel.choose = 2;
	    		panel.repaint();
	    	}
	    });
		menu1.add(menuItem);
		menuItem = new JMenuItem("График 3");
	    menuItem.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		panel.choose = 3;
	    		panel.repaint();
	    	}
	    });
		menu1.add(menuItem);
		menuItem = new JMenuItem("Очистить");
	    menuItem.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		panel.choose = 5;
	    		panel.repaint();
	    	}
	    });
	    menu1.add(menuItem);
		menuItem = new JMenuItem("Выход");
	    menuItem.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {	System.exit(0);	}
	    });
		menu1.add(menuItem);
		frame.setVisible(true);
	}
}
