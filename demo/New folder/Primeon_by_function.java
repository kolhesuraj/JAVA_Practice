package demo;
import java.util.Scanner;
public class Primeon_by_function {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = new int[10];
		Primeon_by_function obj = new Primeon_by_function();
		Scanner sc = new Scanner(System.in);
		for(int i=0; i < 10; i++) {
			array[i]=sc.nextInt();
		}
		sc.close();
		int[] rime = obj.prime(array);
		for(int i = 0; i < rime.length; i++) {
			if(rime[i] != 0) {
				System.out.print(rime[i] + "\t");
			}
		}
	}
	
	int[] prime(int[] array) {
		int a[] = new int[10];
		int flag=0 , temp=0;
		for(int k=0; k<array.length; k++) {
			if (array[k] == 2) {
				temp = 1;
			}
			else {
				for(int i = 2; i <= array[k]-1; i++) 
				{
					if(array[k]%i == 0) 
					{
						temp = 0;
						break;
					}
					else
					{
						temp=1;
					}
				}
			}
			if(temp == 1) {
				a[flag]=array[k];
				flag = flag+1;
				temp=0;
			}
		}
		return a;
		
	}
}
