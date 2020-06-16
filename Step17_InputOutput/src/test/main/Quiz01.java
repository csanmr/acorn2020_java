package test.main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		/*
		 * Scanner객체를 이용해서 문자열 한 줄을 입력받고
		 * c:/acorn2020/myFolder/quiz.txt 파일을 만들어서
		 * 해당 파일에 문자열을 저장해보세요.
		 */
		File QuizFile=new File("c:/acorn2020/myFolder/quiz.txt");
		boolean isExist=QuizFile.exists();
		System.out.println("문자열 입력 :");
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		try {
			if(!isExist) {
			QuizFile.createNewFile();
			}
			//파일에 문자열 넣을 객체
			FileWriter qz=new FileWriter(QuizFile, true); //append를 하려면 파일 뒤에 true도 넣어줘야함
			//qz.write(str); // write는 덮어쓰기 append는 이어서 붙여쓰기
			qz.append(str);//String은 CharSequence를 implements한 것이라 String은 CharSequence이기도 하다
			qz.append("\r\n");
			qz.flush();
			qz.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
