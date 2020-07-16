package default_method;

interface interf {
	default void m1() {
		System.out.println("Default method");
	}
}

public class Test implements interf {
	public void m1() {
		System.out.println("My own implementation!!!");
	}

	public static void main(String[] args) {
		Test t = new Test();
		t.m1();
	}
}
