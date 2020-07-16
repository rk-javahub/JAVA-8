package date_and_time;

import java.time.LocalTime;

public class LocalTime_Demo {

	public static void main(String[] args) {
	
		LocalTime localTime = LocalTime.now();
		System.out.println("Current time:" +localTime);
		System.out.println("Get Hour: "+localTime.getHour());
		System.out.println("Get Minuite: "+localTime.getMinute());
		System.out.println("Get Second: "+localTime.getSecond());
		System.out.println("Get Nanosecond: "+localTime.getNano());
		

	}
}
