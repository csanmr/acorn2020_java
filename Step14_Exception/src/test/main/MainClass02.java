package test.main;

import java.util.Scanner;
/*
 *  RunTimeException을 상속 받은 Exception종류는
 *  try~ catch블럭으로 묶어주지 않아도 문법 오류가 발생하지 않는다
 *  따라서 필요시 선택적으로 try~catch블럭으로 묶어주면 된다
 */
public class MainClass02 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("나눌 수 입력");
		String inputNum1=scan.nextLine();
		System.out.println("나누어질 수 입력");
		String inputNum2=scan.nextLine();
		try {
			double num1=Double.parseDouble(inputNum1);
			double num2=Double.parseDouble(inputNum2);
			double result=num2/num1;
			/*
			 * 정수로 했을 때
			 *  int num1=Integer.parseInt(inputNum1);
			 *  int num2=Integer.parseInt(inputNum2);
			 *  
			 *  int result=num2/num1; //몫
			 *  int result=num2%num1; //나머지
			 *  System.out.println(num2+"를"+num1+"로 나눈 몫 :"+result);
			 *  System.out.println(num2+"를"+num1+"로 나눈 나머지 :"+result2);
			 */
			
			System.out.println(num2+"를"+num1+"로 나누면 :"+result);
		}catch(NumberFormatException nfe) {
			System.out.println("숫자로 입력해주세요");
		}catch(ArithmeticException ae) {
			System.out.println("0으론 못 나눠요");
		}catch(Exception e) {
			System.out.println("Exception이 발생했습니다.");
		}finally { //예외가 발생하던 안하던 반드시 실행이 보장되는 블럭
			System.out.println("무언가 마무리 작업을 해요");
		}
		System.out.println("main메소드가 종료됩니다.");
	}
}
