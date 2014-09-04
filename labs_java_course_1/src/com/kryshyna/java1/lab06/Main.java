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
 * �������� ��������� �� ����� Java2, ������� ������� ��������� 
 * �������� �������� �������, � ������������ ��.
 * 
 * �������:
 *  �������� ���� �������� ��� ������ ������������� ��������, �����
 *  �������� ����� ������������� ��������. ��������� ��� ������ �1 
 *  � �2, �������� ������� �������� �������� �� ������� 1 � 2 
 *  ��������������. �������� ����������� �� �����������. ��������� 
 *  ���������� �������, ������� ������ �������� ����� ���������� ����.
 */

public class Main {

	public static void main(String[] args)throws IOException {

		//��������� ���� � ������� ����� ��������� ������ 
		BufferedReader reader = new BufferedReader(new FileReader("c://temp//list.txt"));
		LinkedList<Integer> list1 = new LinkedList<Integer>(); 
		LinkedList<Integer> list2 = new LinkedList<Integer>();
		String s = reader.readLine();
		//��������� ������ � ������ ������ �� ������� �������������� ��������
		while (Integer.parseInt(s) > 0){
			list1.add(Integer.parseInt(s));
			s = reader.readLine();
		}
		s = reader.readLine();
		//��������� ������ �� ������ ������
		while (!(s == null)){
			list2.add(Integer.parseInt(s));
			s = reader.readLine();
		}
		reader.close();
		
	System.out.println("������������ ������ � 6. ����������� ������� �.�.");

		System.out.println("������ ����� 1 �� ����������");
		System.out.println(list1);
		System.out.println("������ ����� 2 �� ����������");
		System.out.println(list2);
		
		Collections.sort(list1);
		Collections.sort(list2);
				
		System.out.println("������ ����� 1 ����� ����������");
		System.out.println(list1);
		System.out.println("������ ����� 2 ����� ����������");
		System.out.println(list2);

		//���������� ��������� �� ������ 2 � ������ 1
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
		
		System.out.println("������ ����� 1 ����� ������������� ��������� ������ ����� 2");
		System.out.println(list1);
	}
}
