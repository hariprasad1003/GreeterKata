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
	

//	@Test
	/**
	 * First Test Case: Tests greet function receives the different inputs 
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

//	@Test
	/**
	 * Second test case: Tests greet function receives the different inputs 
	 * trims the input and outputs "Hello <name>".
	 */
	public void greetTrimsInputTest() {
		// System.out.println("greetTrimsInputTest: \n");
		String[] names = {" Hari    ", "    Divya", "  Gokul  ", "   Komala "};
		for (String name : names) {
			String greeting = greeter.greet(name);
			String expectedGreeting = GreeterConstants.GREETING_HELLO + " " + greeter.getTrimmedName(name);
			// System.out.println("Expected Greeting: " + expectedGreeting + "; " + "Resulting Greeting: " + greeting + "\n");
			assertEquals(expectedGreeting, greeting);
		}
	}
	
//	@Test
	/**
	 * Third test case: Tests greet function receives the different inputs 
	 * capitalize the first letter, trims the input and outputs "Hello <name>".
	 */
	public void greetCapitializeInputTest() {
		// System.out.println("greetCapitializeInputTest: \n");
		String[] names = {"haRi", "dIVYA", "Gokul", "komala"};
		for (String name : names) {
			String greeting = greeter.greet(name);
			String trimmedName = greeter.getTrimmedName(name);
			String expectedGreeting = GreeterConstants.GREETING_HELLO + " " + greeter.getFirstLetterCapitablizedName(trimmedName);
			// System.out.println("Expected Greeting: " + expectedGreeting + "; " + "Resulting Greeting: " + greeting + "\n");
			assertEquals(expectedGreeting, greeting);
		}
	}
	
//	@Test
	/**
	 * Fourth test case: Tests greet function receives the different inputs 
	 * capitalize the first letter, trims the input and outputs "Good morning <name>" if time between 06:00 - 12:00.
	 */
	public void greetGoodMorningTest() {
		// System.out.println("greetGoodMorningTest: \n");
		String name = "Jothi";
			String greeting = greeter.greet(name);
			String trimmedName = greeter.getTrimmedName(name);
			String expectedGreeting = GreeterConstants.GREETING_GOOD_MORNING + " " + greeter.getFirstLetterCapitablizedName(trimmedName);
			// System.out.println("Expected Greeting: " + expectedGreeting + "; " + "Resulting Greeting: " + greeting + "\n");
			assertEquals(expectedGreeting, greeting);
	}
	
	
// 	@Test
	/**
	 * Fifth test case: Tests greet function receives the different inputs 
	 * capitalize the first letter, trims the input and outputs "Good evening <name>" if time between 18:00 - 22:00.
	 */
	public void greetGoodEveningTest() {
		// System.out.println("greetGoodEveningTest: \n");
		String name = "Harish";
		String greeting = greeter.greet(name);
		String trimmedName = greeter.getTrimmedName(name);
		String expectedGreeting = GreeterConstants.GREETING_GOOD_EVENING + " " + greeter.getFirstLetterCapitablizedName(trimmedName);
		// System.out.println("Expected Greeting: " + expectedGreeting + "; " + "Resulting Greeting: " + greeting + "\n");
		assertEquals(expectedGreeting, greeting);
	}

	@Test
	/**
	 * Sixth test case: Tests greet function receives the different inputs 
	 * capitalize the first letter, trims the input and outputs "Good night <name>" if time between 18:00 - 22:00.
	 */
	public void greetGoodNightTest() {
		// System.out.println("greetGoodNightTest: \n");
		String name = "Ahamed";
		String greeting = greeter.greet(name);
		String trimmedName = greeter.getTrimmedName(name);
		String expectedGreeting = GreeterConstants.GREETING_GOOD_NIGHT + " " + greeter.getFirstLetterCapitablizedName(trimmedName);
		// System.out.println("Expected Greeting: " + expectedGreeting + "; " + "Resulting Greeting: " + greeting + "\n");
		assertEquals(expectedGreeting, greeting);
	}
}