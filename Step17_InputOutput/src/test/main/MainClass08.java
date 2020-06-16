package test.main;

import java.io.File;

public class MainClass08 {
	public static void main(String[] args) {
		File myFile=new File("c:/");
		//File 객체 목록(File[])을 얻어내기
		File[] files=myFile.listFiles();
		//반복문 돌면서 하나씩 참조해서 작업해보기
		for(File tmp:files) {
			//만일 해당 파일 객체가 디렉토리면 [ ]로 묶어서
			if(tmp.isDirectory()) {
				System.out.println("["+tmp.getName()+"]");
			}else { // 파일이면 그냥 출력
				System.out.println(tmp.getName());
			}
		}
	}
}
