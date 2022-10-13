package demo;

public class Interface_static {

	public static void main(String[] args) {
		sbi_branch obj = new sbi_branch();
		maharastra_bank jac = new maharastra_bank();
		obj.rate_of_interest();
		jac.rate_of_interest();
		banks.time();
	}

}
interface banks{
	void rate_of_interest();
	static void time() {
		System.out.println("minnimum 2 years");
	}
	default void a(){
		System.out.println("helloo");
	}
}
class sbi_branch implements banks{
	public void rate_of_interest(){
		System.out.println("7.9%");
	}
}
class maharastra_bank implements banks{
	public void rate_of_interest(){
		System.out.println("9.0%");
	}
}