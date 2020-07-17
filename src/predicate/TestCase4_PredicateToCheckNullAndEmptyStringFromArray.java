package predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Program to remove empty string and null values from array of String.
 * 
 * @author Rohit
 *
 */
public class TestCase4_PredicateToCheckNullAndEmptyStringFromArray {

	public static void main(String[] args) {
		String str[] = { "Solapur", "Pune", "", null, "Mumbai", "Kolhapur" };

		// Predicate to check empty string.
		Predicate<String> result = res -> res != null && res.length() != 0;

		System.out.println("List with no null and empty objects is: ");
		m1(result, str);
	}

	private static void m1(Predicate<String> pred, String[] str) {
		List<String> list = new ArrayList<String>();
		for (String str1 : str) {
			if (pred.test(str1)) {
				list.add(str1);
			}
		}
		System.out.println(list);
		// list.forEach(names -> System.out.println(names));
	}
}
