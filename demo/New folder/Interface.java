package demo;

public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sbi obj = new sbi();
		maharastrabank jac = new maharastrabank();
		obj.rate_of_interest();
		jac.rate_of_interest();
	}

}
interface bank{
	void rate_of_interest();
}
class sbi implements bank{
	public void rate_of_interest(){
		System.out.println("7.9%");
	}
}
class maharastrabank implements bank{
	public void rate_of_interest(){
		System.out.println("9.0%");
	}
}