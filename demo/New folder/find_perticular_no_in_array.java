package demo;
import java.util.Scanner;
public class find_perticular_no_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int flag=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no. for finding in array");
		int search = sc.nextInt();
		int array[]= {12,25,36,8,24,5,72,43,96,121};
		for(int i=0 ;i <= array.length-1; i++) {
			if(array[i] == search) {
				System.out.println("no. found at " +(i+1)+ " position");
				flag = 1;
				break;
			}
		}
		if(flag == 0) {
			System.out.println("no. not found");
		}
		sc.close();
	}

}
