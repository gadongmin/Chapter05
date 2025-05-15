package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Ex02 {
	public static void main(String[] args) throws IOException {
		// 읽기 스트림 준비
		InputStream in = new FileInputStream("C:\\javaStudy\\MS949.txt"); // 메인스트림 → 2진수로 읽음
		InputStreamReader isr = new InputStreamReader(in, "MS949"); // 보조 스트림 준비 → 2진수를 MS949형식으로 해석
		BufferedReader br = new BufferedReader(isr); // 보조 스트림 준비 → MS949형식으로 해석된 글자를 버퍼에 담는다

		// 쓰기 스트림 준비
		OutputStream out = new FileOutputStream("C:\\javaStudy\\MS949-copy.txt");
		OutputStreamWriter osw = new OutputStreamWriter(out, "MS949");
		BufferedWriter bw = new BufferedWriter(osw);

		System.out.println("------------------------------------스트림 준비완료");

		while (true) {
			String str = br.readLine();

			if (str == null) {
				System.out.println("------------------------------------파일읽기 완료");
				break;
			}
			
			System.out.println(str); // 읽기 출력

			//			bw.write(str);
//			bw.newLine();
		}

		// 스트림 종료
		bw.close();
		br.close();

		System.out.println("------------------------------------프로그램 종료");
	}
}
