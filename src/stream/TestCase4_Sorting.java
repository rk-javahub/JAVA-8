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
public class TestCase4_Sorting {
	public static void main(String[] args) {
		List<Integer> ls = new ArrayList<Integer>();
		ls.add(12);
		ls.add(4);
		ls.add(26);
		ls.add(89);
		ls.add(104);
		ls.add(75);

		System.out.println("Natural sorting");
		List<Integer> ls1 = ls.stream().sorted().collect(Collectors.toList());
		System.out.println(ls1);

		System.out.println("Customized sorting");
		List<Integer> ls2 = ls.stream().sorted((i1, i2) -> -i1.compareTo(i2)).collect(Collectors.toList());
		System.out.println(ls2);
	}
}
