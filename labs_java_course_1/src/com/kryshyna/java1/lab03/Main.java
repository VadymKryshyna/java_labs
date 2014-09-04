package com.kryshyna.java1.lab03;

/**
 * @author Kryshyna Vadym
 */

/**
 * Написать программу на языке Java2, которая состоит из следующих
 * действий:
 * 1. Описывает класс согласно варианта задания (столб. 2).
 * 2. Создает массив объектов, для которого выводит на экран
 *  информацию согласно варианта задания (столб. 3).
 *  
 *  Описание класса:
 *  Класс Абитуриент: 
 *  Идентификационный номер, Фамилия, Имя, Отчество, Адрес, Телефон,
 *  Оценки;
 *  Конструктор;
 *  Методы: установка значений атрибутов, получение значений 
 *  атрибутов, вывод информации
 *  
 *  Критерий для вывода информации
 *  1. Список абитуриентов, которые получили неудовлетворительные оценки.
 *  2. Список абитуриентов, у которых средний балл выше заданного.
 *  3. Список абитуриентов, которые имеют полупроходной балл.
 */


public class Main {

	public static void main(String[] args) {
		int N = (int)(Math.random()*10)+1;
        Leaver masiv[] = new Leaver [N];
		
		String[] name = {"Ivan", "Maria", "Petya", "Kolya", "Lena"};
		String[] addr = {"Kiev", "Lvov", "Donetsk", "Odessa", "Brovary"};
		String[] phone = {"11111", "22222", "33333", "44444", "55555"};
		int[][] m = {{1,2,3,4,5}, {3,4,5,4,5}, {1,2,2,1,2}, {2,2,2,2,2}, {1,1,1,1,1}};
		
		System.out.println("Кришина В.И.");
		System.out.println("Total leaver: " + masiv.length);
		for(int i=0; i<masiv.length; i++) {
            masiv[i] = new Leaver();
            masiv[i].setFullName(name[(int)(Math.random()*100)%name.length]);
            masiv[i].setAddress(addr[(int)(Math.random()*100)%addr.length]);
            masiv[i].setTelephone(phone[(int)(Math.random()*100)%phone.length]);
            masiv[i].setMark(m[(int)(Math.random()*100)%m.length]);
        }

		System.out.println("Total leaver:");
		for (int i = 0; i < masiv.length; i++)	{
				System.out.println(masiv[i]);
				System.out.println();
				
		}

		System.out.println("\nLeaver with bad mark:");
		int k = 0;
		for (int i = 0; i < masiv.length; i++)	{
			if (! masiv[i].haveGoodMark() ){
				System.out.println(masiv[i]);
				System.out.println();
				k = 1;
			}
		}
		if (k == 0){System.out.println("No one leaver with bad mark");}
		
		k = 0;
		System.out.println("Leaver with midlemark > 4.0:");
		for (int i = 0; i < masiv.length; i++)	{
			if (masiv[i].getMidleMark() >= 4.0){
				System.out.println(masiv[i]);
				System.out.println();
				k = 1;
			}
		}
		if (k == 0){System.out.println("No one leaver with midlemark > 4.0");}
			
		k = 0;
		System.out.println("Leaver with midlemark >= 3.0 and < 4.0:");
		for (int i = 0; i < masiv.length; i++)	{
			if ((masiv[i].getMidleMark() >= 3.0)&& (masiv[i].getMidleMark() < 4.0)){
				System.out.println(masiv[i]);
				System.out.println();
				k = 1;
			}
		}
		if (k == 0){System.out.println("No one leaver with midlemark >= 3.0 and < 4.0");}
	}
}
