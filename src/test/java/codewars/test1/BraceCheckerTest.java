package codewars.test1;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

public class BraceCheckerTest {

	private BraceChecker braceChecker = new BraceChecker();
	String input = "()[";
	
	@Test
	public void inputShouldNotBeNull() {
		assertNull(input);
	}
	
	@Test
	public void inputShouldNotBeEmpty() {
		assertFalse(input != null);
	}

}
