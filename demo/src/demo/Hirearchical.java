package demo;

public class Hirearchical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		india obj = new india();
		austrelia vas = new austrelia();
		obj.match_type();
		obj.date();
		vas.match_type();
		vas.date();
	}

}
class cricket {
	void match_type() {
		System.out.println("ODI");
	};
}
class india extends cricket{
	void date() {
		System.out.println("INDIA-ENGLAND  \n 22-04-2025");
	}
}
class austrelia extends cricket{
	void date() {
		System.out.println("AUSTRELIA-SOUTH AFRICA \n 03-06-2024");
	}
}