package com.kryshyna.java1.lab01;

/**
 * @author Kryshyna Vadym
 */

/**
 * ���� ������� A[N][N] ������������ �������� ���� double,
 * ��� N = 6. ������� ����� ��������� �������, �������
 * ����������� ����� ������ � ������ �������������� 
 * ���������� ������ ������. ��������� �������� �� �����.
 */

public class Main {

	public static void main(String[] args) {
		System.out.println("������� �.�.");
		final int SIZE = 6;
		double [][] array_double = new double [SIZE][SIZE];
		
		//��������� ������� ���������� �������
		for (int i = 0; i < array_double.length; i++){ 
			for (int j = 0; j < array_double[i].length; j++){
				double temp = Math.random();
				if (temp < 0.3){ temp = temp*(-1.0);}
				array_double[i][j] = temp*100;
			}
		}
		
		//�������� �������
		printArray(array_double);
		System.out.print("\n");
		
		//���� ����� ��������� �������� ������� �������
		searchSumElements(array_double);
	}

	//����� ������ ������ �� �����
	static void printArray(double[][] array){
		for (int i = 0; i < array.length; i++){
			for (int j = 0; j < array[i].length; j++){
				System.out.print(array [i][j]);
				System.out.print("\t");
			}
			System.out.print("\n");
		}
	}
	
	//����� ������ ����� ��������� �������� ������� �������
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
				System.out.println("����� � " + (i+1) + " ������� = " + temp);
			} else {
				System.out.println("���������� ��������, ������� ������������� �������� � " + (i+1) + " �������");
			} 
		}
	}	
}