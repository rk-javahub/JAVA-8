package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Rohit
 *
 */
public class TestCase2_Map_Multiplication {

	public static void main(String[] args) {
		List<Integer> ls = new ArrayList<Integer>();
		ls.add(2);
		ls.add(4);
		ls.add(6);
		ls.add(8);
		ls.add(10);

		System.out.println("Mapping using java 1.7 version");
		mappingMultiplicationJava7(ls);
		System.out.println("Mapping using java 1.8 version");
		mappingMultiplicationJava8(ls);
	}

	/* Java 1.8 version implementation */
	private static void mappingMultiplicationJava8(List<Integer> ls) {
		List<Integer> ls1 = ls.stream().map(i -> i * 2).collect(Collectors.toList());
		System.out.println(ls1);
	}

	/* Java 1.7 version implementation */
	private static void mappingMultiplicationJava7(List<Integer> ls) {
		List<Integer> ls1 = new ArrayList<Integer>();
		for (int i : ls) {
			ls1.add(i * 2);
		}
		System.out.println(ls1);
	}
}
