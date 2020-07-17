package predicate;

import java.util.function.Predicate;

/**
 * Program to chek name starts with letter "R"
 * 
 * @author Rohit
 *
 */
public class TestCase3_PredicateToCheckNameWithStartinLetterR {

	public static void main(String[] args) {
		String names[] = { "Sachin", "Akshay", "Pradip", "Rohit", "Raj", "Vijay", "Rasika" };

		// Predicate to check condition
		Predicate<String> p1 = str -> str.charAt(0) == 'R';

		System.out.println("Names starting with letter R are: ");
		m1(p1, names);

	}

	private static void m1(Predicate<String> p1, String[] names) {
		for (String name : names) {
			if (p1.test(name)) {
				System.out.print(name + " ");

			}
		}
	}
}
