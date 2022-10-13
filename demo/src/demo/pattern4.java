package demo;

//*
//* *
//* * *
//* * * *
//* * * * *

//* * * * *
//* * * *
//* * *
//* *
//*
import java.util.Scanner;
public class pattern4 {
	void reverse(int input){
		for(int i = input*2;i >= 1; i=i-2)
		{
			for(int j = i;j >= 1;j--)
			{
				if(j%2 == 0) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}
	void straight(int input) {
		for(int i = 1;i <= input*2; i=i+2)
		{
			for(int j = 1;j <= i+1;j++)
			{
				if(j%2 == 0) {
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		int input;
		Scanner sc = new Scanner(System.in);
		input = sc.nextInt();
		sc.close();
		pattern4 cl = new pattern4();
		cl.straight(input);
		System.out.println();
		cl.reverse(input);
	}
}
