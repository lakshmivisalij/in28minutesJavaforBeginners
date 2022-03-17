package Section12;

import java.time.LocalDate;

public class Notes {

	//Strings are immutable - use stringbuffer and stringbuilder instead
	// if not bothered about threading, use stringbuffer
	
	//Wrapper classes - use the valueOf instead of creating a new objects
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		
		System.out.println(today.getDayOfMonth());
		System.out.println(today.getYear());
		System.out.println(today.getDayOfYear());
		System.out.println(today.isLeapYear());
		System.out.println(today.lengthOfMonth());
		
		//LocalDate is immutable
		LocalDate newToday = today.plusDays(100);
		System.out.println(newToday);
	}
	
	//Notes - Exploring APIs
	//ctrl+shift+ t - opens opentype - search for the documentation
	//
}
