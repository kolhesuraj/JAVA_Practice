package demo;

public class Multilevel_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rabbit2 obj = new rabbit2();
		obj.walk();
		obj.run();
		obj.eat();
		rabbits obj2 = new rabbits();
		obj2.run();
		obj2.walk();
	}

}

class animals{
	void walk() {
		System.out.println("walking");
	}	
}

class rabbits extends animals{
	void run() {
		System.out.println("running fast");
	}
}

class rabbit2 extends rabbits{
	void eat() {
		System.out.println("eat carrot");
	}
}
