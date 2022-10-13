package demo;
import java.util.Scanner;
public class Abstract_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		triangle obj = new triangle();
		obj.draw();
		obj.done();
		obj.non();
	}

}
abstract class shape {
	public abstract void draw() ;
	public void done() {
		System.out.println("shape is done !");
	}
}
class triangle extends shape{
	public void draw(){
		Scanner sc = new Scanner(System.in);
				sc.close();
		System.out.println("Draw a triangle");
	}
	void non() {
		System.out.println("non abstract method");
	}
}