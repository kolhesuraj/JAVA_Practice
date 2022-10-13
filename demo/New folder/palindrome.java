package demo;

import java.util.Scanner;

public class palindrome {
	public static void main(String[] args) {
		int r=2,n;
		System.out.println("enter sring");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println(str);
		n=str.length();
		System.out.println(n);
		int j = n-1;
		for(int i=0;i<=n/2;i++) {
			if(j>=i) {
				if(str.charAt(i)==str.charAt(j)) {
					r=0;
					j--;
				}
				else {
					r=1;
					break;			
				}
			}
		}
	if(r==0) {
		System.out.println("string is palidrome");
	}
	else {
		System.out.println("string is not palidrome");
	}
	sc.close();
}

}
