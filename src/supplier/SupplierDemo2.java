/**
 * 
 */
package supplier;

import java.util.Arrays;
import java.util.List;

/**
 * @author r.a.ashok.kumbhar
 *
 */
public class SupplierDemo2 {
	public static void main(String[] args) {
		List<String> ls = Arrays.asList();

		String supplier = ls.stream().findAny().orElseGet(() -> "Hello rohit");

		System.out.println(supplier);
	}
}
