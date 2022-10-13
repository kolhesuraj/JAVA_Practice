package demo;

import java.util.Scanner;

public class Calculator_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = 0;
		char request ;
		Scanner sc = new Scanner(System.in);
		Scanner sca = new Scanner(System.in);
		do {
			System.out.println("enter expression");
			int a = sc.nextInt();
			char mark = sca.next().charAt(0);
			int b = sc.nextInt();
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
			System.out.println("Press 'y' for continue 'n' for exit");
			 request = sca.next().charAt(0);
		} while(request == 'y');
		sc.close();
		sca.close();
	}

}
