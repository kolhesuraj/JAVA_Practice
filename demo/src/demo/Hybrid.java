package demo;

public class Hybrid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		teachers obj = new teachers();
		obj.name();
		obj.no();
		students var = new students();
		var.no_classes();
		var.no_students();
	}

}

class school{
	void name() {
		System.out.println("z.p. school");
		System.out.println("------------------------------------------------------------------");
	}
}
class teachers extends school{
	void no(){
		System.out.println("teachers - 13");
		System.out.println("------------------------------------------------------------------");
	}
}
class classes extends school{
	void no_classes() {
		System.out.println("classes - 10");
		System.out.println("------------------------------------------------------------------");
	}
}
class students extends classes{
	void no_students() {
		System.out.println("students - 92");
		System.out.println("------------------------------------------------------------------");
	}
}