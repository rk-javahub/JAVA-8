package stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Employee {
	private String name;
	private String designation;
	private int salary;
	private String city;

	public Employee(String name, String designation, int salary, String city) {
		super();
		this.name = name;
		this.designation = designation;
		this.salary = salary;
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", designation=" + designation + ", salary=" + salary + ", city=" + city
				+ "]";
	}

}

public class EmployeeManagementSystemUsingStream {

	public static void main(String[] args) {
		Employee e = new Employee("Rohit", "Java Developer", 70000, "Pune");
		Employee e1 = new Employee("Sachin", "Manager", 90000, "Banglore");
		Employee e2 = new Employee("Vignesh", "Tester", 40000, "Pune");
		Employee e3 = new Employee("Radhika", "Java Developer", 70000, "Hyderabad");
		Employee e4 = new Employee("Aayush", "QA", 50000, "Chennai");
		Employee e5 = new Employee("Raj", "Analyst", 60000, "Pune");
		Employee e6 = new Employee("Ratan", "CEO", 5000000, "Banglore");

		List<Employee> employees = new ArrayList<Employee>();
		employees = (List<Employee>) Stream.of(e, e1, e2, e3, e4, e5, e6).collect(Collectors.toList());

		// Get employees who have designation as Manager
		System.out.println("Employees with designation as Manager are: ");
		employees.stream().filter(p1 -> p1.getDesignation().equals("Manager")).collect(Collectors.toList())
				.forEach(System.out::println);

		System.out.println(
				"--------------------------------------------------------------------------------------------------------------------------------------------------------");
		// Get employees who have designation as Manager
		System.out.println("Employees from Pune city are: ");
		employees.stream().filter(p1 -> p1.getCity().equals("Pune")).collect(Collectors.toList())
				.forEach(System.out::println);

		System.out.println(
				"--------------------------------------------------------------------------------------------------------------------------------------------------------");
		// Get employees who's salary > 50000
		System.out.println("Employees who's salary > 50000 are: ");
		employees.stream().filter(p1 -> p1.getSalary() > 50000).collect(Collectors.toList())
				.forEach(System.out::println);
		System.out.println(
				"--------------------------------------------------------------------------------------------------------------------------------------------------------");
		// Get employees who's salary < 50000
		System.out.println("Employees who's salary < 50000 are: ");
		employees.stream().filter(p1 -> p1.getSalary() < 50000).collect(Collectors.toList())
				.forEach(System.out::println);
		System.out.println(
				"--------------------------------------------------------------------------------------------------------------------------------------------------------");
		// Get employees who are not Manager
		System.out.println("Employees who are not Managers: ");
		employees.stream().filter(p1 -> !p1.getDesignation().equals("Manager")).collect(Collectors.toList())
				.forEach(System.out::println);
		// display(p1.negate(), employees);
		System.out.println(
				"--------------------------------------------------------------------------------------------------------------------------------------------------------");

		// Sorting Employee based on name
		System.out.println("Employees sorting based on employee name way 1: ");
		employees.stream().sorted((o1, o2) -> o1.getName().compareTo(o2.getName())).forEach(System.out::println);

		System.out.println("Employees sorting based on employee name way 2 using method reference: ");
		employees.stream().sorted(Comparator.comparing(Employee::getName)).forEach(System.out::println);

		// Sorting Employee based on name descending
		System.out.println("Employees sorting based on employee name descending: ");
		employees.stream().sorted((o1, o2) -> o2.getName().compareTo(o1.getName())).forEach(System.out::println);

	}
}