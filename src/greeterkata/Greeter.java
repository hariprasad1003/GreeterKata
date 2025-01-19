package greeterkata;
import java.time.LocalTime;

public class Greeter {
	
	public static String getTrimmedName(String name) {
		String trimmedName = name.trim();
		return trimmedName;
	}
	
	public static String getFirstLetterCapitablizedName(String name) {
		String firstLetterCapitalized = name.substring(0, 1).toUpperCase();;
		String firstLetterCapitalizedName = firstLetterCapitalized + name.substring(1);
		return firstLetterCapitalizedName;
	}
	
	public static String getGreetingBasedOnTime() {
		String greetingBasedOnTime;
		LocalTime currentTime = LocalTime.now();
		if (currentTime.isAfter(LocalTime.of(6, 0)) && currentTime.isBefore(LocalTime.of(12, 0))) {
			greetingBasedOnTime = GreeterConstants.GREETING_GOOD_MORNING;
        } else if (currentTime.isAfter(LocalTime.of(18, 0)) && currentTime.isBefore(LocalTime.of(22, 0))) {
        	greetingBasedOnTime = GreeterConstants.GREETING_GOOD_EVENING;
        } else {
        	greetingBasedOnTime = GreeterConstants.GREETING_HELLO;
        }
		return greetingBasedOnTime;
	}
	
	public static String greet(String name) {
		String greeting;
		String trimmedName = getTrimmedName(name);
        
		return getGreetingBasedOnTime() + " " + getFirstLetterCapitablizedName(trimmedName);
	}
}