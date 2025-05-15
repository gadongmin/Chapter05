package com.javaex.ex01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex02 {

	public static void main(String[] args) throws IOException {
		// I/O 스트림 준비
		InputStream in = new FileInputStream("C:\\javaStudy\\img.jpg");
		OutputStream out = new FileOutputStream("C:\\javaStudy\\buffimg.jpg");
		System.out.println("스트림 준비완료");

		byte[] buff = new byte[1024]; // 1024개를 담을 수 있는 그릇 만들기

		System.out.println("복사시작");
		while (true) {
			// int data = in.read();
			int data = in.read(buff); // 1024개의 데이터를 담을 수 있도록 설정 
			
			System.out.println(data);

			if (data == -1) {
				System.out.println("(-1) 복사끝");
				break;
			}
			out.write(buff); // 1024개를 담은 그릇을 빼도록 설정
		}

		// I/O 스트림 종료
		out.close();
		in.close();

		System.out.println("프로그램 종료");
	}

}
