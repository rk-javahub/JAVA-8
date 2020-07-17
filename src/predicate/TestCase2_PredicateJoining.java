package predicate;

import java.util.function.Predicate;

public class TestCase2_PredicateJoining {

	public static void main(String[] args) {
		int num[] = { 4, 9, 7, 45, 36, 5, 17, 12, 14, 10 };
		// Predicate to check number greater than 15.
		Predicate<Integer> p1 = i -> i > 15;
		// Predicate to check even number.
		Predicate<Integer> p2 = i -> i % 2 == 0;

		// Method to check number greater than 15.
		System.out.print("Number greater than 15 are : ");
		m1(p1, num);
		System.out.print("\nNumber not greater than 15 are : ");
		m1(p1.negate(), num);
		System.out.print("\nNumber greater than 15 and Number is even : ");
		m1(p1.and(p2), num);
		System.out.print("\nNumber greater than 15 or Number is even : ");
		m1(p1.or(p2), num);
	}

	private static void m1(Predicate<Integer> p1, int[] num) {
		for (int x : num) {
			if (p1.test(x)) {
				System.out.print(x + " ");
			}
		}

	}

}
