package demo;

import java.util.Scanner;

public class Short_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = new int[10] ;
		int i=0,j=0;
		int temp;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		for(i = 0; i < 10; i++) {
			array[i] = sc.nextInt();
		}
		sc.close();
		for(i=0 ;i < array.length-1; i++) {
			for(j= i+1; j < array.length; j++) {
				if(array[i] > array[j]) {
					temp = array[i] ;
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		for(int k=0; k< array.length; k++) {
			System.out.print(array[k]+" ");
		}
	}

}
