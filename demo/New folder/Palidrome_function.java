package demo;

import java.util.Scanner;

public class Palidrome_function {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter sring");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println(str);
		sc.close();
		Palidrome_function obj = new Palidrome_function();
		obj.Palindrom_check(str);
	}
	
	void Palindrom_check(String st) {
		int flag = 0;
		int n = st.length();
		n = n -1;
		for(int i = 0; i <= n/2; i++)
		{
			if(st.charAt(i) == st.charAt(n)) {
				n--;
				flag = 1;
			}
			else {
				flag = 0;
				break;
			}
		}
		if(flag == 1) {
			System.out.println(st+ " is Palindrome");
		}
		else {
			System.out.println(st+ " is not Palindrome");
		}
	}
}
	
	
//	 void check(String str) {
//		int  n;
//		n=str.length();
//		String rev;
//		System.out.println(n);
//		int k = n-1 ;
//		for(int i=0 ;i <= n ;i++) {
//			rev.charAt(i) = str.charAt(k);
//			k--;
////			if(k>=i) {
////				if(str.charAt(i) == str.charAt(k)) {
////					r=0;
////					k--;
////				}
////				else {
////					r=1;
////					break;			
////				}
////			}
//		}
//	if(str == rev) {
//		System.out.println("string is palidrome");
//	}
//	else {
//		System.out.println("string is not palidrome");
//	}
//	}
//}
