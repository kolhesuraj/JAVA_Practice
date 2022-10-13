package demo;

// Compile time Polymorphism

public class Method_overloding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 45 , b = 87;
		double j = 6543;
		float k = 23.69f , l = 89.32f;
		Method_overloding obj = new Method_overloding();
		obj.sum();
		int x = obj.sum(a);
		System.out.println("sum 2 is " +x);
		int e = obj.sum(a, b);
		System.out.println("sum 3 is " +e);
		double t = obj.sum(j);
		System.out.println("double sum 4 is " +t);
		float i = obj.sum(k, l);
		System.out.println("float sum 5 is " +i);
		System.out.println("\n THIS IS EXAMPLE OF COMPILE TIME POLYMORPHISM / METHOD OVERLODING");
	}
	void sum() {
		System.out.println("sum 1 is " +(90+36));
	}
	int sum(int a) {
		int c = 25;
		int d = 69;
		return (c+d);
	}
	int sum(int a, int b) {
		return (a+b);
	}
	double sum(double a) {
		double c = 32;
		return (a+c);
	}
	float sum(float g, float h) {
		return (g+h);
	}

}
