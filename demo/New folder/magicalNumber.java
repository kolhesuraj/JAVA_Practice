package demo;

import java.util.Scanner;

public class magicalNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		magicalNumber obj = new magicalNumber();		
		obj.getMagicalNumber();
		
	}
	
	void getMagicalNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int number = sc.nextInt();
		
		int length = 1 ,digit = 0 ,square = 0;
		
		for(int i = number; i >= 10 ;i = i / 10 )
		{
			length = length + 1;
		}

		if(length % 2 == 0) {
			for(int j = 0; j < length ; j++)
			{
				if( j % 2 == 0) {
					digit = number % 10;
					square = square + (digit * digit);
				}
				number = number / 10;
			}
		}
		else {
			for(int j = 0; j < length ; j++)
			{
				if( j % 2 != 0) {
					digit = number % 10;
					square = square + (digit * digit);
				}
				number = number / 10;
			}
		}

		if(square % 2 == 0) {
			System.out.println("Given number is Magical Number");
		}
		else {
			System.out.println("Given number is Not Magical Number");
		}
		sc.close();
		
	}
	
}
