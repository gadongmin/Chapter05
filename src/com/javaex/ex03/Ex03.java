package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Ex03 {
	public static void main(String[] args) throws IOException {

		Reader fr = new FileReader("C:\\javaStudy\\PhoneDB.txt");
		BufferedReader br = new BufferedReader(fr);

		while (true) {
			String str = br.readLine();
			if (str == null) {
				break;
			}
			String[] info = str.split(",");
			String name = info[0];
			String hp = info[1];
			String cp = info[2];

			System.out.println("이름: " + info[0]);
			System.out.println("핸드폰: " + info[1]);
			System.out.println("회사: " + info[2]);
			System.out.println("");

		}
		br.close();
	}
}
