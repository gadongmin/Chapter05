package com.javaex.ex01;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex03 {

	public static void main(String[] args) throws IOException {
		// 메인 스트림
		InputStream in = new FileInputStream("C:\\javaStudy\\img.jpg");
		OutputStream out = new FileOutputStream("C:\\javaStudy\\bufferedimg.jpg");

		// 보조 스트림
		BufferedInputStream bin = new BufferedInputStream(in); // in 메인 스트림에 연결
		BufferedOutputStream bout = new BufferedOutputStream(out); // out 메인 스트림에 연결

		System.out.println("스트림 준비완료");
		System.out.println("복사시작");
		while (true) {
			int data = bin.read();
			if (data == -1) {
				System.out.println("복사완료");
				break;
			}
			bout.write(data);
		}

		// 보조스트림(메인 포함) 종료
		bout.close();
		bin.close();
		System.out.println("프로그램 종료");
	}

}
