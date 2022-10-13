package demo;

public class Single_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rabbit obj = new rabbit();
		obj.walk();
		obj.run();
	}

}

class animal{
	void walk() {
		System.out.println("walking");
	}	
}

class rabbit extends animal{
	void run() {
		System.out.println("running fast");
	}
}

