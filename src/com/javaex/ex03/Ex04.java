package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class Ex04 {
	public static void main(String[] args) throws IOException {
		// 리스트 만들기
		List<Person> pArr = new ArrayList<Person>();
		// 읽기 스트림 준비
		Reader fr = new FileReader("C:\\javaStudy\\PhoneDB.txt");
		BufferedReader br = new BufferedReader(fr);

		while (true) {
			String str = br.readLine(); // 파일읽기
			if (str == null) {
				break;
			}
			String[] info = str.split(","); // 파일 내용을 ","로 구분하기
			String name = info[0]; 
			String hp = info[1];
			String com = info[2];
			
			// 구분한 내용을 Person에 넣기
			Person p = new Person(name, hp, com);
			
			// 리스트에 담기
			pArr.add(p);
		}
		
		// 리스트 반복문으로 출력
		for (int i = 0; i < pArr.size(); i++) {
			pArr.get(i).showInfo();
		}

		br.close();
	}
}
