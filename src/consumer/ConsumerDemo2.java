/**
 * 
 */
package consumer;

import java.util.Arrays;
import java.util.List;

/**
 * @author r.a.ashok.kumbhar
 *
 */
public class ConsumerDemo2 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		list.stream().forEach((a) -> System.out.println(a));
	}
}
