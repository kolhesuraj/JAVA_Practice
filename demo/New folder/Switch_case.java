package demo;
import java.util.Scanner;
public class Switch_case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = 0;
		Scanner sc = new Scanner(System.in);
		Scanner sca = new Scanner(System.in);
		System.out.println("enter expression");
		int a = sc.nextInt();
		char mark = sca.next().charAt(0);
		int b = sc.nextInt();
		sc.close();
		sca.close();
		switch(mark) {
		case '+' :{
			result = a+b;
			break;
		}
		case '-' :{
			result = a-b;
			break;
		}
		case '*' :{
			result = a*b;
			break;
		}
		case '/' :{
			result = a/b;
			break;
		}
		case '%' :{
			result = a%b;
			break;
		}
		}
		System.out.println("Ans : " + result);
	}

}
