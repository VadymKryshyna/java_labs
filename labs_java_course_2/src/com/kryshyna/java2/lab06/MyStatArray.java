package com.kryshyna.java2.lab06;

import java.util.Random;

/**
 * @author Kryshyna Vadym
 */

public class MyStatArray {
	public int [][] mas;
	public int dif;  // во сколько повышаем сложность
	public int count; // к-ство раз тестирования для каждого уровня сложности
	public int level;// количество уровней сложности
	
	public MyStatArray(int _dif, int _count, int _lev){
		level = _lev;
		dif = _dif;
		count = _count;
		mas = new int [level][count];
	}

	public void print() {
		int n = 1;
		for (int j = 0; j < mas.length; j++){
			n = n*dif;
			String out = "Среднее время для "+ n +" елементов составляет " + (double)this.midle(j)/1000000+" милисекунд";
			System.out.println(out);
		}
	}
	
	public void printNano() {
		int n = 1;
		for (int j = 0; j < mas.length; j++){
			n = n*dif;
			String out = "Среднее время для "+ n +" елементов составляет " + this.midle(j)+" наносекунд";
			System.out.println(out);
		}
	}
	
	private int midle(int num){
		int result = 0;
		for (int i = 0; i < mas[num].length; i++){
			result = result + mas[num][i];
		}
		return result / mas[num].length;
	}
	
	public static MyStatArray testTimeSortBubble(int _dif, int _count, int _lev){
		MyArray ar;
		MyStatArray stat = new MyStatArray(_dif, _count, _lev);
		int n = 1;
		long start, end, time;
		for (int j = 0; j < stat.mas.length; j++){
			n = n * stat.dif;
			for (int i = 0; i < stat.mas[j].length; i++){
				ar = new MyArray(n);
				ar.fillArray();
				start = System.currentTimeMillis();
				ar.bubbleSort();
				end = System.currentTimeMillis();
				time = end - start;
				stat.mas[j][i] = (int)time;
			}
		}
		return stat;
	}

	public static MyStatArray testTimeSortBubble1(int _dif, int _count, int _lev){
		MyArray ar;
		MyStatArray stat = new MyStatArray(_dif, _count, _lev);
		int n = 1;
		long start, end, time;
		for (int j = 0; j < stat.mas.length; j++){
			n = n * stat.dif;
			for (int i = 0; i < stat.mas[j].length; i++){
				ar = new MyArray(n);
				ar.fillArray();
				start = System.nanoTime();
				ar.bubbleSort();
				end = System.nanoTime();
				time = end - start;
				stat.mas[j][i] = (int)time;
			}
		}
		return stat;
	}

	public static MyStatArray[] testTimeSearch(int _dif, int _count, int _lev){
		MyArray ar;
		MyStatArray []stat1 = new MyStatArray[2];
		stat1[0] = new MyStatArray(_dif, _count, _lev);
		stat1[1] = new MyStatArray(_dif, _count, _lev);
		int n = 1;
		long start, end, time;
		Random rand = new Random();
		for (int j = 0; j < stat1[0].mas.length; j++){
			n = n * stat1[0].dif;
			ar = new MyArray(n);
			ar.fillArray();
			ar.bubbleSort();
			for (int i = 0; i < stat1[0].mas[j].length; i++){
				int elem = rand.nextInt(n)+1;	
//				start = System.currentTimeMillis();
				start = System.nanoTime();
				ar.lineSearch(elem);
//				end = System.currentTimeMillis();
				end = System.nanoTime();
				time = end - start;
				stat1[0].mas[j][i] = (int)time;

//				start = System.currentTimeMillis();
				start = System.nanoTime();
				ar.binarySearch(elem);
//				end = System.currentTimeMillis();
				end = System.nanoTime();
				time = end - start;
				stat1[1].mas[j][i] = (int)time;
			}
		}
		return stat1;
	}
}
