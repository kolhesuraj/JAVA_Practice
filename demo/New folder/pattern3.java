package demo;

import java.util.Scanner;

public class pattern3 {

	 void pattern(int input) {
//		*
//		**
//		***
//		****
//		*****
			for(int i = 1;i <= input; i++)
			{
				for(int j = 1;j <= i;j++)
				{
					System.out.print("*");
				}
				System.out.println();
			}
	}
	
	void reverse(int input) {
//		*****
//		****
//		***
//		**
//		*
		for(int i = input;i >= 1; i--)
		{
			for(int j = i;j >= 1;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int input;
			Scanner sc = new Scanner(System.in);
			input = sc.nextInt();
		pattern3 pt = new pattern3();
		pt.pattern(input);
		System.out.println();
		pt.reverse(input);
		sc.close();
	}

}
