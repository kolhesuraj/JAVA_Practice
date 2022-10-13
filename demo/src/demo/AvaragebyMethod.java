package demo;
import java.util.Scanner;
public class AvaragebyMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter numbers");
		Scanner sc = new Scanner(System.in);
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		int number3 = sc.nextInt();
		AvaragebyMethod object = new AvaragebyMethod();
		double avarage = object.avarage(number1,number2,number3);
		System.out.println("AVARAGE OF NUMBERS IS  " +String.format("%.2f" ,avarage));
		sc.close();
	}
	double avarage(int number1,int number2 ,int number3)
	{
		double avarage,roundoff;
		avarage = number1 + number2 + number3 ;
		avarage = avarage / 3 ;
		return avarage;
		
	}

}
