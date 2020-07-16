package default_method;

interface Left {
	default void m1() {
		System.out.println("Left default method");
	}
}

interface Right {
	default void m1() {
		System.out.println("Right default method");
	}
}

public class MultipleInheritance_TestCase implements Left, Right {
	public void m1() {
		System.out.println("My own implementation");
		Left.super.m1();
		Right.super.m1();
	}

	public static void main(String[] args) {
		MultipleInheritance_TestCase test = new MultipleInheritance_TestCase();
		test.m1();
	}
}
