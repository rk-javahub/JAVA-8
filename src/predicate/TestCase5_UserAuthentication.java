package predicate;

import java.util.Scanner;
import java.util.function.Predicate;

class User {
	private String username;
	private String password;

	public User(String username, String password) {
		super();
		this.setUsername(username);
		this.setPassword(password);
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}

public class TestCase5_UserAuthentication {
	public static void main(String[] args) {
		Predicate<User> p = user -> user.getUsername().equals("rohit") && user.getPassword().equals("abcd");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Username");
		String username = sc.next();
		System.out.println("Enter Password");
		String password = sc.next();
		sc.close();
		User user = new User(username, password);
		if (p.test(user)) {
			System.out.println("Authentication successfull..");
		} else {
			System.out.println("Authentication failed..");
		}
	}
}
