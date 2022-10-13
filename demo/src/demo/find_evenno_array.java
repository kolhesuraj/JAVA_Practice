package demo;

import java.util.Scanner;

public class find_evenno_array {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = new int[10] ;
		int odd[] = new int[10];
		int i=0,j=0;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		for(i = 0; i < 10; i++) {
			array[i] = sc.nextInt();
		}
		sc.close();
		for(i = 0 ; i < array.length; i++) {
			if(array[i] % 2 == 0) {
				odd[j] = array[i];
				j++;
			}
		}
		for(i=0;i <= j-1; i++) {
			System.out.println(odd[i]);
		}

	}

}
