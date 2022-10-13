package demo;
import java.util.Scanner;

public class Float {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		float f1 = sc.nextFloat();
		float f2 = sc.nextFloat();
		sc.close();
		float f3 = f1+f2;
		System.out.println(f3+ "\n");
		float f4 = f1-f2;
		System.out.println(f4+ "\n");
	}

}
