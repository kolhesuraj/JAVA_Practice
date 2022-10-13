package demo;

//*
//**
//***
//****
//*****
import java.util.Scanner;

public class pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input;
		Scanner sc = new Scanner(System.in);
		input = sc.nextInt();
		for(int i = 1;i <= input; i++)
		{
			for(int j = 1;j <= i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}
}
