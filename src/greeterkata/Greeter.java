package greeterkata;
import java.time.LocalTime;

public class Greeter {
	
	// Function to trim the name
	public static String getTrimmedName(String name) {
		String trimmedName = name.trim();
		return trimmedName;
	}

	// Function to capitalize the first letter of the name
	public static String getFirstLetterCapitablizedName(String name) {
		String firstLetterCapitalized = name.substring(0, 1).toUpperCase();;
		String firstLetterCapitalizedName = firstLetterCapitalized + name.substring(1);
		return firstLetterCapitalizedName;
	}
	
	/*
	 *  Function to get the greeting based on the current time i.e. Good morning when the time is 06:00 - 12:00
	 *  Good evening when the time is 18:00 - 22:00
	 *  Good night when the time is 22:00 - 06:00
	 *  Hello when the time is 12:00 - 6:00
	 */
	public static String getGreetingBasedOnTime() {
		String greetingBasedOnTime;
		LocalTime currentTime = LocalTime.now();
		
		if (currentTime.isAfter(LocalTime.of(6, 0)) && currentTime.isBefore(LocalTime.of(12, 0))) {
			greetingBasedOnTime = GreeterConstants.GREETING_GOOD_MORNING;
        } else if (currentTime.isAfter(LocalTime.of(18, 0)) && currentTime.isBefore(LocalTime.of(22, 0))) {
        	greetingBasedOnTime = GreeterConstants.GREETING_GOOD_EVENING;
        } else if (currentTime.isAfter(LocalTime.of(22, 0)) || currentTime.isBefore(LocalTime.of(6, 0))) {
        	greetingBasedOnTime = GreeterConstants.GREETING_GOOD_NIGHT;
        } else {
        	greetingBasedOnTime = GreeterConstants.GREETING_HELLO;
        }
		
		return greetingBasedOnTime;
	}
	
	// The main function which return the greeting output
	public static String greet(String name) {
		String trimmedName = getTrimmedName(name);
		String greeting = getGreetingBasedOnTime();
		greeting = greeting + " " + getFirstLetterCapitablizedName(trimmedName);
		
		// Logs each time when the function called
		System.out.println("greet function called at " + LocalTime.now() + ". Input: " + name + ", Output: " + greeting);
		
		return greeting;
	}
}