package demo;
import java.util.Scanner;
public class Palindrome_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("How many string you want to enter");
		int n = input.nextInt();
		Scanner sc = new Scanner(System.in);
		String[] str = new String[n];
		System.out.println("Enter strings");
		for(int i = 0; i < str.length; i++) {
			str[i] = sc.nextLine();
		}
		Palindrome_array obj = new Palindrome_array(); 
		String[] result = obj.palindrome(str, n);
		System.out.print("Palindrome strings are : ");
		for(int i = 0; i < result.length; i++) {
			if(result[i] != null) {
				System.out.print(result[i] + " ");
			}
		}
		sc.close();
		input.close();
	}
	
	String[] palindrome(String[] array, int n) {
		String[] result = new String[n];
		int flag = 0,counter = 0;
		for(int i = 0; i < n; i++ ) {
			int k = array[i].length() - 1;
			for(int j = 0; j <= n/2; j++) {
				if(array[i].charAt(j) == array[i].charAt(k)) {
					k--;
					flag = 1;
				}
				else {
					flag = 0;
					break;
				}
			}
			if(flag == 1) {
				result[counter] = array[i];
				counter++;
			}
		}
		return result;
	}

}
