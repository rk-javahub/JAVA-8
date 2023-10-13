/**
 * 
 */
package supplier;

import java.util.function.Supplier;

/**
 * @author r.a.ashok.kumbhar
 *
 */
public class SupplierDemo {
	public static void main(String[] args) {
		Supplier<String> supplier = () -> {
			return "Hello Rohit";
		};

		System.out.println(supplier.get());
	}
}
