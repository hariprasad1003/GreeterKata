package greeterkata;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class GreeterTest {

	private Greeter greeter;
	
	@Before
	public void setUp(){
		greeter = new Greeter();
	}
	

	@Test
	/**
	 * Test function for first test case: Tests greet function receives the different inputs 
	 * and outputs "Hello <name>".
	 */
	public void greetHelloTest() {
		// System.out.println("greetHelloTest: \n");
		String[] names = {"Hari", "Divya", "Gokul", "Komala"};
		for (String name : names) {
			String greeting = greeter.greet(name);
			String expectedGreeting = GreeterConstants.GREETING_HELLO + " " + name;
			// System.out.println("Expected Greeting: " + expectedGreeting + "; " + "Resulting Greeting: " + greeting + "\n");
			assertEquals(expectedGreeting, greeting);
		}
	}

	@Test
	/**
	 * Test function for first test case: Tests greet function receives the different inputs 
	 * trims the input and outputs "Hello <name>".
	 */
	public void greetTrimsInputTest() {
		// System.out.println("greetTrimsInputTest: \n");
		String[] names = {" Hari    ", "    Divya", "  Gokul  ", "   Komala "};
		for (String name : names) {
			String greeting = greeter.greet(name);
			String expectedGreeting = GreeterConstants.GREETING_HELLO + " " + name.trim();
			// System.out.println("Expected Greeting: " + expectedGreeting + "; " + "Resulting Greeting: " + greeting + "\n");
			assertEquals(expectedGreeting, greeting);
		}
	}
}