package com.kryshyna.java1.lab01;

/**
 * @author Kryshyna Vadym
 */

/**
 * Дана матрица A[N][N] вещественных значений типа double,
 * где N = 6. Найдите сумму элементов матрицы, которые
 * расположены между первым и вторым отрицательными 
 * элементами каждой строки. Результат выведите на экран.
 */

public class Main {

	public static void main(String[] args) {
		System.out.println("Кришина В.Й.");
		final int SIZE = 6;
		double [][] array_double = new double [SIZE][SIZE];
		
		//Заполняем матрицу случайными числами
		for (int i = 0; i < array_double.length; i++){ 
			for (int j = 0; j < array_double[i].length; j++){
				double temp = Math.random();
				if (temp < 0.3){ temp = temp*(-1.0);}
				array_double[i][j] = temp*100;
			}
		}
		
		//Печатаем матрицу
		printArray(array_double);
		System.out.print("\n");
		
		//Ищем сумму элементов согласно условий задания
		searchSumElements(array_double);
	}

	//Метод вывода масива на экран
	static void printArray(double[][] array){
		for (int i = 0; i < array.length; i++){
			for (int j = 0; j < array[i].length; j++){
				System.out.print(array [i][j]);
				System.out.print("\t");
			}
			System.out.print("\n");
		}
	}
	
	//Метод поиска суммы элементов согласно условий задания
	static void searchSumElements(double[][] array_double){
		for (int i = 0; i < array_double.length; i++){ 
			double temp = 0.0;
			int flag = 0;
			for (int j = 0; j < array_double[i].length; j++){
				if ((array_double[i][j] < 0)&&(flag == 1)){
					flag = 2;
				}
				if((array_double[i][j] < 0)&&(flag == 0)){
					flag = 1;
				}
				if ((flag == 1) && (array_double[i][j] > 0)){
					temp = temp + array_double[i][j];
				}
			}
			if ((flag == 2)&& (temp != 0.0)){
				System.out.println("Сумма в " + (i+1) + " строчке = " + temp);
			} else {
				System.out.println("Отсутствую элементы, которые соответствуют условиям в " + (i+1) + " строчке");
			} 
		}
	}	
}