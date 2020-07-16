package lambda_expression;

import java.util.Set;
import java.util.TreeSet;

public class TestCase8_TreeMapSortingDemo {

	public static void main(String[] args) {
		Set<Integer> ts = new TreeSet<Integer>((obj1, obj2) -> (obj1 > obj2) ? -1 : (obj1 < obj2) ? 1 : 0);
		ts.add(9);
		ts.add(7);
		ts.add(29);
		ts.add(5);
		ts.add(15);

		System.out.println(ts);
	}

}
