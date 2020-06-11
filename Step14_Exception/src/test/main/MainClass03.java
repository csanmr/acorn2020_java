package test.main;

import java.io.File;
import java.io.IOException;

/*
 * RuntimeException을 상송 받지 않은 Exception은
 * 반드시 try~catch 블럭으로 묶어서 예외 처리를 해야한다.
 */
public class MainClass03 {
	public static void main(String[] args) {
		System.out.println("main메소드가 시작되었습니다.");
		
		try {
			Thread.sleep(5000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		File f1=new File("c:/acorn2020/myFolder/test.txt");
		try {
			f1.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("main메소드가 종료되었습니다.");
	}
}
