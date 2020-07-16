package lambda_expression;

class Task implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.print("Child Thread");
			try {
				Thread.sleep(1555);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class TestCase5_MultithreadingRunnableInterface {

	public static void main(String[] args) {
		// Traditional approach
		/*
		 * Runnable r = new Task(); Thread t = new Thread(r); t.start(); }
		 */

		Runnable r1 = () -> {
			for (int i = 0; i < 5; i++) {
				System.out.println("Child thread");
				try {
					Thread.sleep(1555);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			;
		};

		Thread t1 = new Thread(r1);
		t1.start();
		for (int i = 0; i < 5; i++) {
			System.out.println("Main thread");
			try {
				Thread.sleep(1555);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
