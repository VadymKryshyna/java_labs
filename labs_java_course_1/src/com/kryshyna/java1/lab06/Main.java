package com.kryshyna.java1.lab06;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;

/**
 * @author Kryshyna Vadym
 */

/**
 * Написать программу на языке Java2, которая создает коллекцию 
 * согласно варианта задания, и обрабатывает ее.
 * 
 * Вариант:
 *  Исходный файл содержит два набора положительных значений, между
 *  наборами стоит отрицательное значение. Построить два списка С1 
 *  и С2, элементы которых содержат значение из наборов 1 и 2 
 *  соответственно. Элементы расположить по возрастанию. Выполнить 
 *  соединение списков, изменяя только значение полей ссылочного типа.
 */

public class Main {

	public static void main(String[] args)throws IOException {

		//Указываем файл с которго будем считывать данные 
		BufferedReader reader = new BufferedReader(new FileReader("c://temp//list.txt"));
		LinkedList<Integer> list1 = new LinkedList<Integer>(); 
		LinkedList<Integer> list2 = new LinkedList<Integer>();
		String s = reader.readLine();
		//Считываем данные в первый список до первого отрицательного элемента
		while (Integer.parseInt(s) > 0){
			list1.add(Integer.parseInt(s));
			s = reader.readLine();
		}
		s = reader.readLine();
		//Считываем данные во второй список
		while (!(s == null)){
			list2.add(Integer.parseInt(s));
			s = reader.readLine();
		}
		reader.close();
		
	System.out.println("Лабораторная работа № 6. Исполнитель Кришина В.И.");

		System.out.println("Список номер 1 до сортировки");
		System.out.println(list1);
		System.out.println("Список номер 2 до сортировки");
		System.out.println(list2);
		
		Collections.sort(list1);
		Collections.sort(list2);
				
		System.out.println("Список номер 1 после сортировки");
		System.out.println(list1);
		System.out.println("Список номер 2 после сортировки");
		System.out.println(list2);

		//Добавление элементов из списка 2 в список 1
		for (int i = 0; i < list2.size(); i++){
			int flag = 0;
			for (int j = 0;(flag == 0)&&(j < list1.size());j++){
				if((list2.get(i)< list1.get(j))){
					if(j == 0){	list1.addFirst(list2.get(i));	}
					else{	list1.add(j, list2.get(i));	}
					flag = 1;
				}
			}
		}
		
		System.out.println("Список номер 1 после присоединения элементов списка номер 2");
		System.out.println(list1);
	}
}
