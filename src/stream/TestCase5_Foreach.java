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
public class TestCase5_Foreach {
	public static void main(String[] args) {
		List<Integer> ls = new ArrayList<Integer>();
		ls.add(12);
		ls.add(4);
		ls.add(26);
		ls.add(89);
		ls.add(104);
		ls.add(75);

		System.out.println("List elements are: ");
		ls.stream().forEach(System.out::println);

		System.out.println("List elements are: ");
		ls.stream().forEach(s -> System.out.println(s));
	}
}
