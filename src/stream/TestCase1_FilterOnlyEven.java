package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Rohit
 *
 */
public class TestCase1_FilterOnlyEven {

	public static void main(String[] args) {
		List<Integer> ls = new ArrayList<Integer>();
		ls.add(12);
		ls.add(17);
		ls.add(22);
		ls.add(32);
		ls.add(47);

		System.out.println("Filtering using java 1.7 version");
		filterEvenInJava7(ls);
		System.out.println("Filtering using java 1.8 version");
		filterEvenInJava8(ls);
	}

	/* Java 1.8 version implementation */
	private static void filterEvenInJava8(List<Integer> ls) {
		List<Integer> ls1 = ls.stream().filter(i -> (i % 2 == 0)).collect(Collectors.toList());
		System.out.println(ls1);
	}

	/* Java 1.7 version implementation */
	private static void filterEvenInJava7(List<Integer> ls) {
		List<Integer> ls1 = new ArrayList<Integer>();
		for (int i : ls) {
			if (i % 2 == 0) {
				ls1.add(i);
			}
		}
		System.out.println(ls1);
	}
}
