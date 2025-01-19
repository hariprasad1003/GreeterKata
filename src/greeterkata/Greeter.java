package greeterkata;

public class Greeter {
	public static String greet(String name) {
		String greeting;
		greeting =  GreeterConstants.GREETING_HELLO + " " + name;
		return greeting;
	}
}