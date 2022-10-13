package demo;

public class superkeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rabbit1 obj = new rabbit1();
		//obj.walk();
		//obj.run();
	}

}

class animal1{
	animal1(){
	System.out.println("I'm in Animal constructor");
	}
	int abc = 10;
	void walk() {
		System.out.println("walking");
	}	
}

class rabbit1 extends animal1{
	rabbit1() {
		super();
		System.out.println("I'm in Rabbit constructor");	
	}
	void run() {
		System.out.println("running fast");
		System.out.println(super.abc);
		super.walk();
	}
}

