package com.kryshyna.java1.lab05;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * @author Kryshyna Vadym
 */

/**
 * Написать программу на языке Java2, которая обрабатывает содержимое
 * текстового файла согласно варианту задания.
 * Вариант:
 * Прочитать исходный текст Java-программы и записать в другой файл 
 * в обратном порядке символы каждой строки.
 */

public class Main {

	public static void main(String[] args) throws IOException {
		FileReader fileReader = new FileReader
("C:\\Documents and Settings\\Vadim\\Мои документы\\Eclipse\\lab05\\src\\lab_05.java");
		BufferedReader bufferReader = new BufferedReader(fileReader);
		File outputFile = new File("C:\\Temp\\MyLab5.txt");
		FileOutputStream fileOS = new FileOutputStream(outputFile);
		OutputStreamWriter osw = new OutputStreamWriter(fileOS);		
		String s;
		while ((s = bufferReader.readLine()) !=  null){
			for (int i = s.length(); i > 0; i --){				
				osw.write(s.charAt(i-1));
			}
			osw.write("\n");
		}
		fileReader.close();
		osw.close();
		fileOS.close();
		System.out.println("Лабораторная робота № 5. Исполнитель Кришина В.Й.");
	}

}
