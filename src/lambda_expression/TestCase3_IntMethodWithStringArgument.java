package lambda_expression;

interface Interf2 {
	public int length(String s);
}

class Demo2 implements Interf2 {

	@Override
	public int length(String s) {
		return +s.length();
	}
}

public class TestCase3_IntMethodWithStringArgument {

	public static void main(String[] args) {
		// Calling length() by using traditional approach (Till java 1.7)
		Interf2 i = new Demo2();
		System.out.println("String length using traditional approach is " + i.length("Rohit"));

		// Calling m1() by using lambda expression (Java 1.8)
		Interf2 i2 = (s) -> {
			return s.length();
		};
		System.out.println(i2.length("Sachin"));
	}
}
