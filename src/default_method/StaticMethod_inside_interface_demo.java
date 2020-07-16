package default_method;

interface interf1 {
	public static void sum(int a, int b) {
		System.out.println("Sum is " + (a + b));
	}
}

public class StaticMethod_inside_interface_demo implements interf1 {

	public static void main(String[] args) {
		StaticMethod_inside_interface_demo obj = new StaticMethod_inside_interface_demo();
		// obj.sum(10, 20);
		// StaticMethod_inside_interface_demo.sum(10, 20);
		interf1.sum(10, 20);
	}
}
