/**
 * 
 */
package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Rohit
 *
 */
public class TestCase4_MinAndMax {
	public static void main(String[] args) {
		List<Integer> ls = new ArrayList<Integer>();
		ls.add(12);
		ls.add(4);
		ls.add(26);
		ls.add(89);
		ls.add(104);
		ls.add(75);

		System.out.print("maximum number in list is := ");
		int max = ls.stream().max((i1, i2) -> i1.compareTo(i2)).get();
		System.out.println(max);

		System.out.print("Minimum number in list is := ");
		int min = ls.stream().min((i1, i2) -> i1.compareTo(i2)).get();
		System.out.println(min);
	}
}
