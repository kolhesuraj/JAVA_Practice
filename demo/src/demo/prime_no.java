package demo;
import java.util.Scanner;
public class prime_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input, flag=2;
		Scanner sc = new Scanner(System.in);
		input = sc.nextInt();
		if (input == 2) {
			flag = 1;
		}
		else {
			for(int i = 2; i <= input-1; i++) 
			{
				if(input%i == 0) 
				{
					flag = 0;
					break;
				}
				else
				{
					flag = 1;
				}
			}
		}	
		if(flag == 1)
		{
			System.out.println("prime");
		}
		else
		{
			System.out.println("non-prime");
		}
		sc.close();
	}

}
