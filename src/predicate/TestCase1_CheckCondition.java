package predicate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class TestCase1_CheckCondition {

	public static void main(String[] args) {
		System.out.println("Check Number greater than 10 or not.");
		Predicate<Integer> pr = I -> (I > 10);
		System.out.println(pr.test(20));
		System.out.println(pr.test(7));

		System.out.println("\nCheck length of String greater than 3 or not.");
		Predicate<String> prs = s -> (s.length() > 3);
		System.out.println(prs.test("Hello"));
		System.out.println(prs.test("Hi"));

		System.out.println("\nCheck given collection is empty or not");
		Predicate<Collection<String>> prc = c -> (c.isEmpty());
		List<String> ls = new ArrayList<String>();
		System.out.println(prc.test(ls));
		ls.add("Rohit");
		System.out.println(prc.test(ls));
	}
}
