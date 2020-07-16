package date_and_time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDate_Demo {

	public static void main(String[] args) {

		LocalDate date = LocalDate.now();
		System.out.println("Current Date: " + date);
		System.out.println("Day of the Month: " + date.getDayOfMonth());
		System.out.println("Month value: " + date.getMonthValue());
		System.out.println("Get year: " + date.getYear());
		System.out.println("\n*********************************************************************************");
		System.out.println("Different Date Format");
		System.out.println(date.format(DateTimeFormatter.ofPattern("d-MM-yyyy")));
		System.out.println(date.format(DateTimeFormatter.ofPattern("MMM dd, yyyy")));
		System.out.println(date.format(DateTimeFormatter.ofPattern("yyyy.MM.dd")));
		System.out.println(date.format(DateTimeFormatter.ofPattern("EEE, MMM d, ''yy")));
		System.out.println(date.format(DateTimeFormatter.ofPattern("yyyy-MMM-dd(E)")));
		System.out.println(date.format(DateTimeFormatter.ofPattern("yyyyy.MMMMM.dd GGG")));
		System.out.println(date.format(DateTimeFormatter.ofPattern("EEE, d MMM yyyy")));
		System.out.println(date.format(DateTimeFormatter.ofPattern("MMM, yyyy")));

	}

}
