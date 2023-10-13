package lambda_expression;

interface Interf {
	public void m1();
}

class Demo implements Interf {

	@Override
	public void m1() {
		System.out.println("Method m1 called using traditional approach.");
	}
}

public class TestCase1_VoidMethodWithoutArgument {

	public static void main(String[] args) {
		// Calling m1() by using tradi̥tional approach (Till java 1.7)
		Interf i = new Demo();
		i.m1();

		// Calling m1() by using lambda expression (Java 1.8)
		// Demo class not required
		Interf i1 = () -> System.out.println("Method m1 called using lambda expression.");
		i1.m1();
	}
}
