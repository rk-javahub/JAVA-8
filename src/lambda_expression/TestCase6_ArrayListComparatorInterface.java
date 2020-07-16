package lambda_expression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MyComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer ob1, Integer ob2) {

		if (ob1 > ob2) {
			return -1;
		} else if (ob1 < ob2) {
			return +1;
		} else
			return 0;
	}
}

public class TestCase6_ArrayListComparatorInterface {

	public static void main(String[] args) {
		List<Integer> al = new ArrayList<Integer>();
		al.add(7);
		al.add(12);
		al.add(5);
		al.add(2);
		al.add(10);

		// Traditional approach
		/*
		 * Collections.sort(al);
		 * 
		 * System.out.println("Natural sorting by using traditional way : " + al);
		 * 
		 * Collections.sort(al, new MyComparator());
		 * 
		 * System.out.println("Customized sorting by using traditional way : " + al);
		 */

		// Java 8 lambda expression approach

		System.out.println("Before sorting : " + al);

		Collections.sort(al, (ob1, ob2) -> (ob1 > ob2) ? -1 : (ob1 < ob2) ? 1 : 0);

		System.out.println("Afer sorting : " + al);
	}
}
