package stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Employees {
	private String name;
	private String designation;
	private int salary;
	private String city;

	public Employees(String name, String designation, int salary, String city) {
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

public class SortingCustomObjectInMap {

	public static void main(String[] args) {
		Employee e = new Employee("Rohit", "Java Developer", 70000, "Pune");
		Employee e1 = new Employee("Sachin", "Manager", 90000, "Banglore");
		Employee e2 = new Employee("Vignesh", "Tester", 40000, "Pune");
		Employee e3 = new Employee("Radhika", "Java Developer", 70000, "Hyderabad");
		Employee e4 = new Employee("Aayush", "QA", 50000, "Chennai");
		Employee e5 = new Employee("Raj", "Analyst", 60000, "Pune");
		Employee e6 = new Employee("Ratan", "CEO", 5000000, "Banglore");

		Map<Employee, Integer> employees = new HashMap();
		employees.put(e, 27);
		employees.put(e1, 28);
		employees.put(e2, 26);
		employees.put(e3, 25);
		employees.put(e4, 29);
		employees.put(e5, 30);
		employees.put(e6, 31);

		employees.entrySet().stream().sorted((o1, o2) -> o1.getKey().getName().compareTo(o2.getKey().getName()))
				.forEach(System.out::println);
		
	
				


	}
}
