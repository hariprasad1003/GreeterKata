package greeterkata;

public class Greeter {
	
	public static String getFirstLetterCapitablizedName(String name) {
		String firstLetterCapitalized = name.substring(0, 1).toUpperCase();;
		String firstLetterCapitalizedName = firstLetterCapitalized + name.substring(1);
		return firstLetterCapitalizedName;
	}
	
	public static String getTrimmedName(String name) {
		String trimmedName = name.trim();
		return trimmedName;
	}
	
	public static String greet(String name) {
		String greeting;
		String trimmedName = getTrimmedName(name);		
		greeting =  GreeterConstants.GREETING_HELLO + " " + getFirstLetterCapitablizedName(trimmedName);
		return greeting;
	}
}