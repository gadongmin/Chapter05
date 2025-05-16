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
		
		// 무한 루프 시작
		while (true) { 
			String str = br.readLine(); // 문자열 1줄씩 파일읽기

			// null이 나오면 반복 종료
			if (str == null) {
				break;
			}
			
			// 파일 내용을 ","로 구분하기
			String[] info = str.split(",");
			String name = info[0]; // [이효리][정우성][이정재]
			String hp = info[1]; // [010-2222-3333][010-2323-2323][010-9999-9999]
			String com = info[2]; // [031-2323-4441][02-5555-5555][02-8888-8888]
			
			// 구분한 메모리를 Person에 올리기
			Person p = new Person(name, hp, com);
			
			// 리스트에 메모리(주소) 담기
			pArr.add(p);
			System.out.println(p);
		}
		
		// 테스트 출력
		System.out.println(pArr.toString());
		System.out.println("-------------------------------");		
		
		// 리스트 반복문으로 출력
		for (int i = 0; i < pArr.size(); i++) {
			pArr.get(i).showInfo();
		}
		System.out.println("-------------------------------");

		// 이름 출력
		for (int i = 0; i < pArr.size(); i++) {
			System.out.println(pArr.get(i).getName()); 
		}
		System.out.println("-------------------------------");


		br.close();
	}
}
