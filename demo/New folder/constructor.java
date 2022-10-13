package demo;

public class constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("i am in main");
			int a = 0;
			constructor obj = new constructor(a);
	}
	constructor(int a){
		System.out.println(a);
		 System.out.println("hello world in constructor");
	}

}
