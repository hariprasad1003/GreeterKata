package greeterkata;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class GreeterTest {

	private Greeter greeter;
	private String name = "hari";
	
	@Before
	public void setUp(){
		greeter = new Greeter();
	}
	
	@Test
	public void greetHelloTest() {
		String greeting = greeter.greet(name);
		String expectedGreeting = GreeterConstants.GREETING_HELLO + " " + name;
		assertEquals(expectedGreeting, greeting);
	}
}