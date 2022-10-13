package demo;

public class Abstract_cunstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		info obj = new info();
		obj.namS();
		obj.name();
		obj.population();
	}
	
}
abstract class place{
	void namS() {
		System.out.println("name -");
	}
	abstract void population();
	place(){
		System.out.println("in abstract method");
	}
}
class info extends place{
	void name(){
	System.out.println("Loni haveli");
	}
	void population() {
		System.out.println("25k");
	}
	info(){
		System.out.println("------------------------------------------------------------------");

	}

}