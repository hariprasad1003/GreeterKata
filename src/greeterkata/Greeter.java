package greeterkata;

public class Greeter {
	public static String greet(String name) {
		String greeting;
		String trimmedName = name.trim();
		greeting =  GreeterConstants.GREETING_HELLO + " " + trimmedName;
		return greeting;
	}
}