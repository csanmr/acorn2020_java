package test.main;

public class MainClass08 {
	public static void main(String[] args) {
		//Sting type의 메소드 사용해보기
		String str="abcde12345";
		//문자열의 길이
		int size=str.length();
		//5번째 인덱스의 문자 1개(char)
		char ch=str.charAt(5);
		//소문자를 모두 대문자로 변환환 문자열 얻어내기
		String result=str.toUpperCase();
		System.out.println(result);
	}
}
