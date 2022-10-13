package demo;
import java.util.Scanner;

public class string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str = new String[5];
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < str.length; i++) {
			str[i] = sc.nextLine();
		}
		sc.close();
	}

}
