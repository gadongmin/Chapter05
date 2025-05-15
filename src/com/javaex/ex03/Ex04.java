package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class Ex04 {
	public static void main(String[] args) throws IOException {
		List<Person> pArr = new ArrayList<Person>();
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
			String com = info[2];

			Person p = new Person(name, hp, com);

			pArr.add(p);

		}
		for (int i = 0; i < pArr.size(); i++) {
			pArr.get(i).showInfo();
		}

		br.close();
	}
}
