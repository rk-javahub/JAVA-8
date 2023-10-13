/**
 * 
 */
package consumer;

import java.util.function.Consumer;

/**
 * @author r.a.ashok.kumbhar
 *
 */
public class ConsumerDemo1 implements Consumer<Integer> {
	@Override
	public void accept(Integer a) {
		System.out.println("Printing : " + a);
	}

	public static void main(String[] args) {
		Consumer<Integer> consumer = (a) -> System.out.println("Printing : " + a);
		consumer.accept(10);
	}

}
