package lambda_expression;

import java.util.Map;
import java.util.TreeMap;

public class TestCase7_TreeSetSortingDemo {

	public static void main(String[] args) {
		Map<Integer, String> tm = new TreeMap<Integer, String>(
				(obj1, obj2) -> (obj1 > obj2) ? -1 : (obj1 < obj2) ? 1 : 0);
		tm.put(7, "Rohit");
		tm.put(2, "Akshay");
		tm.put(47, "Sachin");
		tm.put(25, "Ranjeet");

		System.out.println(tm);
	}

}
