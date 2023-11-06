package stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
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
		Employees e = new Employees("Rohit", "Java Developer", 70000, "Pune");
		Employees e1 = new Employees("Sachin", "Manager", 90000, "Banglore");
		Employees e2 = new Employees("Vignesh", "Tester", 40000, "Pune");
		Employees e3 = new Employees("Radhika", "Java Developer", 70000, "Hyderabad");
		Employees e4 = new Employees("Aayush", "QA", 50000, "Chennai");
		Employees e5 = new Employees("Raj", "Analyst", 60000, "Pune");
		Employees e6 = new Employees("Ratan", "CEO", 5000000, "Banglore");

		List<Employees> employees = new ArrayList<Employees>();
		employees = (List<Employees>) Stream.of(e, e1, e2, e3, e4, e5, e6).collect(Collectors.toList());

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

		System.out.println(
				"--------------------------------------------------------------------------------------------------------------------------------------------------------");

		System.out.println("Employees sorting based on employee salary way 1: ");
		employees.stream().sorted(Comparator.comparingInt(Employees::getSalary)).forEach(System.out::println);

		System.out.println(
				"--------------------------------------------------------------------------------------------------------------------------------------------------------");

		System.out.println("Employees sorting based on employee name way 2 using method reference: ");
		employees.stream().sorted(Comparator.comparing(Employees::getName)).forEach(System.out::println);

		System.out.println(
				"--------------------------------------------------------------------------------------------------------------------------------------------------------");

		// Sorting Employee based on name descending
		System.out.println("Employees sorting based on employee name descending: ");
		employees.stream().sorted((o1, o2) -> o2.getName().compareTo(o1.getName())).forEach(System.out::println);

		System.out.println(
				"--------------------------------------------------------------------------------------------------------------------------------------------------------");

		// Get employees based on location and sort by salary ascending
		System.out.println("Get Employee based on lacation and sorting based on salary descending: ");
		employees.stream().filter(l -> l.getCity().equals("Pune"))
				.sorted(Comparator.comparingInt(Employees::getSalary).reversed()).forEach(System.out::println);

		// Group employees based on city

		System.out.println(
				"--------------------------------------------------------------------------------------------------------------------------------------------------------");

		System.out.println("Get Employees based on grouping by city: ");
		Map<Object, List<Employees>> employeesMap = employees.stream()
				.collect(Collectors.groupingBy(p1 -> p1.getCity()));
		System.out.println(employeesMap);

		System.out.println(
				"--------------------------------------------------------------------------------------------------------------------------------------------------------");

		System.out.println("Get Employees based on grouping by city and count: ");
		Map<Object, Long> employeesMap1 = employees.stream()
				.collect(Collectors.groupingBy(p1 -> p1.getCity(), Collectors.counting()));
		System.out.println(employeesMap1);

	}
}