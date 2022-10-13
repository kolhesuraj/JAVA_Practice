package demo;

import java.util.Scanner;

public class Even_function {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = new int[10];
		Even_function obj = new Even_function();
		Scanner sc = new Scanner(System.in);
		for(int i=0; i < 10; i++) {
			array[i]=sc.nextInt();
		}
		sc.close();
		int[] rime = obj.even(array);
		for(int i = 0; i < rime.length; i++) {
			if(rime[i] != 0) {
				System.out.print(rime[i] + "\t");
			}
		}
	}
	int[] even(int[] array) {
		int j = 0;
		int[] k = new int[array.length];
		for(int i = 0; i < array.length; i++) {
			if(array[i] % 2 == 0) {
				k[j] = array[i];
				j++;
			}
		}
		return k;
	}

}
