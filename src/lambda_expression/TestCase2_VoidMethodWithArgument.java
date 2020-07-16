package lambda_expression;

interface Interf1 {
	public void add(int a, int b);
}

class Demo1 implements Interf1 {

	@Override
	public void add(int a, int b) {
		System.out.println("Using traditional approach sum=" + (a + b));
	}
}

public class TestCase2_VoidMethodWithArgument {

	public static void main(String[] args) {
		// Calling m1() by using traditional approach (Till java 1.7)
		Interf1 i = new Demo1();
		i.add(10, 20);

		// Calling m1() by using lambda expression (Java 1.8)
		Interf1 i1 = (a, b) -> System.out.println("Using lambda expression approach sum=" + (a + b));
		i1.add(10, 20);
		i1.add(100, 200);

	}
}
