package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class Ex01 {
	public static void main(String[] args) throws IOException {

		//UTF-8로 해석, 파일이 깨짐
		
		// 메인 스트림 준비
		Reader fr = new FileReader("C:\\javaStudy\\MS949.txt"); // MS949 형식으로 저장된 파일이라 오류
		// 보조 스트림 준비
		BufferedReader br = new BufferedReader(fr);

		System.out.println("--------------------스트림 준비완료");

		while (true) {
			String str = br.readLine();

			if (str == null) {
				System.out.println("--------------------파일읽기 완료");
				break;
			}

			System.out.println(str);
		}
		// 스트림 닫기
		br.close();

		System.out.println("--------------------프로그램 종료");
	}
}
