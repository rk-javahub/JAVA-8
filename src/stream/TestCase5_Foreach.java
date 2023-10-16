/**
 * 
 */
package stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Rohit
 *
 */
public class TestCase5_Foreach {
	public static void main(String[] args) {
		System.out.println("---------------- Iterating over list using foreach -----------------------");
		List<String> ls = new ArrayList<String>();
		ls.add("Rohit");
		ls.add("Sachin");
		ls.add("Raju");
		ls.add("Pramod");
		ls.add("Santosh");
		ls.add("Pradip");

		System.out.println("List elements are: ");
		ls.stream().forEach(System.out::println);

		System.out.println("---------------- Iterating over map using foreach -----------------------");
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(7, "Rohit");
		map.put(17, "Sachin");
		map.put(27, "Santosh");
		System.out.println("Map elements are: ");
		map.forEach((key, value) -> System.out.println(key + " " + value));

	}
}
