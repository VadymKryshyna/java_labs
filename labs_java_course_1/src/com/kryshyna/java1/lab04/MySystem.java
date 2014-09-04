package com.kryshyna.java1.lab04;

/**
 * @author Kryshyna Vadym
 */

/**
 *  ����������� ������� ���������������� ����. �������� ������������
 *  ����������� ������� (��) �� �������������� ������������� ����. 
 *  ����������� ������������ ��, ���������� ��������� �������������� 
 *  � ������������, ���������� ��������� ���� �� �������������� � 
 *  ������� ������� ������������� ��� ���������� �������.
 */

public class MySystem {

	public static void main(String[] args) {
		int floor[] = {1,2,3,4,5,6,7,8,9,10};
		
		Customer customer = new Customer();
		DesignOffice office = new DesignOffice();
		customer.makeTask(floor[(int)(Math.random()*9)]);
		office.chief.registerTask(customer.getTask());
		customer.acceptInvoice(office.chief.makeInvoice());
		office.chief.makeProject();
		
	}

}
