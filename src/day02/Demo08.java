package day02;

import java.util.Scanner;

public class Demo08 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("请输入第一个数：");
		int num1=input.nextInt();
		System.out.println("请输入第二个数：");
		int num2=input.nextInt();
		System.out.println("请输入运算符：");
		String op1=input.next();
		/*switch(op1){
		case "+":
			System.out.println("计算结果为："+(num1+num2));
		case "-":
			System.out.println("计算结果为："+(num1-num2));
		case "/":
			System.out.println("计算结果为："+(num1/num2));
		case "*":
			System.out.println("计算结果为："+(num1*num2));
		}*/
	}
}
